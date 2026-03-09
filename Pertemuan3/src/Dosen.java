/*  Nama File   : Dosen.java
*   Deskripsi   : berisi atribut dan method dalam class Dosen
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 5 Maret 2026
*   Lab         : PBO C1
*/

public class Dosen{
    /***************ATRIBUT***************/
    private String NIP;
    private String nama;
    private String prodi;

    /***************METHOD***************/
    /*************KONSTRUKTOR************/
    // konstruktor tanpa parameter
    public Dosen(){
        this.NIP = "";
        this.nama = "";
        this.prodi = "";
    }

    //konstruktor dengan parameter NIP, Nama, Prodi
    public Dosen(String NIP, String nama, String prodi){
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi; 
    }

    /**************SELEKTOR**************/
    // Selektor untuk mendapatkan NIP dosen
    public String getNIP(){
        return this.NIP;
    }

    // Selektor untuk mendapatkan informasi nama dosen
    public String getNama(){
        return this.nama;
    }

    // Selektor untuk mendapatkan informasi prodi dari dosen
    public String getProdi(){
        return this.prodi;
    }

    /**************MUTATOR**************/
    // Mutator untuk set NIP dosen sesuai input-an
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // Mutator untuk set nama dosen sesuai input-an
    public void setNama(String Nama){
        this.nama = Nama;
    }

    // Mutator untuk set prodi dosen sesuai input-an
    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }

    /*************METHOD LAIN*************/
    // Menampilkan data dosen ke layar
    public void printDosen(){
        System.out.println("NIP: " + this.NIP + ", Nama: " + this.nama + ", Prodi: " + this.prodi);
    }
}