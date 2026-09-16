/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;
import Model.Perangkat;

/**
 *
 * @author Lenovo
 */
public class KelolaPerangkat {

    // Atribut
    private ArrayList<Perangkat> daftarPerangkat;

    // Constructor
    public KelolaPerangkat() {
        daftarPerangkat = new ArrayList<>();
    }

    // CREATE
    // Method untuk menambahkan perangkat
    public void tambahPerangkat(Perangkat perangkat) {
        daftarPerangkat.add(perangkat);
        System.out.println("Perangkat berhasil ditambahkan.");
    }

    // READ
    // Method untuk menampilkan semua perangkat
    public void tampilkanSemuaPerangkat() {

        if (daftarPerangkat.isEmpty()) {
            System.out.println("Belum ada perangkat.");
        } else {

            for (Perangkat perangkat : daftarPerangkat) {
                System.out.println("----------------------------");
                perangkat.tampilkanInfo();
            }

            System.out.println("----------------------------");
        }
    }

    // UPDATE
    // Method untuk mengubah status perangkat
    public void ubahStatus(String idPerangkat, String statusBaru) {

        for (Perangkat perangkat : daftarPerangkat) {

            if (perangkat.getIdPerangkat().equalsIgnoreCase(idPerangkat)) {

                perangkat.setStatus(statusBaru);
                System.out.println("Status perangkat berhasil diubah.");
                return;
            }
        }

        System.out.println("Perangkat dengan ID tersebut tidak ditemukan.");
    }

    // DELETE
    // Method untuk menghapus perangkat
    public void hapusPerangkat(String idPerangkat) {

        for (int i = 0; i < daftarPerangkat.size(); i++) {

            if (daftarPerangkat.get(i).getIdPerangkat()
                    .equalsIgnoreCase(idPerangkat)) {

                daftarPerangkat.remove(i);
                System.out.println("Perangkat berhasil dihapus.");
                return;
            }
        }

        System.out.println("Perangkat dengan ID tersebut tidak ditemukan.");
    }
}