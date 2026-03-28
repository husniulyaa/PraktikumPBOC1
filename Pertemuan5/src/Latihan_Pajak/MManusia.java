/*  Nama File   : MManusia.java
*   Deskripsi   : berisi main untuk pengujian class Manusia, PNS, Pengusaha, dan Petani
*   Tanggal     : 28 Maret 2026
*   Lab         : PBO C1
*/

package Latihan_Pajak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MManusia {
    // Mengonversi tanggal bertipe String menjadi LocalDate
    public static LocalDate konversiTanggal(String tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(tanggal, formatter);
    }

    public static void main(String[] args) {
        // Pembuatan objek-objek manusia sesuai profesinya
        PNS p1 = new PNS("Satriyo", konversiTanggal("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", konversiTanggal("01-01-2000"), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", konversiTanggal("09-01-1977"),"Jl. Bunga 9 Tembalang",5000000,"wonogiri");
        PNS p2 = new PNS("Panji", konversiTanggal("01-04-2010"), "", 10000000, "198004212010041002");

        // Mengubah alamat PNS kedua setelah objek dibuat
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Menampilkan jumlah objek dari masing-masing class
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        // Menampilkan besar pajak dari masing-masing objek
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        // Menampilkan masa kerja dari masing-masing objek
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        // Menampilkan informasi lengkap dari tiap objek
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
