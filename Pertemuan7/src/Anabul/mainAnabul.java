/*  Nama File   : mainAnabul.java
*   Deskripsi   : berisi program utama untuk menguji class Anabul, Kucing, Anjing, dan Burung
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package Anabul;

public class mainAnabul {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk membuat objek anabul dan menguji polimorfisme pada method suara dan gerak.
    public static void main(String[] args) {
        // Deklarasi tiga referensi objek anabul.
        Anabul A1;
        Anabul A2;
        Anabul A3;

        // Inisialisasi objek anabul dari class turunan yang berbeda.
        A1 = new Kucing("Miko");
        A2 = new Anjing("Phaw phaw");
        A3 = new Burung("Ocong");

        // Menampilkan data dan perilaku objek anabul pertama.
        System.out.println("------------------------- Anabul 1 ----------------------------");
        System.out.println("Nama: " + A1.getNama());
        System.out.print("Suara: ");
        A1.Bersuara();
        System.out.print("Gerak: ");
        A1.Gerak();

        // Menampilkan data dan perilaku objek anabul kedua.
        System.out.println("------------------------- Anabul 2 ----------------------------");
        System.out.println("Nama: " + A2.getNama());
        System.out.print("Suara: ");
        A2.Bersuara();
        System.out.print("Gerak: ");
        A2.Gerak();

        // Menampilkan data dan perilaku objek anabul ketiga.
        System.out.println("------------------------- Anabul 3 ----------------------------");
        System.out.println("Nama: " + A3.getNama());
        System.out.print("Suara: ");
        A3.Bersuara();
        System.out.print("Gerak: ");
        A3.Gerak();
    }
}
