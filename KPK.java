import java.util.Scanner;

public class KPK {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program mencari KPK dari 2 bilangan integer
        System.out.println("  Program mencari KPK");
        System.out.println("  ===================");

        // Inisialisasi
        int a,b,kpk = 0, i = 1;

        // mengambil inputan dari user
        System.out.print("Masukan Nilai a : ");
        a = data.nextInt();
        System.out.print("Masukan Nilai b : ");
        b = data.nextInt();

        // Proses
        while (i <= b) {
            kpk += a;
            if (kpk % b == 0) { 
                break;
            }
        }

        // Output
        System.out.println("KPK dari "+a+" dan "+b+" = "+kpk);

    }
}
