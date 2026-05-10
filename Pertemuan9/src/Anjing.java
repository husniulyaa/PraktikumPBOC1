/*  Nama File   : Anjing.java
*   Deskripsi   : berisi implementasi class Anjing sebagai turunan dari Anabul
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

public class Anjing extends Anabul {
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama anjing.
    public Anjing(String nama, String panggilan){
        super(nama, panggilan);
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan khas anjing.
    public void Gerak(){
        System.out.println("Anjing melata");
    }

    // Menampilkan suara khas anjing.
    public void Bersuara(){
        System.out.println("Guk-guk");
    }
}
