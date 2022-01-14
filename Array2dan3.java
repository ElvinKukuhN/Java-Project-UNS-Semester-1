import java.util.Scanner;

public class Array2dan3 {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // bagian soal nomor 2
        // Inisialisasi
        String tbl ="|     %s       |    %s   |      %d   |  %d  |%n";
        String NamaBarang [] = {"Sepatu","Jaket ","Kaos  ","Celana","Topi  "};
        String[] KodeBarang = {"S","J","K","C","T"};
        int HargaBarang []   = {50000,60000,20000,25000,15000};
        int bnyItem [] = new int [5];
        int b= 0;
        int a [] = new int [5];

        // Tampilan Daftar Barang
        System.out.println("    DATA BARANG :");

        System.out.format("+-------------+-------------+--------------+------+\n");
        System.out.format("| Kode Barang | Nama Barang | Harga Barang | Stok |\n");
        System.out.format("+-------------+-------------+--------------+------+\n");

        for (int i = 0; i < NamaBarang.length; i++) {
            int stokBarang    = (int) (Math.random()*(100-10)+10);
            System.out.format(tbl, KodeBarang[i], NamaBarang[i], HargaBarang[i], stokBarang);
        }   
        System.out.format("+-------------+-------------+--------------+------+\n");

        // Output
        for (int i = 0; i < NamaBarang.length; i++) {
            System.out.println("Pembelian ke- "+ (i+1));
            System.out.println("Kode Barang = "+ KodeBarang[i]);
            System.out.print("Masukan jumlah barang : ");
            bnyItem [i]= data.nextInt();
            a [i]= bnyItem[i] * HargaBarang[i];
            b = b + a[i];
            System.out.println("Total harga PerItem = " + a[i]);
            System.out.println(" ");
        }


        // bagian soal no 3
        String tbl2 = "|     %s       |    %s   |     %d    |       %d      |   %d    %n";

        System.out.println("    KWITANSI PEMBELIAN");
        System.out.println("    ==================");


        System.out.format("+-------------+-------------+--------------+--------------+-----------+\n");
        System.out.format("| Kode Barang | Nama Barang | Harga Barang |  Jumlah Beli |   Total    \n");
        System.out.format("+-------------+-------------+--------------+--------------+-----------+\n");

        for (int i = 0; i < NamaBarang.length; i++) {
            System.out.format(tbl2, KodeBarang[i], NamaBarang[i], HargaBarang[i], bnyItem[i], a[i]);
        }   
        System.out.format("+-------------+-------------+--------------+--------------+------------+\n");
        System.out.format("+Total Keseluruhan                                        =   "+ b +"   +\n");
        System.out.format("+-------------+-------------+--------------+--------------+------------+\n");
        System.out.println("                            TERIMA KASIH                                 ");
    }
}


