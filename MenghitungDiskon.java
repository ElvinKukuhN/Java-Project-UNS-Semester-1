import java.util.Scanner;

public class MenghitungDiskon {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program Menghitung diskon
        // Inisialisasi
        double jmlUang,diskon,hargaStlhDiskon;
        System.out.println("    Program Menghitung diskon");
        System.out.println("    ========================");
        System.out.println("");

        // mengambil input
        System.out.print("Masukan jumlah uang : ");
        jmlUang = data.nextDouble();
        
        // proses
        if (jmlUang >= 100000) {
            diskon = 0.10 * jmlUang;
        }else if (jmlUang >= 50000) {
            diskon = 0.05 * jmlUang;
        }else {
            diskon= 0;
        }
        
        hargaStlhDiskon = jmlUang - diskon;

        // output
        System.out.println("");
        System.out.println("    =======================");
        System.out.printf("Harga sebelum diskon  : Rp %.2f \n",jmlUang);
        System.out.printf("Diskon yang didapat  : Rp %.2f \n",diskon);
        System.out.printf("Harga setelah diskon : Rp %.2f \n ",hargaStlhDiskon);
    }
    
}
