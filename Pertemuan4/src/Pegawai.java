/*  Nama File   : Pegawai.java
*   Deskripsi   : berisi class Pegawai
*   Tanggal     : 18 Maret 2026
*   Lab         : PBO C1
*/

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /***************ATRIBUT***************/
    protected String NIP;
    protected String Nama;
    protected LocalDate Tanggal_Lahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    private static int getCounterPegawai = 0;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor pegawai tanpa parameter
    public Pegawai(){
        this.NIP = "";
        this.Nama = "";
        this.Tanggal_Lahir = null;
        this.TMT = LocalDate.now();
        this.gajiPokok = 0;
        getCounterPegawai++;
    }

    // Konstruktor pegawai dengan parameter sesuai input
    public Pegawai(String NIP, String Nama, LocalDate TL, LocalDate TMT, double gaji){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tanggal_Lahir = TL;
        this.TMT = TMT;
        this.gajiPokok = gaji;
        getCounterPegawai++;
    }

    /***************SELEKTOR**************/
    // Mengembalikan NIP dari pegawai
    public String getNIP(){
        return this.NIP;
    }

    // Mengembalikan nama dari pegawai
    public String getNama(){
        return this.Nama;
    }

    // Mengembalikan tanggal lahir dari pegawai
    public LocalDate getTanggalLahir(){
        return this.Tanggal_Lahir;
    }

    // Mengembalikan terhitung mulai tanggal bekerja dari pegawai
    public LocalDate getTMT(){
        return this.TMT;
    }

    // Mengembalikan gaji dari pegawai
    public double getGaji(){
        return this.gajiPokok;
    }

    /***************MUTATOR***************/
    // Mengeset NIP dari pegawai sesuai dengan input
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // Mengeset nama dari pegawai sesuai input
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Mengeset tanggal lahir dari pegawai sesuai input
    public void setTanggalLahir(LocalDate TL){
        this.Tanggal_Lahir = TL;
    }

    // Mengeset tanggal terhitung mulai masuk dari pegawai sesuai input
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    // Mengeset gaji pokok dari pegawai sesuai input
    public void setGajiPokok(double gaji){
        this.gajiPokok = gaji;
    }

    /*************METHOD LAIN*************/
    // Mengembalikan masa kerja dalam tahun dari pegawai
    public int masaKerjaTahun(){
        return Period.between(this.TMT, LocalDate.now()).getYears(); 
    }

    // Menampilkan informasi masa kerja dari pegawai
    public void MasaKerja(){
        Period info = Period.between(this.TMT, LocalDate.now());
        System.out.println(info.getYears() + " tahun " + info.getMonths() + " bulan"); 
    }

    // Menampilkan informasi dari pegawai
    public void printInfoPegawai(){
        System.out.println("NIP: " + this.NIP);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Tanggal Lahir: " + this.Tanggal_Lahir);
        System.out.println("TMT: " + this.TMT);
        System.out.print("Masa Kerja: ");
        MasaKerja();
        System.out.println("Gaji Pokok: " + getGaji());
    }

    // Menampilkan banyak objek yang terbuat dari pegawai
    public static void printCounterPegawai(){
        System.out.println("Jumlah objek pegawai: " + getCounterPegawai);
    }
}
