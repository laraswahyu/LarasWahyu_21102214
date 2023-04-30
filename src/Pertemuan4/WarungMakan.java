package Pertemuan4;

import javax.swing.*;
public class WarungMakan {
    String no_telepon;
    String nama_warung;
    String alamat;
    public void detailWarung() {
        System.out.println("<< WARUNG MAKAN SEDERHANA >>");
        System.out.println("Nama Warung : " + nama_warung);
        System.out.println("Alamat      : " + alamat);
        System.out.println("No Telp     : " + no_telepon);
        System.out.println();
    }
    public void cekStok(Makanan m) {
        if (m.no_makanan == 1) {

            System.out.println("Stok Nasi Goreng : " + m.stok);
        } else if (m.no_makanan == 2) {
            System.out.println("Stok Nasi Goreng Spesial : " + m.stok);
        } else if (m.no_makanan == 3) {
            System.out.println("Stok Nasi Goreng Spesial + Telur : " + m.stok);
        }
        System.out.println();
    }
    public void beliMakanan(Makanan m, int jumlah) {
        if (jumlah >= m.stok) {
            System.out.println("Stok tidak cukup");
            m.harga = 0;
        } else {
            System.out.println("<< Detail Pembelian >>");
            System.out.println("Nama Makanan : " + m.nama_makanan);
            System.out.println("Harga        : " + m.harga);
            System.out.println("Jumlah       : " + jumlah);
            m.harga = m.harga * jumlah;
            m.stok -= jumlah;
        }
    }
    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getNama_warung() {
        return nama_warung;
    }

    public void setNama_warung(String nama_warung) {
        this.nama_warung = nama_warung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
