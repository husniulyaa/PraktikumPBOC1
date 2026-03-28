/*  Nama File   : Manusia.java
*   Deskripsi   : berisi atribut dan method dasar pada class abstrak Manusia
*   Tanggal     : 28 Maret 2026
*   Lab         : PBO C1
*/

package Latihan_Pajak;

import java.time.LocalDate;

public abstract class Manusia {
    /***************ATRIBUT***************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor manusia tanpa parameter
    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = null;
        this.alamat = "";
        this.pendapatan = 0;
        counterMns++;
    }

    // Konstruktor manusia dengan parameter sesuai data wajib pajak
    public Manusia(String nama, LocalDate tgl, String alamat, double pendpatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl;
        this.alamat = alamat;
        this.pendapatan = pendpatan;
        counterMns++;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nama manusia
    public String getNama(){
        return this.nama;
    }

    // Mengembalikan tanggal mulai kerja manusia
    public LocalDate getTanggalMulai(){
        return this.tgl_mulai_kerja;
    }

    // Mengembalikan alamat manusia
    public String getAlamat(){
        return this.alamat;
    }

    // Mengembalikan pendapatan manusia
    public double getPendapatan(){
        return this.pendapatan;
    }

    /**************MUTATOR**************/
    // Mengubah nama manusia
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mengubah tanggal mulai kerja manusia
    public void setTMK(LocalDate date){
        this.tgl_mulai_kerja = date;
    }

    // Mengubah alamat manusia
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    // Mengubah pendapatan manusia
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
 
    /************METHOD LAIN************/
    // Mengembalikan jumlah objek manusia yang telah dibuat
    public static int getCounterMns(){
        return counterMns;
    }

    // Menampilkan informasi umum manusia
    public void cetakInfo(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Mulai Kerja: " + this.tgl_mulai_kerja);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Pendapatan: " + this.pendapatan);
    }

    // Method abstrak untuk menghitung masa kerja turunan manusia
    public abstract int hitungMasaKerja();
}
