import java.util.Scanner;

public class GolonganGaji {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menghitung Golongan Gaji
        // Inisisalisasi
        char golongan;
        double gaji= 0;

        // Mengambil Inputan dari user
        System.out.print("Pilih Golongan 1 - 3 ==>");
        golongan = data.next(). charAt(0);

        // Proses
        switch (golongan) {
            case '1':
                gaji = 1000000;
                break;
            case '2':
                gaji = 2000000;
                break;
            case '3':
                gaji = 3000000-(3000000*0.02);
                break;
                
            default:
                System.out.println("INPUTAN SALAH!!!");
        }

        // output
        System.out.printf("Jumlah gaji dari golongan yang dipilih adalah %.01f ",gaji);
    }
    
}
