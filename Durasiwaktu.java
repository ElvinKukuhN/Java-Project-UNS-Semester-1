import java.util.Scanner;

public class Durasiwaktu {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Program Menghitung Durasi Waktu");
        int jamAwal,menitAwal,detikAwal,jamAkhir,menitAkhir,detikAkhir;
        int waktu1,waktu2,selisih,hasilJam,hasilMenit,hasildetik,sisa;

        // mengambil inputan dari user
        System.out.println("Masukan Waktu Mulai!!!");
        System.out.print("Jam   : ");
        jamAwal = data.nextInt();
        System.out.print("Menit : ");
        menitAwal = data.nextInt();
        System.out.print("Detik : ");
        detikAwal = data.nextInt();

        System.out.println("");
        System.out.println("Masukan Waktu Selesai!!!");
        System.out.print("Jam   : ");
        jamAkhir = data.nextInt();
        System.out.print("Menit : ");
        menitAkhir = data.nextInt();
        System.out.print("Detik : ");
        detikAkhir = data.nextInt();

        // Proses
        waktu1 = (3600*jamAwal)+(60*menitAwal)+(detikAwal);
        waktu2 = (3600*jamAkhir)+(60*menitAkhir)+(detikAkhir);
        selisih = waktu2 - waktu1;

        hasilJam = selisih / 3600;
        sisa = selisih % 3600;
        hasilMenit = sisa / 60;
        hasildetik = sisa % 60;

        // Ouput
        System.out.println("");
        System.out.println(" Perhitungan ");
        System.out.println("<===========>");
        System.out.println("Waktu Mulai     : " + jamAwal + ":" + menitAwal + ":" + detikAwal);
        System.out.println("Waktu Selesai   : " + jamAkhir + ":" + menitAkhir + ":" + detikAkhir);
        System.out.println("");
        System.out.println("Selisih         : " + hasilJam + ":" + hasilMenit + ":" + hasildetik);
        



    }
    
}
