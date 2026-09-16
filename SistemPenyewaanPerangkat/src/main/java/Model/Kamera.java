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
public class Kamera extends Perangkat {

    // Atribut tambahan untuk Kamera
    private String resolusi;
    private String jenisKamera;

    // Constructor
    public Kamera(String idPerangkat, String namaPerangkat,
                  double hargaSewa, String status,
                  String resolusi, String jenisKamera) {

        // Memanggil constructor dari superclass Perangkat
        super(idPerangkat, namaPerangkat, hargaSewa, status);

        this.resolusi = resolusi;
        this.jenisKamera = jenisKamera;
    }

    // Getter
    public String getResolusi() {
        return resolusi;
    }

    public String getJenisKamera() {
        return jenisKamera;
    }

    // Setter
    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public void setJenisKamera(String jenisKamera) {
        this.jenisKamera = jenisKamera;
    }

    // Method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Resolusi       : " + resolusi);
        System.out.println("Jenis Kamera   : " + jenisKamera);
    }
}