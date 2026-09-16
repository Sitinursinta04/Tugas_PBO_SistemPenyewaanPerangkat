/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Perangkat {

    // Atribut
    private String idPerangkat;
    private String namaPerangkat;
    private double hargaSewa;
    private String status;

    // Constructor
    public Perangkat(String idPerangkat, String namaPerangkat,
                     double hargaSewa, String status) {
        this.idPerangkat = idPerangkat;
        this.namaPerangkat = namaPerangkat;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }

    // Getter
    public String getIdPerangkat() {
        return idPerangkat;
    }

    public String getNamaPerangkat() {
        return namaPerangkat;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setStatus(String status) {
        this.status = status;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("ID Perangkat   : " + idPerangkat);
        System.out.println("Nama Perangkat : " + namaPerangkat);
        System.out.println("Harga Sewa     : Rp" + hargaSewa);
        System.out.println("Status         : " + status);
    }
}