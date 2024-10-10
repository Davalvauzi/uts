/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

public class Kamar {
    private String tipe;
    private boolean tersedia;
    private double harga;

    public Kamar(String tipe, boolean tersedia, double harga) {
        this.tipe = tipe;
        this.tersedia = tersedia;
        this.harga = harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
