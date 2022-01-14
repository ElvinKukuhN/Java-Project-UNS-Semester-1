import java.util.Scanner;

public class KonversiSuhu {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program Menentukan Konversi suhu
        // Inisialisasi
        double suhu, kelvin,fahrenheit,reamur;
        char hasil;
        System.out.println("    Program Konversi Suhu");
        System.out.println("    =====================");

        // Mengambil inputan dari user
        System.out.print("Masukan Suhu (C) : ");
        suhu = data.nextDouble();
        
        System.out.println("\nPilih angka Konversi!!!");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("-->");
        hasil = data.next() .charAt(0);

        // Proses
        reamur = (double)4/5*suhu;
        fahrenheit = (double)9/5*suhu + 32;
        kelvin = suhu + 273.15;

        // Output
        System.out.println("\n    =====================");
        switch (hasil) {
            case '1':
                System.out.printf("Suhu dalam Reamur : %.2f \n",reamur);
                break;

            case '2':
                System.out.printf("Suhu dalam Fahrenheit : %.2f \n",fahrenheit);
                break;

            case '3':
                System.out.printf("Suhu dalam Kelvin : %.2f \n",kelvin);
                break;
        
            default:
                System.out.println("Angka yang anda masukan TIDAK SESUAI!!!");
                break;
        }
    }
    
}
