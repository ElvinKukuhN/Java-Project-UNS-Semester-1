import java.util.Scanner;

public class FPB {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menghitung FPB dari 2 bilangan
        System.out.println("    Program menghitung FPB");
        System.out.println("    ======================");

        // Inisialisasi
        int a,b,fpb;

        // Mengambil inputan dari user
        System.out.print("Masukan Nilai a : ");
        a = data.nextInt();
        System.out.print("Masukan Nilai b : ");
        b = data.nextInt();

        do {
            fpb = a % b;
            a = b;
            b = fpb;
        } while (b != 0);

        fpb = a;

        // Output
        System.out.println("FPB dari kedua nilai diatas = "+fpb);
        
    }
}

