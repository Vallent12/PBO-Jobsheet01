public class MainDemo {
    public static void main(String[] args) {
        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Miyako");
        kipas.naikkanKecepatan();
        kipas.cetakInformasi();
        System.out.println();

        lampu lampu = new lampu();
        lampu.setWarna("Warm White");
        lampu.saklarPencet();
        lampu.cetakInformasi();
        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("Honda Vario");
        motor.isiBensin(5);
        motor.setTipeTransmisi("Automatic");
        motor.pasangHelm();
        motor.cetakInformasi();
        System.out.println();

        Mobil mobil = new Mobil();
        mobil.setMerk("Toyota Avanza");
        mobil.isiBensin(20);
        mobil.setJumlahPintu(5);
        mobil.nyalakanAC();
        mobil.cetakInformasi();
    }
}