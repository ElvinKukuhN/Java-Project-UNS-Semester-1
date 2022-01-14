import java.util.Scanner;

public class ForNo7 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program mengkalikan n Bilangan inputan
        System.out.println("    Program mengkalikan n bilangan");
        System.out.println("    ==============================");

        // Inisialisasi
        int n,i,hasil= 1, bil;
        
        // Mengambil inputan dari user
        System.out.print("Masukan banyak bilangan : ");
        n = data.nextInt();
        System.out.println("");

        // Proses
        for ( i = 1; i <= n; i++) {
            System.out.print("Masukan bilangan ke-"+i+" = ");
            bil = data.nextInt();
            hasil *= bil;
        }

        System.out.println("\nHasil perkalian bilangan = "+hasil);
    }
}
