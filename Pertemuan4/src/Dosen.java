/*  Nama File   : Dosen.java
*   Deskripsi   : berisi class Dosen
*   Tanggal     : 18 Maret 2026
*   Lab         : PBO C1
*/

public class Dosen extends Pegawai {
    /***************ATRIBUT***************/
    protected String fakultas;

    /***************METHOD***************/
    /************KONSTRUKTOR************/
    // Konstruktor dosen tanpa parameter
    public Dosen(){
        this.fakultas = "";
    }

    // Konstruktor dosen dengan parameter sesuai input-an
    public Dosen(String fakul){
        this.fakultas = fakul;
    }

    /*************SELEKTOR*************/
    // Mengembalikan fakultas dari dosen
    public String getFakultas(){
        return this.fakultas;
    }

    /*************MUTATOR*************/
    // Menge-set fakultas dosen sesuai dengan input-an
    public void setFakultas(String fakul){
        this.fakultas = fakul;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi dosen 
    public void printInfoDosen(){
        super.printInfoPegawai();
        System.out.println("fakultas: " + this.fakultas);
    }
}
