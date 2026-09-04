public class lampu {
    private String warna;
    private boolean statusNyala;

    public void setWarna(String warnaInput) {
        warna = warnaInput;
    }

    public void saklarPencet() {
        statusNyala = !statusNyala;
    }

    public void cetakInformasi() {
        System.out.println("=== LAMPU ===");
        System.out.println("Warna: " + warna);
        System.out.println("Status: " + (statusNyala ? "Nyalai" : "Mati"));
    }
}