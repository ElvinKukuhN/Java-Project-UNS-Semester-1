import java.util.Scanner;

public class ForNo4 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menghitung nilai rata2 n bilangan
        System.out.println("    Program menghitung mean");
        System.out.println("    =======================");

        // Inisialisasi
        int n,i;
        double hasil = 0, rata, bil;
        
        // Mengambil inputan dari user
        System.out.print("Masukan Banyak bilangan : ");
        n = data.nextInt();

        // Proses
        for ( i = 1; i <= n; i++) {
            System.out.print("Masukan Bilangan Ke-"+i+" : ");
            bil = data.nextDouble();
            hasil += bil;
        }
        rata = hasil/n;
        // Output
        System.out.println("\nJumlah bilangan = "+ hasil);
        System.out.println("Rata-rata = "+ rata);
    }
}
