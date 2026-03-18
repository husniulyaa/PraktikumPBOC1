/*  Nama File   : DosenTamu.java
*   Deskripsi   : berisi class DosenTamu
*   Tanggal     : 18 Maret 2026
*   Lab         : PBO C1
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen{
    /***************ATRIBUT***************/
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;

    /***************METHOD***************/
    /************KONSTRUKTOR*************/
    // Konstruktor dosen tamu tanpa parameter
    public DosenTamu(){
        this.NIDK = "";
        this.tanggalAkhirKontrak = null;
    }

    // Konstruktor dosen tamu sesuai input an
    public DosenTamu(String NIDK, LocalDate TAK){
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = TAK;
    }

    /*************SELEKTOR**************/
    // Mengembalikan NIDK dari dosen tamu
    public String getNIDK(){
        return this.NIDK;
    }

    // Mengembalikan tanggal akhir kontrak
    public LocalDate getTanggalAkhirKontrak(){
        return this.tanggalAkhirKontrak;
    }

    // Mengembalikan tunjangan dari dosen tamu
    public double getTunjangan(){
        return 0.25 * getGaji();
    }

    /*************MUTATOR*************/
    // Mengeset NIDK dosen tamu sesuai input
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    /*************METHOD LAIN*************/
    // Menampilkan detail informasi dari dosen tamu
    public void printDetailDosenTamu(){
        super.printInfoDosen();
        System.out.println("NIDK: " + getNIDK());
        System.out.println("Tanggal akhir kontrak: " + getTanggalAkhirKontrak());
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
