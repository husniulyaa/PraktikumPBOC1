/*  Nama File   : Pengusaha.java
*   Deskripsi   : berisi atribut dan method pada class Pengusaha
*   Tanggal     : 28 Maret 2026
*   Lab         : PBO C1
*/

package Latihan_Pajak;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia{
    /***************ATRIBUT***************/
    private String NPWP;
    private static int counterPengusaha = 0;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor pengusaha tanpa parameter
    public Pengusaha(){
        this.NPWP = "";
        counterPengusaha++;
    }

    // Konstruktor pengusaha dengan parameter sesuai identitas wajib pajak
    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String NPWP){
        super(nama, tgl, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    /**************SELEKTOR**************/
    // Mengembalikan NPWP pengusaha
    public String getNPWP(){
        return this.NPWP;
    }

    /**************MUTATOR**************/
    // Mengubah NPWP pengusaha
    public void setNPWP(String NPWP){
        this.NPWP = NPWP;
    }

    /************METHOD LAIN************/
    // Mengembalikan jumlah objek pengusaha yang telah dibuat
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    // Menampilkan informasi lengkap pengusaha
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + this.NPWP);
    }

    // Menghitung masa kerja pengusaha
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 2;
    }

    // Menghitung pajak pengusaha sebesar 15% dari pendapatan
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }
}

