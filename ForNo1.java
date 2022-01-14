import java.util.Scanner;

public class ForNo1 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Perulangan for no 1 latihan 1\
        System.out.println("    Program perulangan");
        System.out.println("    ==================");
        // inisialisasi
        int a,b,i;

        // Mengambil inputan dari user
        System.out.print("Masukan Nilai a : ");
        a = data.nextInt();
        System.out.print("Masukan Nilai b : ");
        b = data.nextInt();

        // proses
        for ( i = a; i <=b ; i++) {
            System.out.print(i+",");
        }

    }
}
