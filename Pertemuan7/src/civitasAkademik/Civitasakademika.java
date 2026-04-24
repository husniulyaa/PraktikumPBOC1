/*  Nama File   : Civitasakademika.java
*   Deskripsi   : berisi atribut dan method abstrak pada class induk Civitasakademika
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package civitasAkademik;

public abstract class Civitasakademika {
    /***************ATRIBUT***************/
    private String Nama;
    
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi nama civitas akademika dengan nilai kosong.
    public Civitasakademika(){
        this.Nama = "";
    }

    // Konstruktor dengan parameter untuk menginisialisasi nama civitas akademika.
    public Civitasakademika(String nama){
        this.Nama = nama;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nama civitas akademika.
    public String getNama(){
        return this.Nama;
    }

    /***************MUTATOR***************/
    // Mengubah nama civitas akademika sesuai input.
    public void setNama(String nama){
        this.Nama = nama;
    }

    /*************METHOD LAIN*************/
    // Method abstrak untuk mengembalikan nomor identitas sesuai jenis civitas akademika.
    public abstract String getNomor();

    // Method abstrak untuk mengubah nomor identitas sesuai jenis civitas akademika.
    public abstract void setNomor(String nomor);
}
