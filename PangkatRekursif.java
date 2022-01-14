import java.util.Scanner;

public class PangkatRekursif {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int x,y;

        System.out.println("    Program Pangkat Rekursif");
        System.out.println("    ========================\n");

        System.out.print("Masukan Nilai X = ");
        x = data.nextInt();
        System.out.print("Masukan Nilai Y = ");
        y = data.nextInt();
        
        System.out.println(x + "^" + y + " = " + pangkatRekursif(x, y));

    }

    public static int pangkatRekursif(int x , int y) {
        if (y == 0) {
            return 1;
        }
        else {
            return x*pangkatRekursif(x, y - 1);
        }
    }
}
