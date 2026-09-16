/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
// Subclass dari superclass Perangkat
public class Drone extends Perangkat {

    // Atribut tambahan untuk Drone
    private String resolusiKamera;
    private int durasiTerbang;

    // Constructor
    public Drone(String idPerangkat, String namaPerangkat,
                 double hargaSewa, String status,
                 String resolusiKamera, int durasiTerbang) {

        // Memanggil constructor dari superclass Perangkat
        super(idPerangkat, namaPerangkat, hargaSewa, status);

        this.resolusiKamera = resolusiKamera;
        this.durasiTerbang = durasiTerbang;
    }

    // Getter
    public String getResolusiKamera() {
        return resolusiKamera;
    }

    public int getDurasiTerbang() {
        return durasiTerbang;
    }

    // Setter
    public void setResolusiKamera(String resolusiKamera) {
        this.resolusiKamera = resolusiKamera;
    }

    public void setDurasiTerbang(int durasiTerbang) {
        this.durasiTerbang = durasiTerbang;
    }

    // Method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Resolusi Kamera: " + resolusiKamera);
        System.out.println("Durasi Terbang : " + durasiTerbang + " menit");
    }
}