import java.util.Scanner;

public class SnAritmatika {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("    Program Jumlah deret Aritmatika");
        System.out.println("    ===============================\n");

        double a,b,n;

        System.out.print("Masukan Nilai a = ");
        a = data.nextDouble();
        System.out.print("Masukan Nilai b = ");
        b = data.nextDouble();
        System.out.print("Masukan Nilai n = ");
        n = data.nextDouble();

        System.out.printf("Jumlah S%.0f = %.1f",n ,Sn(a, b, n));

    }

    public static double Sn(double a, double b, double n) {
        double sn = (n/2*(2*a+(n-1)*b));
        return sn;
    }
}
