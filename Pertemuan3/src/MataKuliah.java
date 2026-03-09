/*  Nama File   : MataKuliah.java
*   Deskripsi   : berisi atribut dan method dalam class MataKuliah
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 5 Maret 2026
*   Lab         : PBO C1
*/

public class MataKuliah {
    /***************ATRIBUT***************/
    private String idMatkul;
    private String nama;
    private int sks;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }
    
    // Konstruktor MataKuliah dengan parameter
    public MataKuliah(String id, String nama, int sks){
        this.idMatkul = id;
        this.nama = nama;
        this.sks = sks;
    }

    /**************SELEKTOR**************/
    // Selektor MataKuliah untuk mengembalikan nilai ID mata kuliah
    public String getID(){
        return this.idMatkul;
    }

    // Selektor MataKuliah untuk mengembalikan nama mata kuliah
    public String getNamaMatkul(){
        return this.nama;
    }

    // Selektor MataKuliah untuk mengembalikan jumlah sks dari mata kuliah
    public int getSKS(){
        return this.sks;
    }

    /***************MUTATOR***************/
    // Mutator MataKuliah untuk set id mata kuliah sesuai dengan input-an
    public void setID(String ID){
        this.idMatkul = ID;
    }

    // Mutator MataKuliah untuk set nama mata kuliah sesuai dengan inout-an
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mutator MataKuliah untuk set sks dari mata kuliah sesuai dengan input-an
    public void setSKS(int sks){
        this.sks = sks;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi mata kuliah ke layar
    public void printMatKul(){
        System.out.println("ID: " + this.idMatkul + ", nama: " + this.nama + ", SKS: " + this.sks);
    }
}
