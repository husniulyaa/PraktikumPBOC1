/*  Nama File   : DosenTetap.java
*   Deskripsi   : berisi class DosenTetap
*   Tanggal     : 18 Maret 2026
*   Lab         : PBO C1
*/

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    /***************ATRIBUT***************/
    private String NIDN;
    private final int BatasUsia = 65;

    /***************METHOD***************/
    /************KONSTRUKTOR************/
    // Konstruktor dosen tetap tanpa parameter
    public DosenTetap(){
        this.NIDN = "";
    }

    // Konstruktor dosen tetap dengan parameter sesuai inputan
    public DosenTetap(String NIDN){
        this.NIDN = NIDN;
    }

    /*************SELEKTOR*************/
    // Mengembalikan NIDN dari dosen tetap
    public String getNIDN(){
        return this.NIDN;
    }

    // Mengembalikan batas usia dosen tetap
    public int getBatasUsiaDosen(){
        return this.BatasUsia;
    }

    // Mengembalikan tunjangan dosen tetap
    public double getTunjanganDosen(){
        return 0.02 * masaKerjaTahun() * getGaji();
    }

    // Mengembalikan tanggal pensiun dari dosen tetap
    public LocalDate getTanggalPensiunDosen(){
        return this.Tanggal_Lahir.plusMonths(1).plusYears(BatasUsia);
    }

    /*************MUTATOR*************/
    // Menge-set NIDN dosen tetap sesuai dengan input-an
    public void setNIDN(String nidn){
        this.NIDN = nidn;
    }

    /*************METHOD LAIN*************/
    // Menampilkan informasi detail dari dosen tetap
    public void printDetailDosenTetap(){
        super.printInfoDosen();
        System.out.println("NIDN: " + getNIDN());
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiunDosen());
        System.out.println("Tunjangan: " + getTunjanganDosen());
    }
}
