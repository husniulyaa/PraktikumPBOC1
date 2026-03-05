public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    //konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }
    
    public MataKuliah(String id, String nama, int sks){
        this.idMatkul = id;
        this.nama = nama;
        this.sks = sks;
    }

    public String getID(){
        return this.idMatkul;
    }

    public String getNamaMatkul(){
        return this.nama;
    }

    public int getSKS(){
        return this.sks;
    }

    public void setID(String ID){
        this.idMatkul = ID;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

    public void printMatKul(){
        System.out.println("ID: " + this.idMatkul + ", nama: " + this.nama + ", SKS: " + this.sks);
    }
}
