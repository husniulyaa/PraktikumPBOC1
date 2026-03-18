/*  Nama File   : Tendik.java
*   Deskripsi   : berisi class Tendik
*   Tanggal     : 18 Maret 2026
*   Lab         : PBO C1
*/

import java.time.LocalDate;

public class Tendik extends Pegawai{
    /***************ATRIBUT***************/
    private String bidang;
    private final int BatasUsia = 55;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tendik tanpa parameter
    public Tendik(){
        this.bidang = "";
    }

    // Konstruktor tendik dengan parameter sesuai input
    public Tendik(String bidang){
        this.bidang = bidang;
    }

    /*************SELEKTOR**************/
    // Mengembalikan bidang dari tendik
    public String getBidang(){
        return this.bidang;
    }

    // Mengembalikan batas usia dari tendik
    public int getBatasUsiaTendik(){
        return this.BatasUsia;
    }

    // Mengembalikan tunjangan dari tendik
    public double getTunjanganTendik(){
        return 0.01 * masaKerjaTahun() * getGaji();
    }

    // Mengembalikan tanggal pensiun dari tendik
    public LocalDate getTanggalPensiunTendik(){
        return this.Tanggal_Lahir.plusMonths(1).plusYears(BatasUsia);
    }

    /*************MUTATOR*************/
    // Mengeset bidang dari tendik sesuai input
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    /*************METHOD LAIN*************/
    // Menampilkan detail informasi dari tendik
    public void printInfoTendik(){
        super.printInfoPegawai();
        System.out.println("Bidang: " + getBidang());
        System.out.println("Batas usia: " + getBatasUsiaTendik());
        System.out.println("Tunjangan: " + getTunjanganTendik());
        System.out.println("Tanggal Pensiun: " + getTanggalPensiunTendik());
    }
}
