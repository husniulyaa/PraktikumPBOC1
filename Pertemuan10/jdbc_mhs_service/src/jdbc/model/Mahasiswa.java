/*  Nama File   : Mahasiswa.java
*   Deskripsi   : berisi atribut dan method dalam class Mahasiswa
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
package jdbc.model;

public class Mahasiswa {
    /***************ATRIBUT***************/
    private int id;
    private String nama;
    
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi data default mahasiswa.
    public Mahasiswa() {
        this.id = 0;
        this.nama = "";
    }

    // Konstruktor dengan parameter id dan nama untuk menginisialisasi data mahasiswa.
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /**************SELEKTOR**************/
    // Mengembalikan id mahasiswa.
    public int getId() {
        return id;
    }

    /***************MUTATOR***************/
    // Mengubah id mahasiswa sesuai input.
    public void setId(int id) {
        this.id = id;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nama mahasiswa.
    public String getNama() {
        return nama;
    }

    /***************MUTATOR***************/
    // Mengubah nama mahasiswa sesuai input.
    public void setNama(String nama) {
        this.nama = nama;
    }

    /*************METHOD LAIN*************/
    // Mengembalikan informasi mahasiswa dalam bentuk string.
    @Override
    public String toString(){
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + "}";
    }
}
