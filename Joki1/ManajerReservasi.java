package Joki1;

import java.util.ArrayList;
import java.util.List;

public class ManajerReservasi {
    private List<Pemesanan> daftarReservasi;

    public ManajerReservasi() {
        this.daftarReservasi = new ArrayList<>();
    }

    public void tambahReservasi(Pemesanan pemesanan) {
        daftarReservasi.add(pemesanan);
        pemesanan.reservasi();
    }

    public void batalkanReservasi(String idReservasi) {
        for (Pemesanan pemesanan : daftarReservasi) {
            if (pemesanan.getIdReservasi().equals(idReservasi)) {
                pemesanan.batalkan();
                daftarReservasi.remove(pemesanan);
                break;
            }
        }
    }

    public void daftarReservasi() {
        for (Pemesanan pemesanan : daftarReservasi) {
            pemesanan.display();
        }
    }
}
