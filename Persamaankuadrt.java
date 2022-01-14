import java.util.Scanner;

public class Persamaankuadrt {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,c,D,x1,x2;
        System.out.println("Program Menghitung persamaan kuadrat");
        System.out.println("====================================");

        // Mengambil Inputan dari user
        System.out.print("Masukan Nilai a : ");
        a = data.nextDouble();
        System.out.print("Masukan Nilai b : ");
        b = data.nextDouble();
        System.out.print("Masukan Nilai c : ");
        c = data.nextDouble();

        // Perhitungan
        D = (b*b) - (4*a*c);
        x1 = (-b + Math.sqrt(D)) / 2*a;
        x2 = (-b - Math.sqrt(D)) / 2*a;

        // Output
        System.out.println("");
        if (a == 1) {
            System.out.printf("x^2 + %.0fx + %.0f = 0 \n",b,c);
        } else {
            System.out.printf("%.0fx^2 + %.0fx + %.0f = 0 \n",a,b,c);
        }
        
        if (D < 0) {
            System.out.println("Akar imajiner");
            System.out.println("Definit Negatif");
        }else if (D == 0){
            System.out.printf("x1 = x2 = %.2f",x1,x2);
            System.out.println("berakar sama");
            System.out.println("Definit Positif");
        }else {
            System.out.printf("x1 = %.2f dan x2 = %.2f",x1,x2);
            System.out.printf("Definit Positif");
        }        
    }
}
