import java.util.Scanner;

public class Matrix2Dimensi {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int i,j,k,jumlah =0, max = 4;
        int [][]A = new int [max][max];
        int [][]B = new int [max][max];
        int [][]C = new int [max][max];
        int [][]D = new int [max][max];

        // Input
        System.out.println("--------matrix A------");
        for ( i = 1; i < max; i++) {
            for ( j = 1; j < max; j++) {
                System.out.print("A[" +i+ "] [" +j+ "] :" );
                A[i][j] = data.nextInt();
            }
        }
        System.out.println("--------matrix B------");
        for ( i = 1; i < max; i++) {
            for ( j = 1; j < max; j++) {
                System.out.print("B[" +i+ "] [" +j+ "] :" );
                B[i][j] = data.nextInt();
            }
        }

        // proses hitung
        // Penjumlahan
        for ( i = 1; i < max; i++) {
            for ( j = 1; j < max; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Perkalian
        for (i = 1; i < max; i++) {
            for (j = 1; j < max; j++) {
              for (k = 0; k < max; k++) {
                jumlah = jumlah + A[i][k] * B[k][j];
              }
              D[i][j] = jumlah;
              jumlah = 0;
            }
        }


        // Output
        System.out.println("----Cetak matrix A----");    
        System.out.println("Matrix A : ");    
        for ( i = 1; i < max; i++) {
            System.out.print("| ");        
            for ( j = 1; j < max; j++) {
            System.out.print(A[i][j]+" ");
            }
        System.out.print("|");
        System.out.print("\n");
        }

        System.out.println("----Cetak matrix B----");    
        System.out.println("Matrix B : ");    
        for ( i = 1; i < max; i++) {
            System.out.print("| ");        
            for ( j = 1; j < max; j++) {
            System.out.print(B[i][j]+" ");
            }
        System.out.print("|");
        System.out.print("\n");
        }

            // Penjumlahan matrix
        System.out.println("\n----PENJUMLAHAN MATRIX----");    
        System.out.println("----Cetak matrix C = A+B----");    
        System.out.println("Matrix C : ");    
        for ( i = 1; i < max; i++) {
            System.out.print("|  ");        
            for ( j = 1; j < max; j++) {
            System.out.print(C[i][j]+"\t");
            }
        System.out.print("|");
        System.out.print("\n");
        }

            // Perkalian matrix
        System.out.println("\n----PERKALIAN MATRIX----");    
        System.out.println("----Cetak matrix D = AxB----");    
        System.out.println("Matrix D : ");    
        for ( i = 1; i < max; i++) {
            System.out.print("|  ");        
            for ( j = 1; j < max; j++) {
            System.out.print(D[i][j]+"\t");
            }
        System.out.print("|");
        System.out.print("\n");
        }

    }
}
