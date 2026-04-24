/*  Nama File   : Mahasiswa.java
*   Deskripsi   : berisi atribut dan method pada class Mahasiswa sebagai turunan dari Civitasakademika
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package civitasAkademik;

public class Mahasiswa extends Civitasakademika{
    /***************ATRIBUT***************/
    private String NIM;
    private Dosen Dosenwali;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi NIM mahasiswa dengan nilai kosong.
    public Mahasiswa(){
        this.NIM = "";
    }

    // Konstruktor dengan parameter untuk menginisialisasi NIM dan dosen wali mahasiswa.
    public Mahasiswa(String NIM, Dosen D){
        this.NIM = NIM;
        this.Dosenwali = D;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nomor identitas mahasiswa berupa NIM.
    public String getNomor(){
        return this.NIM;
    }

    // Mengembalikan objek dosen wali mahasiswa.
    public Dosen getDosenwali(){
        return this.Dosenwali;
    }

    /***************MUTATOR***************/
    // Mengubah nomor identitas mahasiswa sesuai input.
    public void setNomor(String NIM){
        this.NIM = NIM;
    }

    // Mengubah dosen wali mahasiswa sesuai input.
    public void setWali(Dosen D){
        this.Dosenwali = D;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi mahasiswa berupa NIM, nama, dan dosen wali.
    public void tampilDataMahasiswa(){
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama: " + getNama());
        System.out.println("Dosen wali: " + getDosenwali().getNama());
    }
}
