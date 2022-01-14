import java.util.Scanner;

public class Tugas4_V3421039 {
    static Scanner data = new Scanner(System.in);
    
    public static void main(String[] args) {

        // Variabel
        String nim,nama,umur;
        int tahunLahir;
        double tinggiBadan;
        char jenisKelamin;
        boolean aktif;

        // Mengambil Inputan dari user
        System.out.print("Masukan Nama Anda : ");
        nama = data.nextLine();
        System.out.print("Masukan NIM Anda : ");
        nim = data.nextLine();
        System.out.print("Masukan Umur Anda : ");
        umur = data.nextLine();
        System.out.print("Masukan Tahun Lahir Anda : ");
        tahunLahir = data.nextInt();data.nextLine();
        System.out.print("Masukan Tinggi Badan Anda (M) : ");
        tinggiBadan = data.nextDouble();data.nextLine();
        System.out.print("Masukan Jenis Kelamin Anda (L/K) : ");
        jenisKelamin = data.next().charAt(0);data.nextLine();
        System.out.print("Masukan Status Anda : ");
        aktif = data.nextBoolean();data.nextLine();

        // Output
        System.out.println("============================");
        System.out.println("Data Mahasiswa");
        System.out.println("NIM             : " + nim);
        System.out.println("Nama Lengkap    : " + nama);
        System.out.println("Tahun Lahir     : " + tahunLahir);
        System.out.println("Umur            : " + umur + " Tahun");
        System.out.println("Tinggi Badan    : " + tinggiBadan);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Mahasiswa Aktif : " + aktif);

        
    }
}
