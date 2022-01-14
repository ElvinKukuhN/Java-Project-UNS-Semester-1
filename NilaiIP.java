import java.util.Scanner;

public class NilaiIP {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Deklarasi
        double mtk,algo,sksMtk = 2,sksAlgo = 3,rata2Mtk,rata2Algo,rata2Akhir;
        System.out.println("Program menghitung rata-rata nilai berbobot");
        System.out.println("===========================================");

        // input
        System.out.print("Masukan nilai MTK : ");
        mtk = data.nextDouble();

        System.out.print("Masukan nilai ALGORITMA : ");
        algo = data.nextDouble();

        // Proses
        rata2Mtk = mtk*sksMtk;
        rata2Algo = algo*sksAlgo;
        rata2Akhir = (rata2Mtk + rata2Algo) / (sksMtk + sksAlgo);

        // Output
        System.out.println("");
        System.out.printf("Nilai rata-ratanya adalah : %.1f",rata2Akhir);

    }
    
}
