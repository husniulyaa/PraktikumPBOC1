/*  Nama File   : Kucing.java
*   Deskripsi   : berisi implementasi class Kucing sebagai turunan dari Anabul
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package Anabul;

public class Kucing extends Anabul{
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama kucing.
    public Kucing(String nama){
        super(nama);
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan khas kucing.
    public void Gerak(){
        System.out.println("Kucing melata");
    }

    // Menampilkan suara khas kucing.
    public void Bersuara(){
        System.out.println("Meong");
    }
}
