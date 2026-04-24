/*  Nama File   : Anabul.java
*   Deskripsi   : berisi atribut dan method pada class induk Anabul
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package Anabul;

public class Anabul {
    /***************ATRIBUT***************/
    private String Nama;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi nama anabul dengan nilai kosong.
    public Anabul(){
        this.Nama = "";
    }

    // Konstruktor dengan parameter untuk menginisialisasi nama anabul.
    public Anabul(String nama){
        this.Nama = nama;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nama anabul.
    public String getNama(){
        return this.Nama;
    }

    /***************MUTATOR***************/
    // Mengubah nama anabul sesuai input.
    public void setNama(String nama){
        this.Nama = nama;
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan default dari anabul.
    public void Gerak(){
        System.out.println("Kosong");
    }

    // Menampilkan suara default dari anabul.
    public void Bersuara(){
        System.out.println("Kosong");
    }
}
