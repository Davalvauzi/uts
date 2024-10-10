/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Kamar[] kamar = {
            new Kamar("Single", true, 500000),
            new Kamar("Double", true, 800000),
            new Kamar("Suite", true, 1500000)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        User user = new User(nama);
        user.cekKetersediaan(kamar);

        System.out.println("Pilih tipe kamar (0: Single, 1: Double, 2: Suite): ");
        int pilihan = scanner.nextInt();
        System.out.println("Masukkan durasi menginap (malam): ");
        int durasi = scanner.nextInt();

        Diskon diskon = new DiskonHariBiasa();
        user.pesanKamar(kamar[pilihan], durasi, diskon);
    }
    
}
