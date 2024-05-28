package Joki1;

public class PemesananKamarStandar extends Pemesanan {
    public PemesananKamarStandar(String idReservasi, String namaTamu, String tipeKamar, int durasi) {
        super(idReservasi, namaTamu, tipeKamar, durasi, 300000);
    }

    @Override
    public void reservasi() {
        super.reservasi();
        System.out.println("Kamar standar dipesan.");
    }

    @Override
    public void batalkan() {
        super.batalkan();
        System.out.println("Reservasi kamar standar dibatalkan.");
    }

    @Override
    public void display() {
        super.display();
    }
}
