import java.util.Scanner;

public class VolumedanLuasPermukaanTabung {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        double r,t,v,L;
        final double Phi = 3.14;
        System.out.println("Program Menghitung Volume dan Luas Permukaan Tabung");
        System.out.println("===================================================");

        // Mengambil Inputan dari user
        System.out.print("Masukan jari-jari : ");
        r = data.nextDouble();
        System.out.print("Masukan Tinggi : ");
        t = data.nextDouble();

        // Perhitungan
        v = Phi*r*r*t;
        L = 2*Phi*r*(r+t);

        // Output
        System.out.println("");
        System.out.printf("Volume = %.2f x %.0f^2 x %.0f \n Volume = %.2f \n",Phi,r,t,v);
        System.out.printf("Luas Permukaan = 2 x %.2f x %.0f(%.0f + %.0f) \n Luas Permukaan = %.2f \n",Phi,r,r,t,L);

    }
    
}
