package Joki1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajerReservasi manajer = new ManajerReservasi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==============================");
            System.out.println("     Sistem Reservasi Hotel   ");
            System.out.println("==============================");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Batalkan Reservasi");
            System.out.println("3. Daftar Reservasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan buffer

            if (pilihan == 1) {
                System.out.print("ID Reservasi: ");
                String idReservasi = scanner.nextLine();
                System.out.print("Nama Tamu: ");
                String namaTamu = scanner.nextLine();
                System.out.print("Tipe Kamar (Standar/Suite): ");
                String tipeKamar = scanner.nextLine();
                System.out.print("Durasi (malam): ");
                int durasi = scanner.nextInt();
                scanner.nextLine();  // Membersihkan buffer

                if (tipeKamar.equalsIgnoreCase("Standar")) {
                    Pemesanan pemesananStandar = new PemesananKamarStandar(idReservasi, namaTamu, tipeKamar, durasi);
                    manajer.tambahReservasi(pemesananStandar);
                } else if (tipeKamar.equalsIgnoreCase("Suite")) {
                    Pemesanan pemesananSuite = new PemesananKamarSuite(idReservasi, namaTamu, tipeKamar, durasi);
                    manajer.tambahReservasi(pemesananSuite);
                } else {
                    System.out.println("Tipe kamar tidak valid.");
                }
            } else if (pilihan == 2) {
                System.out.print("ID Reservasi yang akan dibatalkan: ");
                String idReservasi = scanner.nextLine();
                manajer.batalkanReservasi(idReservasi);
            } else if (pilihan == 3) {
                System.out.println("\nDaftar Reservasi:");
                manajer.daftarReservasi();
            } else if (pilihan == 4) {
                System.out.println("Keluar dari sistem.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
