/*  Nama File   : Lingkaran.java
*   Deskripsi   : berisi atribut dan method dalam class child Lingkaran 
*   Tanggal     : 12 Maret 2026
*   Lab         : PBO C1
*/

public class Lingkaran extends BangunDatar {
    /***************ATRIBUT***************/
    private double jari;

    /***************METHOD****************/
    /*************KONSTRUKTOR*************/
    // Konstruktor lingkaran tanpa parameter
    public Lingkaran(){
        this.jari = 0;
        setJmlSisi(1);
    }

    // Konstruktor lingkaran menggunakan parameter sesuai dengan input-an
    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    /***************SELEKTOR**************/
    // Mengembalikan jari-jari dari bangun datar lingkaran 
    public double getJari(){
        return this.jari;
    }

    // Mengembalikan luas dari bangun datar lingkaran
    public double getLuas(){
        return Math.PI*Math.pow(jari, 2);
    }

    // Mengembalikan keliling dari bangun datar lingkaran
    public double getKeliling(){
        return 2*Math.PI*this.jari;
    }

    /***************MUTATOR***************/
    // Mengubah jari-jari dari bangun datar lingkaran
    public void setJari(double jari){
        this.jari = jari;
    }

    /**************METHOD LAIN*************/ 
    // Menampilkan informasi terkait bangun datar lingkaran meliputi jumlah sisi, warna, border, dan besar jari-jari lingkaran
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + this.jari);
    }
}
