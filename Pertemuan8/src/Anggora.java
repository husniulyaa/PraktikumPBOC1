/*  Nama File   : Anggora.java
*   Deskripsi   : berisi implementasi class Anggora sebagai turunan dari Kucing
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class Anggora extends Kucing{
    /***************ATRIBUT***************/
    private String warna;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama dan bobot anggora.
    public Anggora(String nama, double bobot){
        super(nama, bobot);
        this.warna = "";
    }

    // Konstruktor untuk menginisialisasi nama, bobot, dan warna anggora.
    public Anggora(String nama, double bobot, String warna){
        super(nama, bobot);
        this.warna = warna;
    }

    /**************SELEKTOR**************/
    // Mengembalikan warna anggora.
    public String getWarna(){
        return this.warna;
    }

    /***************MUTATOR***************/
    // Mengubah warna anggora sesuai input.
    public void setWarna(String warna){
        this.warna = warna;
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan khas anggora.
    @Override
    public void Gerak(){
        System.out.println("Berlari dengan elegan");
    }

    // Menampilkan suara khas anggora.
    @Override
    public void Bersuara (){
        System.out.println("Meong secara halus");
    }
}
