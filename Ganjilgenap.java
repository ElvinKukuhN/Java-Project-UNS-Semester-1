import java.util.Scanner;

public class Ganjilgenap {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program Menentukan ganjil genap bilangan positif
        // inisialisasi 
        int nilai;
        String hasil;
        System.out.println("    Program Penentuan Ganjil Genap");
        System.out.println("    ==============================");

        // Mengambil inputan dari user
        System.out.print("Masukan Nilai : ");
        nilai = data.nextInt();

        // proses
        if (nilai > 0) {
            if ((nilai % 2) == 0) {
                hasil = "Genap";
            }else {
                hasil = "Ganjil";
            }
        } else {
            if (nilai == 0) {
                hasil = "Bukan Ganjil Maupun Genap";
            } else {
                hasil = "Bilangan Negatif";
            }
        }

        // output
        System.out.println(nilai + " Adalah " + hasil);
        
    }
    
}
