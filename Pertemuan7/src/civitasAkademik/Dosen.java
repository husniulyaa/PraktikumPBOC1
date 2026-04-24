/*  Nama File   : Dosen.java
*   Deskripsi   : berisi atribut dan method pada class Dosen sebagai turunan dari Civitasakademika
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package civitasAkademik;

public class Dosen extends Civitasakademika{
    /***************ATRIBUT***************/
    private String NIP;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi NIP dosen dengan nilai kosong.
    public Dosen(){
        this.NIP = "";
    }

    // Konstruktor dengan parameter untuk menginisialisasi NIP dosen.
    public Dosen(String NIP){
        this.NIP = NIP;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nomor identitas dosen berupa NIP.
    public String getNomor(){
        return this.NIP;
    }

    /***************MUTATOR***************/
    // Mengubah nomor identitas dosen sesuai input.
    public void setNomor(String NIP){
        this.NIP = NIP;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi dosen berupa nama dan NIP.
    public void printInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNomor());
    }
}
