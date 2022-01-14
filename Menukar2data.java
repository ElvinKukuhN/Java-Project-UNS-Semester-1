import java.util.Scanner;

public class Menukar2data {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Program Menukar 2 buah bilangan");
        System.out.println("===============================");

        // Input
        System.out.print("Masukan nilai A : ");
        a = data.nextInt();

        System.out.print("Masukan nilai B : ");
        b = data.nextInt();

        // Proses
        c = a;
        a = b;
        b = c;

        // Outpput
        System.out.println("");
        System.out.println("Nilai A : " + a);
        System.out.println("Nilai B : " + b);

        
    }
    
}
