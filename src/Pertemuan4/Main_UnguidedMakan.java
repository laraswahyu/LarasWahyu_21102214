package Pertemuan4;

import java.util.Scanner;

public class Main_UnguidedMakan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WarungMakan wm = new WarungMakan();
        Makanan m = new Makanan();
        Makanan m1 = new Makanan();
        Makanan m2 = new Makanan();
        Makanan m3 = new Makanan();

        wm.nama_warung = "Warung Nasi Goreng";
        wm.alamat = "JL. Raya";
        wm.no_telepon = "null";

        m1.no_makanan = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.stok = 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.stok = 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.stok = 20;

        wm.detailWarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.print("Masukkan nomor makanan   : ");
        m.no_makanan = input.nextInt();
        if (m.no_makanan == 1) {

            System.out.print("Masukkan jumlah makanan  : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalHarga();
            wm.cekStok(m1);

        } else if (m.no_makanan == 2) {
            System.out.println("Maasukkan jumlah makanan  : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalHarga();
            wm.cekStok(m2);

        } else if (m.no_makanan == 3) {
            System.out.println("Maasukkan jumlah makanan  : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalHarga();
            wm.cekStok(m3);
        }

        input.close();
    }

}
