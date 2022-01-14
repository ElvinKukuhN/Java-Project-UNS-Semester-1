public class Array1 {
    public static void main(String[] args) {
        // Inisialisasi
        String NamaBarang [] = {"Sepatu","Jaket","Kaos","Celana","Topi"};
        String KodeBarang [] = {"S","J","K","C","T"};
        int HargaBarang []   = {50000,90000,20000,25000,15000};

        System.out.println("    =====Data Barang=====");
        System.out.println("    =====================");

        // Output
        for (int i = 0; i < NamaBarang.length; i++) {
            System.out.println("Barang Ke- "+ (i+1));
            int stokBarang    = (int) (Math.random()*101);
            System.out.println("Nama Barang     = "+ NamaBarang[i]);
            System.out.println("Kode Barang     = "+ KodeBarang[i]);
            System.out.println("Harga Barang    = "+ HargaBarang[i]);
            System.out.println("Stok Barang     = "+ stokBarang +"\n");

        }
    }
}
