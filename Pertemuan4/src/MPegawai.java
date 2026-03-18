/*  Nama File   : MPegawai.java
*   Deskripsi   : berisi main dari class Pegawai, Dosen, DosenTetap, DosenTamu, dan Tendik
*   Tanggal     : 18 Maret 2026
*   Lab         : PBO C1
*/

import java.time.LocalDate;

/***************MAIN CLASS***************/
public class MPegawai {
    public static void main(String[] args) {
        /*************OBJEK CLASS*************/
        Pegawai P1 = new DosenTetap();
        Pegawai P2 = new DosenTetap("14263");
        Pegawai P3 = new DosenTamu();
        Pegawai P4 = new DosenTamu("31565", LocalDate.of(2028, 5, 14));
        Pegawai P5 = new Tendik();
        Pegawai P6 = new Tendik("Kemahasiswaan");

        /***************APLIKASI***************/
        Pegawai.printCounterPegawai(); //jumlah objek

        // ******************DOSEN TETAP******************
        System.out.println("*****DOSEN TETAP P1*****"); 
        P1.setNIP("19800101");
        P1.setNama("Budi");
        P1.setTanggalLahir(LocalDate.of(1980, 1, 1));
        P1.setTMT(LocalDate.of(2010, 1, 1));
        P1.setGajiPokok(5000000);
        ((Dosen)(P1)).setFakultas("FSM");
        ((DosenTetap)(P1)).setNIDN("11111");
        System.out.println("NIP: " + P1.getNIP());
        System.out.println("Nama: " + P1.getNama());
        System.out.println("Tanggal Lahir: " + P1.getTanggalLahir());
        System.out.println("TMT: " + P1.getTMT());
        System.out.println("Gaji: " + P1.getGaji());
        System.out.println("Masa Kerja: " + P1.masaKerjaTahun() + " tahun");
        System.out.println("NIDN: " + ((DosenTetap)(P1)).getNIDN());
        System.out.println("Tunjangan: " + ((DosenTetap)(P1)).getTunjanganDosen());
        System.out.println("Tanggal Pensiun: " + ((DosenTetap)(P1)).getTanggalPensiunDosen());
        System.out.println("\nDetail P1:");
        ((DosenTetap)(P1)).printDetailDosenTetap();

        System.out.println("\n*****DOSEN TETAP P2*****");
        P2.setNIP("19850505");
        P2.setNama("Siti");
        P2.setTanggalLahir(LocalDate.of(1985, 5, 5));
        P2.setTMT(LocalDate.of(2015, 3, 1));
        P2.setGajiPokok(6000000);
        ((Dosen)(P2)).setFakultas("FISIP");
        System.out.println("NIP: " + P2.getNIP());
        System.out.println("Nama: " + P2.getNama());
        System.out.println("Tanggal Lahir: " + P2.getTanggalLahir());
        System.out.println("TMT: " + P2.getTMT());
        System.out.println("Gaji: " + P2.getGaji());
        System.out.println("Masa Kerja: " + P2.masaKerjaTahun() + " tahun");
        System.out.println("NIDN: " + ((DosenTetap)(P2)).getNIDN());
        System.out.println("Tunjangan: " + ((DosenTetap)(P2)).getTunjanganDosen());
        System.out.println("\nDetail P2:");
        ((DosenTetap)(P2)).printDetailDosenTetap();

        // ******************DOSEN TAMU******************
        System.out.println("\n*****DOSEN TAMU P3*****");
        P3.setNIP("19900101");
        P3.setNama("Andi");
        P3.setTanggalLahir(LocalDate.of(1990, 1, 1));
        P3.setTMT(LocalDate.of(2020, 1, 1));
        P3.setGajiPokok(4000000);
        ((Dosen)(P3)).setFakultas("FK");
        ((DosenTamu)(P3)).setNIDK("22222");
        System.out.println("NIP: " + P3.getNIP());
        System.out.println("Nama: " + P3.getNama());
        System.out.println("Tanggal Lahir: " + P3.getTanggalLahir());
        System.out.println("TMT: " + P3.getTMT());
        System.out.println("Gaji: " + P3.getGaji());
        System.out.println("NIDK: " + ((DosenTamu)(P3)).getNIDK());
        System.out.println("Tunjangan: " + ((DosenTamu)(P3)).getTunjangan());
        System.out.println("\nDetail P3:");
        ((DosenTamu)(P3)).printDetailDosenTamu();

        System.out.println("\n*****DOSEN TAMU P4*****");
        P4.setNIP("19950505");
        P4.setNama("Rina");
        P4.setTanggalLahir(LocalDate.of(1995, 5, 5));
        P4.setTMT(LocalDate.of(2022, 6, 1));
        P4.setGajiPokok(4500000);
        ((Dosen)(P4)).setFakultas("FEB");
        System.out.println("NIP: " + P4.getNIP());
        System.out.println("Nama: " + P4.getNama());
        System.out.println("Tanggal Lahir: " + P4.getTanggalLahir());
        System.out.println("TMT: " + P4.getTMT());
        System.out.println("Gaji: " + P4.getGaji());
        System.out.println("NIDK: " + ((DosenTamu)(P4)).getNIDK());
        System.out.println("Tanggal Akhir Kontrak: " + ((DosenTamu)(P4)).getTanggalAkhirKontrak());
        System.out.println("Tunjangan: " + ((DosenTamu)(P4)).getTunjangan());
        System.out.println("\nDetail P4:");
        ((DosenTamu)(P4)).printDetailDosenTamu();

        // ******************TENDIK******************
        System.out.println("\n*****TENDIK P5*****");
        P5.setNIP("19751212");
        P5.setNama("Joko");
        P5.setTanggalLahir(LocalDate.of(1975, 12, 12));
        P5.setTMT(LocalDate.of(2005, 1, 1));
        P5.setGajiPokok(3500000);
        ((Tendik)(P5)).setBidang("Akademik");
        System.out.println("NIP: " + P5.getNIP());
        System.out.println("Nama: " + P5.getNama());
        System.out.println("Tanggal Lahir: " + P5.getTanggalLahir());
        System.out.println("TMT: " + P5.getTMT());
        System.out.println("Gaji: " + P5.getGaji());
        System.out.println("Bidang: " + ((Tendik)(P5)).getBidang());
        System.out.println("Tunjangan: " + ((Tendik)(P5)).getTunjanganTendik());
        System.out.println("Tanggal Pensiun: " + ((Tendik)(P5)).getTanggalPensiunTendik());
        System.out.println("\nDetail P5:");
        ((Tendik)(P5)).printInfoTendik();

        System.out.println("\n*****TENDIK P6*****");
        P6.setNIP("19881111");
        P6.setNama("Dewi");
        P6.setTanggalLahir(LocalDate.of(1988, 11, 11));
        P6.setTMT(LocalDate.of(2012, 2, 1));
        P6.setGajiPokok(3700000);
        System.out.println("NIP: " + P6.getNIP());
        System.out.println("Nama: " + P6.getNama());
        System.out.println("Tanggal Lahir: " + P6.getTanggalLahir());
        System.out.println("TMT: " + P6.getTMT());
        System.out.println("Gaji: " + P6.getGaji());
        System.out.println("Bidang: " + ((Tendik)(P6)).getBidang());
        System.out.println("Tunjangan: " + ((Tendik)(P6)).getTunjanganTendik());
        System.out.println("\nDetail P6:");
        ((Tendik)(P6)).printInfoTendik();
    }
}
