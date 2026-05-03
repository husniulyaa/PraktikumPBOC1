/*  Nama File   : Anjing.java
*   Deskripsi   : berisi implementasi class Anjing sebagai turunan dari Anabul
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

public class Anjing extends Anabul {
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama anjing.
    public Anjing(String nama){
        super(nama);
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
