import java.util.Scanner;

public class SnGeometri {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("    Program Jumlah deret Geometri");
        System.out.println("    ===============================\n");

        double a,r,n;

        System.out.print("Masukan Nilai a = ");
        a = data.nextDouble();
        System.out.print("Masukan Nilai r = ");
        r = data.nextDouble();
        System.out.print("Masukan Nilai n = ");
        n = data.nextDouble();

        System.out.printf("Jumlah S%.0f = %.1f",n ,Sn(a, r, n));

    }

    public static double Sn(double a, double r, double n) {
        int rn = 1;
        double i = n;
        while (i > 0) {
            rn *= r;
            i--;
        }

        double sn = a*(rn - 1) / (r -1);
        return sn;
    }
}
