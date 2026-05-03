/*  Nama File   : Kembangtelon.java
*   Deskripsi   : berisi implementasi class Kembangtelon sebagai turunan dari Kucing
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class Kembangtelon extends Kucing {
    /***************ATRIBUT***************/
    private String jenisKelamin;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk menginisialisasi nama dan bobot kembangtelon.
    public Kembangtelon(String nama, double bobot){
        super(nama, bobot);
        this.jenisKelamin = "";
    }

    // Konstruktor untuk menginisialisasi nama, bobot, dan jenis kelamin kembangtelon.
    public Kembangtelon(String nama, double bobot, String jenisKelamin){
        super(nama, bobot);
        this.jenisKelamin = jenisKelamin;
    }

    /**************SELEKTOR**************/
    // Mengembalikan jenis kelamin kembangtelon.
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }

    /***************MUTATOR***************/
    // Mengubah jenis kelamin kembangtelon sesuai input.
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    /*************METHOD LAIN*************/
    // Menampilkan gerakan khas kembangtelon.
    @Override
    public void Gerak(){
        System.out.println("Meloncat cepat dan lincah");
    }

    // Menampilkan suara khas kembangtelon.
    @Override
    public void Bersuara(){
        System.out.println("Meong keras");
    }
    
}
