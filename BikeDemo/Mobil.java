public class Mobil extends KendaraanBermotor {
    private int jumlahPintu;
    private boolean acNyala;

    public void setJumlahPintu(int jumlah) {
        jumlahPintu = jumlah;
    }

    public void nyalakanAC() {
        acNyala = true;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== MOBIL ===");
        super.cetakInformasi();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Status AC: " + (acNyala ? "Aktif" : "Mati"));
    }
}