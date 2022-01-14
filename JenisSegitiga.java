import java.util.Scanner;

public class JenisSegitiga {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        int sisiA, sisiB, sisiC;

        System.out.println("    Penentuan Jenis Segitiga");
        System.out.println("    ========================");
        System.out.print("Masukan Sisi A : ");
        sisiA = data.nextInt();
        System.out.print("Masukan Sisi B : ");
        sisiB = data.nextInt();
        System.out.print("Masukan Sisi C : ");
        sisiC = data.nextInt();

        System.out.println("Ini adalah Segitiga "+jenis(sisiA, sisiB, sisiC));   
    }

    public static String jenis(int sisiA, int sisiB, int sisiC) {
        boolean siku1, siku2, siku3;

        siku1 = (sisiA*sisiA) == (sisiB*sisiB) + (sisiC*sisiC);
        siku2 = (sisiB*sisiB) == (sisiA*sisiA) + (sisiC*sisiC);
        siku3 = (sisiC*sisiC) == (sisiB*sisiB) + (sisiA*sisiA);

        String jenis;
        if (sisiA == sisiB && sisiB == sisiC && sisiC == sisiA) {
            jenis = "Sama Sisi";
        } else if (sisiA == sisiB || sisiB == sisiC || sisiC == sisiA) {
            jenis = "Sama Kaki";
        } else if (siku1 || siku2 || siku3) {
            jenis = "Siku Siku";
        } else {
            jenis = "Sebarang";
        }

        return jenis;

        
    }

}
