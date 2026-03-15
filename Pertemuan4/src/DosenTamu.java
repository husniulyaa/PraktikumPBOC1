import java.time.LocalDate;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(){
        this.NIDK = "";
        this.tanggalAkhirKontrak = null;
    }

    public DosenTamu(String NIDK, LocalDate TAK){
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = TAK;
    }

    public String getNIDK(){
        return this.NIDK;
    }

    public LocalDate getTanggalAkhirKontrak(){
        return this.tanggalAkhirKontrak;
    }

    public double getTunjangan(){
        return 0.25 * getGaji();
    }

    public void printDetailDosenTamu(){
        super.printInfoDosen();
        System.out.println("NIDK: " + getNIDK());
        System.out.println("Tanggal akhir kontrak: " + getTanggalAkhirKontrak());
        System.out.println("Tunjangan: " + getTunjangan());
    }

}
