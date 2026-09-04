public class KipasAngin {
    private String merk;
    private int kecepatan;

    public void setMerk(String merkInput) {
        merk = merkInput;
    }

    public void naikkanKecepatan() {
        kecepatan++;
    }

    public void cetakInformasi() {
        System.out.println("=== KIPAS ANGIN ===");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: Level " + kecepatan);
    }
}