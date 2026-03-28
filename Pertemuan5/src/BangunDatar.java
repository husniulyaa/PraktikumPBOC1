/*  Nama File   : BangunDatar.java
*   Deskripsi   : berisi atribut dan method dalam class parent BangunDatar 
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 12 Maret 2026
*   Lab         : PBO C1
*/

public class BangunDatar {
    /***************ATRIBUT***************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor BangunDatar tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    // Konstruktor BangunDatar dengan parameter jmlSisi, warna, dan border sesuai input-an
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /**************SELEKTOR**************/
    // Mengembalikan jumlah sisi dari bangun datar
    public int getJmlSisi(){
        return this.jmlSisi;
    }

    // Mengembalikan warna dari bangun datar
    public String getWarna(){
        return warna;
    }

    // Mengembalikan border dari bangun datar
    public String getBorder(){
        return border;
    }

    /***************MUTATOR**************/
    // Mengubah jumlah sisi dari suatu bangun datar
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // Mengubah warna dari suatu bangun datar
    public void setWarna(String warna){
        this.warna = warna;
    }

    // Mengubah border dari bangun datar
    public void setBorder(String Border){
        this.border = Border;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi terkait bangun datar meliputi info jumlah sisi, warna, dan border bangun datar
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: "+border);
    }

    // Menampilkan jumlah objek bangun datar yang sudah dibuat
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
