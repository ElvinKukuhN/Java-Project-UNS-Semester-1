import java.util.Scanner;

public class NilaiMaksimal {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("    Program Menentukan Nilai Maksimum");
        System.out.println("    =================================");

        System.out.print("Masukan Nilai A = ");
        a = data.nextInt();
        System.out.print("Masukan Nilai B = ");
        b = data.nextInt();
        System.out.print("Masukan Nilai C = ");
        c = data.nextInt();

        // Output
        System.out.println("Nilai maksimal dari "+a+","+b+","+c+" adalah "+ max(a, b, c));

    }

    public static int max(int a, int b, int c) {
        int max;

        if (a > b && a > c) {
            max = a;
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        return max;
    }
}
