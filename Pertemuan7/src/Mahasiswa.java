/*  Nama File   : Mahasiswa.java
*   Deskripsi   : berisi atribut dan method dalam class Mahasiswa untuk demonstrasi overloading konstruktor dan method
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

public class Mahasiswa {
    /***************ATRIBUT***************/
    private String NIM;
    private String Nama;
    private String programStudi;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi data default mahasiswa.
    public Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.programStudi = "n/a";
    }

    // Konstruktor dengan parameter untuk menginisialisasi nim, nama, dan program studi mahasiswa.
    public Mahasiswa(String nim, String nama, String prodi){
        this.NIM = nim;
        this.Nama = nama;
        this.programStudi = prodi;
    }

    // Konstruktor salinan untuk membuat objek mahasiswa baru dari objek mahasiswa lain.
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.getNIM();
        this.Nama = m.getNama();
        this.programStudi = m.getProgramStudi();
    }

    /**************SELEKTOR**************/
    // Mengembalikan NIM mahasiswa.
    public String getNIM(){
        return this.NIM;
    }

    // Mengembalikan nama mahasiswa.
    public String getNama(){
        return this.Nama;
    }

    // Mengembalikan program studi mahasiswa.
    public String getProgramStudi(){
        return this.programStudi;
    }

    /***************MUTATOR***************/
    // Mengubah NIM mahasiswa sesuai input.
    public void setNIM(String nim){
        this.NIM = nim;
    }

    // Mengubah nama mahasiswa sesuai input.
    public void setNama(String nama){
        this.Nama = nama;
    }

    // Mengubah program studi mahasiswa menjadi nilai default "Kosong".
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }

    // Mengubah program studi mahasiswa sesuai input string.
    public void setProgramStudi(String prodi){
        this.programStudi = prodi;
    }

    // Mengubah program studi mahasiswa mengikuti program studi objek mahasiswa lain.
    public void setProgramStudi(Mahasiswa m){
        this.programStudi = m.getProgramStudi();
    }

    /*************METHOD LAIN*************/
    // Menampilkan seluruh informasi mahasiswa ke layar.
    public void printInfo(){
        System.out.println("NIM: " + this.getNIM());
        System.out.println("Nama: " + getNama());
        System.out.println("Program Studi: " + this.programStudi);
    }
}
