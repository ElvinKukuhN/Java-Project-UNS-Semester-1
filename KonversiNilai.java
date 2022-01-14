import java.util.Scanner;

public class KonversiNilai {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menentukan kelulusan
        // Inisialisasi
        int nilai;
        String status, grade;

        // Mengambil Inputan dari user
        System.out.print("Masukan Nilai ==> ");
        nilai = data.nextInt();

        // proses
        if (nilai >= 60) {
            status = "Lulus";
            if (nilai >=60 ) {
                grade = "Cukup";
            } else if (nilai >=70) {
                grade = "Baik";
            } else if (nilai <=100) {
                grade = "Sangat baik";
            } else {
                grade = "tidak ada";
            }
        }else {
            status="Tidak Lulus";
            grade= "Tidak ada";
        }

        // Output
        System.out.println("Status Mahasiswa : "+status+" dengan grade : "+grade);
    }
}
