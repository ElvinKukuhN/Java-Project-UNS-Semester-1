import java.util.Random;
import java.util.Scanner;

public class Suit {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("    Permainan Suit");
        System.out.println("    ==============");

        // Inisialisasi
        int player, comp;
        String hasil= null;
        boolean ulang = true;
        char tanya;

        while (ulang) {
            // Pilihan Player
            System.out.println("Masukan Pilihanmu (1 = gunting, 2 = batu, 3 = kertas)");
            System.out.print("    -->");
            player = data.nextInt();

            // pilihan komputer
            comp =1 + random.nextInt(3);
        
            // Rules
            if (player == comp) {
                System.out.println("Kedua Pemain Memilih "+player);
                hasil = "SERI";
            } else if (player == 1) {
                if (comp == 2) {
                    System.out.println("Komputer memilih Batu");
                    hasil = "KAMU KALAH";
                } else if (comp == 3) {
                    System.out.println("Komputer memilih Kertas");
                    hasil = "KAMU MENANG";
                }  
            } else if (player == 2) {
                if (comp == 1) {
                    System.out.println("Komputer memilih Gunting");
                    hasil = "KAMU MENANG";
                } else if (comp == 3) {
                    System.out.println("Komputer memilih Kertas");
                    hasil = "KAMU KALAH";
                }
            }else if (player == 3) {
                if (comp == 1) {
                    System.out.println("Komputer memilih Gunting");
                    hasil = "KAMU KALAH";
                } else if (comp == 2 ) {
                    System.out.println("Komputer memilih Batu");
                    hasil = "KAMU MENANG";
                }
            } else {
                hasil = "INPUTAN SALAH !!!";
            }

            System.out.println(hasil);

            System.out.println("Apakah Kamu ingin Bermain lagi? (y/n)");
            System.out.print("    -->");
            tanya = data.next(). charAt(0);

            if (tanya == 'y') {
                ulang = true;
            }else { 
                ulang = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }
    }
}
