import java.util.Scanner;

public class XpangkatY {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menghitung nilai pangkat
        System.out.println("    Menghitung nilai pangkat");
        System.out.println("    ========================");

        // Inisialisasi
        int a,b,i,hasil = 1;


        // Mengambil inputan dari user  
        System.out.print("Masukan Angka   : ");
        a = data.nextInt();
        System.out.print("Masukan pangkat : ");
        b = data.nextInt();

        // Proses
        for ( i = 1; i <= b ; i++) {
        hasil = hasil*a;
        }

        System.out.println("hasil dari "+a+ " pangkat "+b+" = "+ hasil);


    }
}
