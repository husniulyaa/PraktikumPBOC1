/*  Nama File   : Kucing.java
*   Deskripsi   : berisi implementasi class Kucing sebagai turunan dari Anabul
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

public class Kucing extends Anabul{
    /***************ATRIBUT***************/
    private double bobot;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama kucing.
    public Kucing(String nama, String panggilan, double bobot){
        super(nama, panggilan);
        this.bobot = bobot;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nilai bobot kucing dalam kg
    public double getBobot(){
        return this.bobot;
    }

    /***************MUTATOR***************/
    // Menge-set nilai bobot kucing sesuai masukan
    public void setBobot(double bobot){
        this.bobot = bobot;
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
