import java.util.Scanner;

public class NilaiAbs {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        System.out.print("Masukan Sebuah Angka = ");
        a = data.nextInt();
        System.out.println("Nilai Absolut dari "+a+" adalah "+absolut(a));
    }
    public static int absolut(int a) {
        int hasil;
        hasil = Math.abs(a);
        return hasil;
    }
}
