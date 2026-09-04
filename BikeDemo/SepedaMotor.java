public class SepedaMotor extends KendaraanBermotor {
    private String tipeTransmisi;
    private boolean helmTerpasang;

    public void setTipeTransmisi(String tipe) {
        tipeTransmisi = tipe;
    }

    public void pasangHelm() {
        helmTerpasang = true;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== SEPEDA MOTOR ===");
        super.cetakInformasi();
        System.out.println("Transmisi: " + tipeTransmisi);
        System.out.println("Helm: " + (helmTerpasang ? "Terpasang" : "Belum"));
    }
}