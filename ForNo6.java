import java.util.Scanner;

public class ForNo6 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program Penjumlahan deret aritmatika
        System.out.println("    Program Penjumlahan artimatika");
        System.out.println("    ==============================");

        // Inisialisasi
        int a,b,c,n,sn = 0, i;

        // mengambil Inputan dari user
        System.out.print("Masukan suku Pertama : ");
        a = data.nextInt();
        System.out.print("Masukan beda         : ");
        b = data.nextInt();
        System.out.print("jumlah suku ke-      : ");
        n = data.nextInt();

        System.out.print("\nDeret ke-"+n+" = ");
        System.out.print(a+",");       
        sn += a;
        // Proses
        for ( i = a ; i < n; i++) {
            c = a+b;
            a = c;
            System.out.print(c+",");
            sn = sn+c;
        }


        System.out.println("\nJumlah Suku ke-"+n+" = "+sn);
    }
}
