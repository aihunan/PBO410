import java.util.Scanner;

public class Restourant {
    private String namaRestoran;
    private Menu[] menus;
    private Pesanan[] pesans;
    private Pelanggan[] pelanggans;

    public Restourant(String namaRestourant) {
        this.namaRestoran = namaRestourant;
        this.menus = new Menu[10];
        this.pesans = new Pesanan[10];
        this.pelanggans = new Pelanggan[10];
    }

    public void tambahMenu(Menu menu) {
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] == null) {
                menus[i] = menu;
                break;
            }
        }
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        for (int i = 0; i < pelanggans.length; i++) {
            if (pelanggans[i] == null) {
                pelanggans[i] = pelanggan;
                break;
            }
        }
    }

    public void tambahPesanan(Pesanan pesanan) {
        for (int i = 0; i < pesans.length; i++) {
            if (pesans[i] == null) {
                pesans[i] = pesanan;
                break;
            }
        }
    }

    public void displayMenu() {
        System.out.println("Menu Makanan dan Minuman:");
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != null) {
                System.out.println((i + 1) + ". " + menus[i].getNama() + " - Rp " + menus[i].getHarga());
            }
        }
    }

    public void displayPesanan() {
        System.out.println("Riwayat Pesanan:");
        for (Pesanan pesanan : pesans) {
            if (pesanan != null) {
                System.out.println("Pelanggan: " + pesanan.getPelanggan().getNama());
                System.out.println("Menu: " + pesanan.getMenu().getNama());
                System.out.println("Tipe Pesanan: " + pesanan.getTipePesanan());
                System.out.println("Total Harga: Rp " + pesanan.getTotalHarga());
                System.out.println("Status: " + pesanan.getStatus());
                System.out.println();
            }
        }
    }

    public void prosesPesanan() {
        Scanner scanner = new Scanner(System.in);

        displayMenu();

        System.out.print("Pilih nomor menu: ");
        int pilihanMenu = scanner.nextInt() - 1;

        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.next();

        System.out.print("Tipe Pesanan (dine-in/take-away): ");
        String tipePesanan = scanner.next();

        Pesanan pesanan = new Pesanan(namaPelanggan, menus[pilihanMenu], tipePesanan);
        tambahPesanan(pesanan);
        System.out.println("Pesanan berhasil dicatat!");
    }
}
