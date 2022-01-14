import java.util.Scanner;

public class Ascending {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Inisialisasi
        int a,b,swap;
        System.out.println("    Program Ascending 2 data");
        System.out.println("    ========================");

        // Mengambil inputan dari user
        System.out.print("Masukan data pertama : ");
        a = data.nextInt();
        System.out.print("Masukan data kedua : ");
        b = data.nextInt();

        // proses
        if (a>b) {
            swap = a;
            a = b;
            b = swap;
        }

        System.out.println("\n  ========================");
        System.out.println("Data pertama "+ a + " dan data kedua "+ b);

    }
    
}
