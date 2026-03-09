/*  Nama File   : Kendaraan.java
*   Deskripsi   : berisi atribut dan method dalam class Kendaraan
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 5 Maret 2026
*   Lab         : PBO C1
*/

public class Kendaraan {
    /***************ATRIBUT***************/
    private String noPlat;
    private String jenis;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor kendaraan tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor kendaraan dengan parameter input-an 
    public Kendaraan(String plat, String jenis){
        this.noPlat = plat;
        this.jenis = jenis;
    }

    /**************SELEKTOR**************/
    // Selektor kendaraan untuk mengembalikan plat nomor kendaraan 
    public String getNoPlat(){
        return this.noPlat;
    }

    // Selektor kendaraan untuk mengembalikan jenis kendaraan
    public String getJenis(){
        return this.jenis;
    }

    /**************MUTATOR**************/
    // Mutator kendaraan untuk set plat nomor kendaraan sesuai dengan input-an
    public void setNoPlat(String plat){
        this.noPlat = plat;
    }

    // Mutator kendaraan untuk set jenis kendaraan sesuai dengan input-an
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi kendaraan ke layar
    public void printKendaraan(){
        System.out.println("No Plat: "+this.noPlat+", jenis: "+this.jenis);
    }

}
