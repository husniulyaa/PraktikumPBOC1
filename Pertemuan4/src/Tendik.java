import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;
    private final int BatasUsia = 55;

    public Tendik(){
        this.bidang = "";
    }

    public Tendik(String bidang){
        this.bidang = bidang;
    }

    public String getBidang(){
        return this.bidang;
    }

    public int getBatasUsiaTendik(){
        return this.BatasUsia;
    }

    public double getTunjanganTendik(){
        return 0.01 * masaKerjaTahun() * getGaji();
    }

    public LocalDate getTanggalPensiunTendik(){
        return this.Tanggal_Lahir.plusMonths(1).plusYears(BatasUsia);
    }
}
