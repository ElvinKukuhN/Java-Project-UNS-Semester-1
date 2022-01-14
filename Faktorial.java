import java.util.Scanner;

public class Faktorial {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        System.out.println("    Program menghitung faktorial");
        System.out.println("    ============================");

        System.out.print("Masukan Nilai = ");
        a =  data.nextInt();
        System.out.println("");

        System.out.println("nilai dari "+a+"! = "+ Fakto(a));
    }

    public static int Fakto(int a) {
        int f = 1;


        for ( int i = a; i > 0; i--) {
            System.out.print(i+",");
            f = f * i;
        }
        System.out.println("");

        return f;
    }
}
