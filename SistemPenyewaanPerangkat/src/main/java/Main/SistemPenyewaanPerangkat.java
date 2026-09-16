/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import java.util.Scanner;
import Logic.KelolaPerangkat;
import Model.Kamera;
import Model.Drone;

/**
 *
 * @author Lenovo
 */
public class SistemPenyewaanPerangkat {

    public static void main(String[] args) {

        // Membuat Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Membuat objek untuk mengelola perangkat
        KelolaPerangkat kelola = new KelolaPerangkat();

        int pilihan;

        // Perulangan menu
        do {
            System.out.println("\n==================================");
            System.out.println("   SISTEM PENYEWAAN PERANGKAT");
            System.out.println("==================================");
            System.out.println("1. Tambah Kamera");
            System.out.println("2. Tambah Drone");
            System.out.println("3. Tampilkan Semua Perangkat");
            System.out.println("4. Ubah Status Perangkat");
            System.out.println("5. Hapus Perangkat");
            System.out.println("6. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // CREATE - Tambah Kamera
                case 1:
                    System.out.println("\n--- Tambah Kamera ---");

                    System.out.print("ID Perangkat   : ");
                    String idKamera = input.nextLine();

                    System.out.print("Nama Perangkat : ");
                    String namaKamera = input.nextLine();

                    System.out.print("Harga Sewa     : ");
                    double hargaKamera = input.nextDouble();
                    input.nextLine();

                    System.out.print("Status         : ");
                    String statusKamera = input.nextLine();

                    System.out.print("Resolusi       : ");
                    String resolusi = input.nextLine();

                    System.out.print("Jenis Kamera   : ");
                    String jenisKamera = input.nextLine();

                    // Membuat objek Kamera
                    Kamera kamera = new Kamera(
                            idKamera,
                            namaKamera,
                            hargaKamera,
                            statusKamera,
                            resolusi,
                            jenisKamera
                    );

                    kelola.tambahPerangkat(kamera);
                    break;

                // CREATE - Tambah Drone
                case 2:
                    System.out.println("\n--- Tambah Drone ---");

                    System.out.print("ID Perangkat    : ");
                    String idDrone = input.nextLine();

                    System.out.print("Nama Perangkat  : ");
                    String namaDrone = input.nextLine();

                    System.out.print("Harga Sewa      : ");
                    double hargaDrone = input.nextDouble();
                    input.nextLine();

                    System.out.print("Status          : ");
                    String statusDrone = input.nextLine();

                    System.out.print("Resolusi Kamera : ");
                    String resolusiDrone = input.nextLine();

                    System.out.print("Durasi Terbang (menit): ");
                    int durasiTerbang = input.nextInt();
                    input.nextLine();

                    // Membuat objek Drone
                    Drone drone = new Drone(
                            idDrone,
                            namaDrone,
                            hargaDrone,
                            statusDrone,
                            resolusiDrone,
                            durasiTerbang
                    );

                    kelola.tambahPerangkat(drone);
                    break;

                // READ - Menampilkan semua perangkat
                case 3:
                    System.out.println("\n--- Daftar Semua Perangkat ---");
                    kelola.tampilkanSemuaPerangkat();
                    break;

                // UPDATE - Mengubah status
                case 4:
                    System.out.println("\n--- Ubah Status Perangkat ---");

                    System.out.print("ID Perangkat : ");
                    String idUbah = input.nextLine();

                    System.out.print("Status Baru  : ");
                    String statusBaru = input.nextLine();

                    kelola.ubahStatus(idUbah, statusBaru);
                    break;

                // DELETE - Menghapus perangkat
                case 5:
                    System.out.println("\n--- Hapus Perangkat ---");

                    System.out.print("ID Perangkat : ");
                    String idHapus = input.nextLine();

                    kelola.hapusPerangkat(idHapus);
                    break;

                // Keluar
                case 6:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan menu tidak tersedia.");
            }

        } while (pilihan != 6);

        input.close();
    }
}
