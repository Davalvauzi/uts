/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

public class Pesanan {
    private Kamar kamar;
    private String namaCustomer;
    private int durasi;
    private double totalHarga;

    public Pesanan(Kamar kamar, String namaCustomer, int durasi, double totalHarga) {
        this.kamar = kamar;
        this.namaCustomer = namaCustomer;
        this.durasi = durasi;
        this.totalHarga = totalHarga;
    }

    public void tampilkanDetailPesanan() {
        System.out.println("Pesanan untuk " + namaCustomer);
        System.out.println("Kamar Tipe: " + kamar.getTipe());
        System.out.println("Durasi: " + durasi + " malam");
        System.out.println("Total Harga: " + totalHarga);
    }
}
