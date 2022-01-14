import java.util.Scanner;

public class GajiBersih {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        // Program menghitung Gaji Bersih
        System.out.println("    Program Menghitung Gaji Bersih");
        System.out.println("    ==============================");
        // Inisisalisasi
        char golongan, menikah;
        int anak;
        int gajiPokok = 0, totalTunjanganAnak = 0, tunjanganMenikah = 0, GajiBersih = 0, gajikotor = 0, pajak = 0;
        int gaji1= 1000000;
        int gaji2= 2000000;
        int gaji3= 3000000;
        int tunjangan = 300000;
        int tunjanganAnak = 100000;

        // Mengambil Inputan dari user
        System.out.print("Pilih Golongan 1 - 3 ==>");
        golongan = data.next(). charAt(0);
        System.out.print("Apakah anda sudah berkeluarga ? (y/n) : ");
        menikah = data.next(). charAt(0);

        // Proses
        switch (golongan) {
            case '1':
            gajiPokok = gaji1;
            pajak = 0;
            if (menikah == 'y') {
                System.out.print("Masukan Jumlah Anak : ");
                anak = data.nextInt();
                tunjanganMenikah = tunjangan;
                if (anak > 0 && anak <= 3) {
                    totalTunjanganAnak = tunjanganAnak*anak;
                } else if (anak > 3) {
                    totalTunjanganAnak = tunjanganAnak*3;
                }
            } else {
                tunjanganMenikah = 0;
                totalTunjanganAnak = 0;
            }
            gajikotor = gajiPokok + tunjanganMenikah + totalTunjanganAnak;
            GajiBersih = gajikotor - pajak;
            break;

            case '2' :
            gajiPokok = gaji2;
            if (menikah == 'y') {
                System.out.print("Masukan Jumlah Anak : ");
                anak = data.nextInt();
                tunjanganMenikah = tunjangan;
                if (anak > 0 && anak <= 3) {
                    totalTunjanganAnak = tunjanganAnak*anak;
                } else if (anak > 3) {
                    totalTunjanganAnak = tunjanganAnak*3;
                }
            }else {
                tunjanganMenikah = 0;
                totalTunjanganAnak = 0;
            }
            pajak =0;
            gajikotor = gajiPokok + tunjanganMenikah + totalTunjanganAnak;
            GajiBersih = gajikotor - pajak;
            break;

            case '3' :
            gajiPokok = gaji3;
            if (menikah == 'y') {
                System.out.print("Masukan Jumlah Anak : ");
                anak = data.nextInt();
                tunjanganMenikah = tunjangan;
                if (anak > 0 && anak <= 3) {
                    totalTunjanganAnak = tunjanganAnak*anak;
                } else if (anak > 3) {
                    totalTunjanganAnak = tunjanganAnak*3;
                }
            }else {
                tunjanganMenikah = 0;
                totalTunjanganAnak = 0;
            }
            gajikotor = gajiPokok + tunjanganMenikah + totalTunjanganAnak;
            pajak = (int) ((gajiPokok + tunjanganMenikah + totalTunjanganAnak)*0.02);
            GajiBersih = gajikotor - pajak;
            break;
        
            default:
                GajiBersih = 0;
                break;
        }

        System.out.println("Gaji pokok anda             : " + gajiPokok);
        System.out.println("Gaji kotor anda             : " + gajikotor);
        System.out.println("tunjangan keluarga          : " + tunjanganMenikah);
        System.out.println("tunjangan anak              : " + totalTunjanganAnak);
        System.out.println("pajak                       : " + pajak);
        System.out.println("Gaji Bersih anda            : " + GajiBersih);

    }
}
