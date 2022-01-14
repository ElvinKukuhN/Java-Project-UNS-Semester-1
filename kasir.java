import java.util.Scanner;

public class kasir {

    static Scanner data = new Scanner(System.in);
    double bayar, total, harga, kembalian;
    static int input;
    int pil, jumlah;
    String namaBarang;

    public static void main(String[] args) {
        kasir in = new kasir();
        System.out.println("    =====PROGRAM KASIR=====");
        System.out.println("    =========++==++========\n");
        System.out.println("Silakan Pilih Jenis Barang = ");
        String tbl = "|  %s  |       %d        %n";

        int i;

        // Jenis Barang
        String[] jenis = { "Pakaian ", "Makanan & Minuman", "Perabot Rumah Tangga", "Alat tulis" };
        String[] Pakaian = { "   Kemeja     ", "   Celana     ", "   Kaos       ", "   Jaket      ", "   Topi       ",
                "   jas        " };
        String[] MknMnm = { "   Nasi Goreng ", "   Mie Ayam    ", "   Bakso       ", "   Es Teh      ",
                "   Es jeruk    ", "   Es Nutrisari" };
        String[] PRT = { "  Ember        ", "  Gayung       ", "  Panci        ", "  Payung       ", "  Meja         ",
                "  Kursi        ", "  Sapu         " };
        String[] AlatTulis = { "   Buku Tulis  ", "   Buku Gambar ", "   Pensil      ", "   Pulpen      ",
                "   Penghapus   ", "   Penggaris   " };

        // Harga Barang
        int[] HargaPakaian = { 70000, 45000, 40000, 95000, 25000, 90000 };
        int[] HargaMknMnm = { 10000, 13000, 3000, 4000, 5000, 5000 };
        int[] HargaPRT = { 10000, 5000, 25000, 12000, 90000, 40000, 15000 };
        int[] HargaAlatTulis = { 3000, 7000, 2000, 5000, 1000, 5000 };

        for (i = 0; i < jenis.length; i++) {
            System.out.println(i + 1 + "." + jenis[i]);
        }

        StringInput("==>");
        input = data.nextInt();

        switch (input) {
            case 1:
                do {
                    System.out.println("\nDaftar Pakaian ");
                    System.out.format("+-------------------+--------------------+\n");
                    System.out.format("|    nama Barang    |    Harga Barang    |\n");
                    System.out.format("+-------------------+--------------------+\n");
                    for (i = 0; i < Pakaian.length; i++) {
                        System.out.format(tbl, i + 1 + Pakaian[i], HargaPakaian[i]);
                    }
                    System.out.format("+-------------------+-------------------+\n");
                    System.out.format("+  9  Selesai dan lakukan pembayaran    +\n");
                    System.out.format("+-------------------+-------------------+\n");
                    StringInput("Masukan Kode barang yang ingin dibeli = ");
                    input = data.nextInt();

                    if (input >= 1 && input <= 6) {
                        StringInput("Masukan Jumlah beli : ");
                        in.jumlah = data.nextInt();
                    }
                    in.hitungTotalPakaian(in.jumlah);
                } while (input != 9);
                in.viewTotal();
                StringInput("Bayar : Rp ");
                in.bayar = data.nextDouble();
                in.hitungKembalian(in.bayar);
                in.viewKembalian();

                break;

            case 2:
                do {
                    System.out.println("\nDaftar Menu ");
                    System.out.format("+-------------------+--------------------+\n");
                    System.out.format("|    nama Barang    |    Harga Barang    |\n");
                    System.out.format("+-------------------+--------------------+\n");
                    for (i = 0; i < MknMnm.length; i++) {
                        System.out.format(tbl, i + 1 + MknMnm[i], HargaMknMnm[i]);
                    }
                    System.out.format("+-------------------+-------------------+\n");
                    System.out.format("+  9  Selesai dan lakukan pembayaran    +\n");
                    System.out.format("+-------------------+--------------------+\n");
                    StringInput("Masukan Kode barang yang ingin dibeli = ");
                    input = data.nextInt();

                    if (input >= 1 && input <= 6) {
                        StringInput("Masukan Jumlah beli : ");
                        in.jumlah = data.nextInt();
                    }
                    in.hitungTotalMakanan(in.jumlah);

                } while (input != 9);
                in.viewTotal();
                StringInput("Bayar : Rp ");
                in.bayar = data.nextDouble();
                in.hitungKembalian(in.bayar);
                in.viewKembalian();
                break;

            case 3:
                do {
                    System.out.println("\nDaftar PRT ");
                    System.out.format("+-------------------+--------------------+\n");
                    System.out.format("|    nama Barang    |    Harga Barang    |\n");
                    System.out.format("+-------------------+--------------------+\n");
                    for (i = 0; i < PRT.length; i++) {
                        System.out.format(tbl, i + 1 + PRT[i], HargaPRT[i]);
                    }
                    System.out.format("+-------------------+-------------------+\n");
                    System.out.format("+  9  Selesai dan lakukan pembayaran    +\n");
                    System.out.format("+-------------------+--------------------+\n");
                    StringInput("Masukan Kode barang yang ingin dibeli = ");
                    input = data.nextInt();

                    if (input >= 1 && input <= 7) {
                        StringInput("Masukan Jumlah beli : ");
                        in.jumlah = data.nextInt();
                    }
                    in.hitungTotalPRT(in.jumlah);
                } while (input != 9);
                in.viewTotal();
                StringInput("Bayar : Rp ");
                in.bayar = data.nextDouble();
                in.hitungKembalian(in.bayar);
                in.viewKembalian();
                break;

            case 4:
                do {
                    System.out.println("\nDaftar Alat Tulis ");
                    System.out.format("+-------------------+--------------------+\n");
                    System.out.format("|    nama Barang    |    Harga Barang    |\n");
                    System.out.format("+-------------------+--------------------+\n");
                    for (i = 0; i < AlatTulis.length; i++) {
                        System.out.format(tbl, i + 1 + AlatTulis[i], HargaAlatTulis[i]);
                    }
                    System.out.format("+-------------------+-------------------+\n");
                    System.out.format("+  9  Selesai dan lakukan pembayaran    +\n");
                    System.out.format("+-------------------+--------------------+\n");
                    StringInput("Masukan Kode barang yang ingin dibeli = ");
                    input = data.nextInt();
                    if (input >= 1 && input <= 6) {
                        StringInput("Masukan Jumlah beli : ");
                        in.jumlah = data.nextInt();
                    }
                    in.hitungTotalAlatTulis(in.jumlah);
                } while (input != 9);
                in.viewTotal();
                StringInput("Bayar : Rp ");
                in.bayar = data.nextDouble();
                in.hitungKembalian(in.bayar);
                in.viewKembalian();
                break;

            default:
                System.out.println("\nInputan Yang Anda Masukan Salah");
                break;
        }
    }

