public class motoryayas {
    public static void main(String[] args) {

        SepedaMotor Suzuki = new SepedaMotor("Suzuki", "G5X 150R", 20000000);
        SepedaMotor Yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
        SepedaMotor Honda = new SepedaMotor("Honda", "CBR 150R", 23500000);

        Suzuki.merk = "Suzuki";
        Suzuki.tipe = "GSX 150R";
        Suzuki.harga = 20000000;

        Yamaha.merk = "Yamaha";
        Yamaha.tipe = "YZF R15";
        Yamaha.harga = 25000000;

        Honda.merk = "Honda";
        Honda.tipe = "CBR 150";
        Honda.harga = 23500000;

        Suzuki.showinfo();
        Yamaha.showinfo();
        Honda.showinfo();

        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 40000000);
        vespa.showinfo();

        //Sebelum
        System.out.println("Motor Merk : " + vespa.getMerk() + "Dengan Tipe (Before) : " + vespa.getTipe());

        //Melakukan proses perubahan
        vespa.setTipe("Sprint");

        //Lihat hasil perubahan
        System.out.println(
                "Motor Merk : " + vespa.getMerk() +
                        "Dengan tipe (After) : " + vespa.getTipe()
        );

    }
}