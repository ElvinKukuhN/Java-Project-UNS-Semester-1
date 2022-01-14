import java.util.Scanner;

public class NilaiMaksimum {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menentukan nilai maksimum
        // Inisialisasi
        int a,b,c,max;
        System.out.println("    Program Menentukan Nilai Maksimum");
        System.out.println("    =================================");

        // mengambil inputan dari user
        System.out.print("Masukan Nilai A : ");
        a = data.nextInt();
        System.out.print("Masukan Nilai B : ");
        b = data.nextInt();
        System.out.print("Masukan Nilai C : ");
        c = data.nextInt();

        // Proses
        if (a > b && a > c) {
            max = a;
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        // Output\
        System.out.println("    =================================");
        System.out.printf("Nilai maksimalnya adalah %d",max );
         
    }
}
