import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /***************ATRIBUT***************/
    protected String NIP;
    protected String Nama;
    protected LocalDate Tanggal_Lahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    private static int getCounterPegawai = 0;

    /*************KONSTRUKTOR*************/
    public Pegawai(){
        this.NIP = "";
        this.Nama = "";
        this.Tanggal_Lahir = null;
        this.TMT = LocalDate.now();
        this.gajiPokok = 0;
        getCounterPegawai++;
    }

    public Pegawai(String NIP, String Nama, LocalDate TL, LocalDate TMT, double gaji){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tanggal_Lahir = TL;
        this.TMT = TMT;
        this.gajiPokok = gaji;
        getCounterPegawai++;
    }

    /***************SELEKTOR**************/
    public String getNIP(){
        return this.NIP;
    }

    public String getNama(){
        return this.Nama;
    }

    public LocalDate getTanggalLahir(){
        return this.Tanggal_Lahir;
    }

    public LocalDate getTMT(){
        return this.TMT;
    }

    public double getGaji(){
        return this.gajiPokok;
    }

    /***************MUTATOR***************/
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTanggalLahir(LocalDate TL){
        this.Tanggal_Lahir = TL;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double gaji){
        this.gajiPokok = gaji;
    }

    /*************METHOD LAIN*************/
    public int masaKerjaTahun(){
        return Period.between(this.TMT, LocalDate.now()).getYears(); 
    }

    public void MasaKerja(){
        Period info = Period.between(this.TMT, LocalDate.now());
        System.out.println(info.getYears() + "tahun " + info.getMonths() + "bulan"); 
    }

    public void printInfoPegawai(){
        System.out.println("NIP: " + this.NIP);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Tanggal Lahir: " + this.Tanggal_Lahir);
        System.out.println("TMT: " + this.TMT);
        MasaKerja();
        System.out.println("Gaji Pokok: " + getGaji());
    }

    public static void printCounterPegawai(){
        System.out.println("Jumlah objek pegawai: " + getCounterPegawai);
    }
}
