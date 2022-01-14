import java.util.Scanner;

public class DeretGeometri {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menghitung jumlah deret geometri
        System.out.println("    Menghitung jumlah deret geometri");
        System.out.println("    ================================");

        // Inisialisasi
        int a,r,n,i,total = 0;

        // Mengambil inputan dari user
        System.out.print("Masukan suku pertama : ");
        a = data.nextInt();
        System.out.print("Masukan rasio        : ");
        r = data.nextInt();
        System.out.print("Masukan jumlah suku  : ");
        n = data.nextInt();

        // Proses
        System.out.print("Deretnya adalah = ");

        for (i = 1; i <= n; i++) {
            System.out.print(a+",");
            total += a;
            a = a*r;
        }


        // Output
        System.out.println("\nJumlah sukunya adalah = "+total);


    }
}
