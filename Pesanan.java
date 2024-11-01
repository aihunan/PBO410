public class Pesanan {
    private Pelanggan pelanggan;
    private Menu menu;
    private String tipePesanan;
    private String status;

    public Pesanan(String namaPelanggan, Menu menu, String tipePesanan) {
        this.pelanggan = new Pelangganreguler(namaPelanggan);
        this.menu = menu;
        this.tipePesanan = tipePesanan;
        this.status = "Pesanan Diterima";
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Menu getMenu() {
        return menu;
    }

    public String getTipePesanan() {
        return tipePesanan;
    }

    public int getTotalHarga() {
        return menu.getHarga();
    }

    public String getStatus() {
        return status;
    }
}