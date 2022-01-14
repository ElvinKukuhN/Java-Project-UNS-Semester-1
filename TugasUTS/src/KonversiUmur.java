import java.util.Scanner;

public class KonversiUmur {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // program Menentukan konversi umur
        // Inisialisasi
        int tgl_lahir, bln_lahir, thn_lahir;
        int tgl_skrng, bln_skrng, thn_skrng;
        int thn, bln1, bln2, tgl1, tgl2;

        // Mengambil Inputan dari user
        System.out.println("Input Kelahiran --> \n=============== ");
        System.out.print("  Tahun lahir     : ");
        thn_lahir = input.nextInt();
        System.out.print("  Bulan lahir     : ");
        bln_lahir = input.nextInt();
        System.out.print("  Tanggal lahir   : ");
        tgl_lahir = input.nextInt();
        System.out.println("Input Sekarang --> \n=============== ");
        System.out.print("  Tahun sekarang      : ");
        thn_skrng = input.nextInt();
        System.out.print("  Bulan sekarang      : ");
        bln_skrng = input.nextInt();
        System.out.print("  Tanggal sekarang    : ");
        tgl_skrng = input.nextInt();

        // Proses
        thn = thn_skrng - thn_lahir;
        bln1 = bln_skrng - bln_lahir;
        bln2 = bln_lahir - bln_skrng;
        tgl1 = tgl_skrng - tgl_lahir;
        tgl2 = tgl_lahir - tgl_skrng;

        // output
        if (thn_skrng > thn_lahir && bln_skrng >= bln_lahir && tgl_skrng >= tgl_lahir) {
            System.out.println("Umur anda : "+thn+" Tahun "+bln1+" Bulan "+tgl1+" Hari");
        } else  if (thn_skrng > thn_lahir && bln_lahir >= bln_skrng && tgl_lahir >= tgl_skrng) {
            System.out.println("Umur anda : "+thn+" Tahun "+bln2+" Bulan "+tgl2+" Hari");
        } else  if (thn_skrng > thn_lahir && bln_skrng >= bln_lahir && tgl_lahir >= tgl_skrng) {
            System.out.println("Umur anda : "+thn+" Tahun "+bln1+" Bulan "+tgl2+" Hari");
        } else  if (thn_skrng > thn_lahir && bln_lahir >= bln_skrng && tgl_skrng >= tgl_lahir) {
            System.out.println("Umur anda : "+thn+" Tahun "+bln2+" Bulan "+tgl1+" Hari");
        } else {
            System.out.println("Data yang anda masukan salah");
        }
    }
    
}
