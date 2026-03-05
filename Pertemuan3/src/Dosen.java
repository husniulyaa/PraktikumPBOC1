public class Dosen{
    private String NIP;
    private String nama;
    private String prodi;

    // konstruktor tanpa parameter
    public Dosen(){
        this.NIP = "";
        this.nama = "";
        this.prodi = "";
    }

    //konstruktor dengan parameter NIP, Nama, Prodi
    public Dosen(String NIP, String nama, String prodi){
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi; 
    }

    public String getNIP(){
        return this.NIP;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }

    public void printDosen(){
        System.out.println("NIP: " + this.NIP + ", Nama: " + this.nama + ", Prodi: " + this.prodi);
    }
}