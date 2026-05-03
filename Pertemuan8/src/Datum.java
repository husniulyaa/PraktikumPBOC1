/*  Nama File   : Datum.java
*   Deskripsi   : berisi implementasi class generik Datum untuk menyimpan satu data
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class Datum<T> {
    /***************ATRIBUT***************/
    private T isi;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi isi datum.
    public Datum(T isi){
        this.isi = isi;
    }

    /**************SELEKTOR**************/
    // Mengembalikan isi datum.
    public T getIsi(){
        return this.isi;
    }

    /***************MUTATOR***************/
    // Mengubah isi datum sesuai input.
    public void setIsi(T isibaru){
        this.isi = isibaru;
    }
}
