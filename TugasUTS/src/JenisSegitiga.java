import java.util.Scanner;

public class JenisSegitiga {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Program Menentukan jenis segitiga
        // Inisialisasi
        int sisiA, sisiB, sisiC;
        boolean siku1, siku2, siku3;
        String jenis;

        // Mengambil inputan dari user
        System.out.println("    Penentuan Jenis Segitiga");
        System.out.println("    ========================");
        System.out.print("Masukan Sisi A : ");
        sisiA = input.nextInt();
        System.out.print("Masukan Sisi B : ");
        sisiB = input.nextInt();
        System.out.print("Masukan Sisi C : ");
        sisiC = input.nextInt();

        // Proses
        siku1 = (sisiA*sisiA) == (sisiB*sisiB) + (sisiC*sisiC);
        siku2 = (sisiB*sisiB) == (sisiA*sisiA) + (sisiC*sisiC);
        siku3 = (sisiC*sisiC) == (sisiB*sisiB) + (sisiA*sisiA);

        if (sisiA == sisiB && sisiB == sisiC && sisiC == sisiA) {
            jenis = "Sama Sisi";
        } else if (sisiA == sisiB || sisiB == sisiC || sisiC == sisiA) {
            jenis = "Sama Kaki";
        } else if (siku1 || siku2 || siku3) {
            jenis = "Siku Siku";
        } else {
            jenis = "Sebarang";
        }

        // Output
        System.out.println("Ini adalah Segitiga "+jenis);
    }
}
