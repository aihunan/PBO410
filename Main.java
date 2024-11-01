public class Main {
    public static void main(String[] args) {
        Restourant restoran = new Restourant("Restoran Enak");

        restoran.tambahMenu(new Makanan("Nasi Goreng", 20000));
        restoran.tambahMenu(new Makanan("Mie Ayam", 15000));
        restoran.tambahMenu(new Minuman("Teh Botol", 5000));
        restoran.tambahMenu(new Minuman("Jus Jeruk", 10000));

        restoran.prosesPesanan();

        restoran.displayPesanan();
    }
}
