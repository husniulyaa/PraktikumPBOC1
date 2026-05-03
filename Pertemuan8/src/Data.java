/*  Nama File   : Data.java
*   Deskripsi   : berisi implementasi class generik Data untuk menyimpan banyak data
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class Data<T> {
    /***************ATRIBUT***************/
    private static final int Kapasitas = 100;
    private T[] ruang;
    private int banyak;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi ruang data dan jumlah data.
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[Kapasitas];
        banyak = 0;
    }

    /**************SELEKTOR**************/
    // Mengembalikan isi data pada posisi tertentu.
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi){
        if (posisi >= 1 && posisi <= Kapasitas && posisi <= banyak){
            return (T) ruang[posisi-1];
        }
        return null;
    }

    /***************MUTATOR***************/
    // Mengisi data pada posisi tertentu.
    public void setIsi(int posisi, T isi){
        if (posisi >= 1 && posisi <= Kapasitas){
            ruang[posisi-1] = isi;
            if (posisi > banyak){
                banyak = posisi;
            }
        }
    }

    /**************SELEKTOR**************/
    // Mengembalikan banyak data yang sudah terisi.
    public int getSize(){
        return this.banyak;
    }

    // Mengembalikan kapasitas maksimum data.
    public int getKapasitas(){
        return Kapasitas;
    }
}
