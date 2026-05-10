/*  Nama File   : Anabul.java
*   Deskripsi   : berisi atribut dan method pada class induk Anabul
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

public class Anabul {
    /***************ATRIBUT***************/
    private String Nama;
    private String panggilan;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi nama anabul dengan nilai kosong.
    public Anabul(){
        this.Nama = "";
        this.panggilan = "";
    }

    // Konstruktor dengan parameter untuk menginisialisasi nama anabul.
    public Anabul(String nama, String panggilan){
        this.Nama = nama;
        this.panggilan = panggilan;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nama anabul.
    public String getNama(){
        return this.Nama;
    }

    // Mengembalikan panggilan anabul.
    public String getPanggilan(){
        return this.panggilan;
    }

    /***************MUTATOR***************/
    // Mengubah nama anabul sesuai input.
    public void setNama(String nama){
        this.Nama = nama;
    }

    // Mengubah panggilan anabul sesuai input.
    public void setPanggilan(String panggilan){
        this.panggilan = panggilan;
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan default dari anabul.
    public void Gerak() {

    }

    // Menampilkan suara default dari anabul.
    public void Bersuara(){
        
    }
}
