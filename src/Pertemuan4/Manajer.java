package Pertemuan4;

public class Manajer extends Pegawai {

    public void bonus(int bonus) {
        System.out.println("Pegawai dengan nama " + nama + "("+nip+") Mendapatkan Bonus sebesar Rp " + bonus);
    }
    public void extrainfo() {
        System.out.println("Jabatan Pegawai : Manajer");
    }
    public void bonus() {
        System.out.println("Error : harap masukkan jumlah bonusnya!");
    }
}
