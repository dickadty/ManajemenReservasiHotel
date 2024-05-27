package Joki1;

public abstract class Pemesanan implements Reservasi {
    private String idReservasi;
    private String namaTamu;
    private String tipeKamar;
    private int durasi;
    private int hargaPerMalam;

    public Pemesanan(String idReservasi, String namaTamu, String tipeKamar, int durasi, int hargaPerMalam) {
        this.idReservasi = idReservasi;
        this.namaTamu = namaTamu;
        this.tipeKamar = tipeKamar;
        this.durasi = durasi;
        this.hargaPerMalam = hargaPerMalam;
    }

    public String getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(int hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public double hitungHargaTotal() {
        return durasi * hargaPerMalam;
    }

    @Override
    public void reservasi() {
        System.out.println("Melakukan reservasi kamar untuk " + namaTamu);
    }

    @Override
    public void batalkan() {
        System.out.println("Membatalkan reservasi untuk " + namaTamu);
    }

    @Override
    public void display() {
        System.out.println("Pemesanan{" +
                "IdReservasi: " + idReservasi + ", " +
                "NamaTamu: " + namaTamu + ", " +
                "TipeKamar: " + tipeKamar + ", " +
                "Durasi: " + durasi + " malam, " +
                "Harga Per Malam: Rp " + hargaPerMalam + ", " +
                "Harga Total: Rp " + hitungHargaTotal() +
                '}');
    }
}