    Double hitungTotalPRT(int jml) {
        jumlah = jml;
        switch (input) {
            case 1:
                namaBarang = "Ember";
                harga = 10000;
                total = total + (harga * jml);
                break;

            case 2:
                namaBarang = "Gayung";
                harga = 5000;
                total = total + (harga * jml);
                break;

            case 3:
                namaBarang = "Panci";
                harga = 25000;
                total = total + (harga * jml);
                break;

            case 4:
                namaBarang = "payung";
                harga = 12000;
                total = total + (harga * jml);
                break;

            case 5:
                namaBarang = "Meja";
                harga = 90000;
                total = total + (harga * jml);
                break;

            case 6:
                namaBarang = "Kursi";
                harga = 40000;
                total = total + (harga * jml);
                break;

            case 7:
                namaBarang = "Sapu";
                harga = 15000;
                total = total + (harga * jml);
                break;

            case 9:
                break;

            default:
                System.out.println("Inputan yang anda masukan salah");
                break;
        }

        return total;

    }

    Double hitungTotalMakanan(int jml) {
        jumlah = jml;
        switch (input) {
            case 1:
                namaBarang = "Nasi Goreng";
                harga = 10000;
                total = total + (harga * jml);
                break;

            case 2:
                namaBarang = "Mie Ayam";
                harga = 13000;
                total = total + (harga * jml);
                break;

            case 3:
                namaBarang = "Bakso";
                harga = 3000;
                total = total + (harga * jml);
                break;

            case 4:
                namaBarang = "Es teh";
                harga = 4000;
                total = total + (harga * jml);
                break;

            case 5:
                namaBarang = "Es jeruk";
                harga = 5000;
                total = total + (harga * jml);
                break;

            case 6:
                namaBarang = "Es Nutrisari";
                harga = 5000;
                total = total + (harga * jml);
                break;

            case 9:
                break;

            default:
                System.out.println("Inputan yang anda masukan salah");
                break;
        }

        return total;

    }

    Double hitungTotalAlatTulis(int jml) {
        jumlah = jml;
        switch (input) {
            case 1:
                namaBarang = "Buku Tulis";
                harga = 3000;
                total = total + (harga * jml);
                break;

            case 2:
                namaBarang = "Buku Gambar";
                harga = 7000;
                total = total + (harga * jml);
                break;

            case 3:
                namaBarang = "Pensil";
                harga = 2000;
                total = total + (harga * jml);
                break;

            case 4:
                namaBarang = "Pulpen";
                harga = 5000;
                total = total + (harga * jml);
                break;

            case 5:
                namaBarang = "Penghapus";
                harga = 1000;
                total = total + (harga * jml);
                break;

            case 6:
                namaBarang = "Penggaris";
                harga = 5000;
                total = total + (harga * jml);
                break;

            case 9:
                break;

            default:
                System.out.println("Inputan yang anda masukan salah");
                break;
        }

        return total;

    }

    Double hitungTotalPakaian(int jml) {
        jumlah = jml;
        switch (input) {
            case 1:
                namaBarang = "kemeja";
                harga = 70000;
                total = total + (harga * jml);
                break;

            case 2:
                namaBarang = "Celana";
                harga = 45000;
                total = total + (harga * jml);
                break;

            case 3:
                namaBarang = "Kaos";
                harga = 40000;
                total = total + (harga * jml);
                break;

            case 4:
                namaBarang = "Jaket";
                harga = 95000;
                total = total + (harga * jml);
                break;

            case 5:
                namaBarang = "Topi";
                harga = 25000;
                total = total + (harga * jml);
                break;

            case 6:
                namaBarang = "Jas";
                harga = 90000;
                total = total + (harga * jml);
                break;

            case 9:
                break;

            default:
                System.out.println("Inputan yang anda masukan salah");
                break;
        }

        return total;

    }

    private static void StringInput(String print) {
        System.out.print(print);
    }

    void viewTotal() {
        System.out.println("\n=======Pembayaran======");
        System.out.println("bayar : Rp " + total);
    }

    Double hitungKembalian(double byr) {
        bayar = byr;
        kembalian = bayar - total;

        return kembalian;
    }

    void viewKembalian() {
        if (bayar > total) {
            System.out.println("\nKembalian = Rp " + kembalian);
            System.out.println("====={TERIMA KASIH}=====");
        } else {
            System.out.println("\nKembalian = Kurang Rp " + kembalian * -1);
            System.out.println("====={TERIMA KASIH}=====");

        }

    }

}