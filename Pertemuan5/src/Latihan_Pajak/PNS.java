/*  Nama File   : PNS.java
*   Deskripsi   : berisi atribut dan method pada class PNS
*   Tanggal     : 28 Maret 2026
*   Lab         : PBO C1
*/

package Latihan_Pajak;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    /***************ATRIBUT***************/
    private String NIP;
    private static int counterPNS = 0;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor PNS tanpa parameter
    public PNS(){
        this.NIP = "";
        counterPNS++;
    }

    // Konstruktor PNS dengan parameter sesuai identitas pegawai
    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String NIP){
        super(nama, tgl, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    /**************SELEKTOR**************/
    // Mengembalikan NIP PNS
    public String getNIP(){
        return this.NIP;
    }

    /**************MUTATOR**************/
    // Mengubah NIP PNS
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    /************METHOD LAIN************/
    // Mengembalikan jumlah objek PNS yang telah dibuat
    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    // Menampilkan informasi lengkap PNS
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + this.NIP);
    }

    // Menghitung masa kerja PNS
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 1;
    }

    // Menghitung pajak PNS sebesar 10% dari pendapatan
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }
}
