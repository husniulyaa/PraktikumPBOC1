/*  Nama File   : Petani.java
*   Deskripsi   : berisi atribut dan method pada class Petani
*   Tanggal     : 28 Maret 2026
*   Lab         : PBO C1
*/

package Latihan_Pajak;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    /***************ATRIBUT***************/
    private String asal_kota;
    private static int counterPetani = 0;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor petani tanpa parameter
    public Petani(){
        this.asal_kota = "";
        counterPetani++;
    }

    // Konstruktor petani dengan parameter sesuai identitas wajib pajak
    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan, String asalKota){
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asalKota;
        counterPetani++;
    }

    /**************SELEKTOR**************/
    // Mengembalikan asal kota petani
    public String getAsalKota(){
        return this.asal_kota;
    }

    /**************MUTATOR**************/
    // Mengubah asal kota petani
    public void setAsalKota(String asalKota){
        this.asal_kota = asalKota;
    }

    /************METHOD LAIN************/
    // Mengembalikan jumlah objek petani yang telah dibuat
    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    // Menampilkan informasi lengkap petani
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + this.asal_kota);
    }

    // Menghitung masa kerja petani
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    // Menghitung pajak petani
    public double hitungPajak(){
        return 0;
    }
}
