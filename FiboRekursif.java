import java.util.Scanner;

public class FiboRekursif {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {

        int a,i,hasil;

        System.err.println("    Program Deret Fibonacci");
        System.err.println("    ======================\n");

        System.out.print("Masukan deret ke- = ");
        a = data.nextInt();
        
        for ( i = 0; i < a; i++) {
            hasil = fiboRekursif(i);
            System.out.print(hasil + " ");
        }
        
    }

    public static int fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fiboRekursif(n - 1) + fiboRekursif(n - 2);


    }
}
