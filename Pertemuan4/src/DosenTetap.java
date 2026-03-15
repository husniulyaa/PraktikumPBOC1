import java.time.LocalDate;

public class DosenTetap extends Dosen{
    private String NIDN;
    private final int BatasUsia = 65;

    public DosenTetap(){
        this.NIDN = "";
    }

    public DosenTetap(String NIDN){
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return this.NIDN;
    }

    public int getBatasUsiaDosen(){
        return this.BatasUsia;
    }

    public double getTunjanganDosen(){
        return 0.02 * masaKerjaTahun() * getGaji();
    }

    public LocalDate getTanggalPensiunDosen(){
        return this.Tanggal_Lahir.plusMonths(1).plusYears(BatasUsia);
    }

    public void getDetailDosenTetap(){
        super.printInfoDosen();
        System.out.println("NIDN: " + getNIDN());
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiunDosen());
        System.out.println("Tunjangan: " + getTunjanganDosen());
    }
}
