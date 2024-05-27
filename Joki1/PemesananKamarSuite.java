package Joki1;

public class PemesananKamarSuite extends Pemesanan {
    public PemesananKamarSuite(String idReservasi, String namaTamu, String tipeKamar, int durasi) {
        super(idReservasi, namaTamu, tipeKamar, durasi, 500000);
    }

    @Override
    public void reservasi() {
        super.reservasi();
        System.out.println("Kamar suite dipesan.");
    }

    @Override
    public void batalkan() {
        super.batalkan();
        System.out.println("Reservasi kamar suite dibatalkan.");
    }

    @Override
    public void display() {
        super.display();
    }
}
