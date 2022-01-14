import java.util.Scanner;

public class ForNo3 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Perulangan For no 3 latihan 1
        System.out.println("    Program Penjumlahan deret ke n pertama");
        System.out.println("    ======================================");

        // Inisialisasi
        int i,n,jumlah = 0;
        
        // Mengambil inputan dari user
        System.out.print("Masukan nilai N : ");
        n = data.nextInt();

        // Proses
        for ( i = 1; i <= n; i++) {
            jumlah += i;
        }

        // Output
        System.out.println("Jumlah = "+ jumlah);

    }   
}
