public class KendaraanBermotor {
    private String merk;
    private int kapasitasBensin;

    public void setMerk(String merkInput) {
        merk = merkInput;
    }

    public void isiBensin(int liter) {
        kapasitasBensin += liter;
    }

    public void cetakInformasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Bensin: " + kapasitasBensin + " Liter");
    }
}