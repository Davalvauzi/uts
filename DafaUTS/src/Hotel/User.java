/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

interface Diskon {
    double hitungDiskon(double harga);
}

public class User {
    protected String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public void cekKetersediaan(Kamar[] kamar) {
        for (Kamar k : kamar) {
            System.out.println("Kamar Tipe " + k.getTipe() + (k.isTersedia() ? " tersedia" : " tidak tersedia"));
        }
    }

    public void pesanKamar(Kamar kamar, int durasi, Diskon diskon) {
        if (kamar.isTersedia()) {
            double hargaDiskon = diskon.hitungDiskon(kamar.getHarga() * durasi);
            Pesanan pesanan = new Pesanan(kamar, this.nama, durasi, hargaDiskon);
            kamar.setTersedia(false);
            pesanan.tampilkanDetailPesanan();
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }
}
