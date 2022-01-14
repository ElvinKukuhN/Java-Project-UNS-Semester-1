import java.util.Scanner;

public class PersamaanLinier {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        double x;
        System.out.println("Program Menghitung Persamaan Linier");
        System.out.println("===================================");
        // Mengambil Inputan dari User
        System.out.print("Masukan nilai a : ");
        a = data.nextInt();
        System.out.print("Masukan Nilai b : ");
        b = data.nextInt();

        // Perhitungan 
        x =(double) -b/a;

        // Output
        System.out.println("");
        System.out.printf("%dx + %d = 0 \n",a,b);
        System.out.printf("%dx = %d \n",a,b);
        System.out.printf("x = -%d / %d \n",b,a);
        System.out.printf("x = %.1f \n",x);

        
    }
    
}
