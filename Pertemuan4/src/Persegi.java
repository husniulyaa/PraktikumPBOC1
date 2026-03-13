/*  Nama File   : Persegi.java
*   Deskripsi   : berisi atribut dan method dalam class child Persegi 
*   Tanggal     : 12 Maret 2026
*   Lab         : PBO C1
*/

public class Persegi extends BangunDatar {
    /***************ATRIBUT***************/
    private double sisi;

    /***************METHOD****************/
    /*************KONSTRUKTOR*************/
    // Konstruktor persegi tanpa parameter
    public Persegi(){
        setJmlSisi(4);
        this.sisi = 0;
    }

    // Konstruktor persegi dengan parameter sisi, warna, dan border sesuai input-an
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    /***************SELEKTOR***************/
    // Mengembalikan panjang sisi dari bangun datar persegi
    public double getSisi(){
        return this.sisi;
    }

    // Mengembalikan luas dari bangun datar persegi 
    public double getLuas(){
        return Math.pow(this.sisi, 2);
    }

    // Mengembalikan keliling dari bangun datar persegi
    public double getKeliling(){
        return 4*this.sisi;
    }

    // Mengembalikan diagonal bangun datar persegi
    public double getDiagonal(){
        return this.sisi*(Math.sqrt(2));
    }

    /***************MUTATOR***************/
    // Mengubah panjang sisi dari persegi sesuai dengan input-an sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi dari class bangun datar persegi ke layar
    @Override // Melakukan Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
