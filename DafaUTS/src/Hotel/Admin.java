/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

public class Admin extends User {
    public Admin(String nama) {
        super(nama);
    }

    public void ubahKetersediaan(Kamar kamar, boolean status) {
        kamar.setTersedia(status);
        System.out.println("Status kamar " + kamar.getTipe() + " diubah ke " + (status ? "tersedia" : "tidak tersedia"));
    }
}
