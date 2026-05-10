/*  Nama File   : Burung.java
*   Deskripsi   : berisi implementasi class Burung sebagai turunan dari Anabul
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

public class Burung extends Anabul{
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama burung.
    public Burung(String nama, String panggilan){
        super(nama, panggilan);
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan khas burung.
    public void Gerak(){
        System.out.println("Burung terbang");
    }

    // Menampilkan suara khas burung.
    public void Bersuara(){
        System.out.println("Cuit");
    }
}
