import java.util.ArrayList;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen DosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.DosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String NIM, String nama, String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.DosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getNIM(){
        return this.NIM;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosWal(){
        return this.DosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public int getJumlahSKS(){
        int total = 0;
        int i;
        for(i=0;i<listMatKul.size();i++){
            total = total + listMatKul.get(i).getSKS();
        }

        return total;
    }

    public int getJumlahMatkul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: "+this.nama);
        System.out.println("Prodi: "+this.prodi);    }

    public void printDetailMhs(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: "+this.nama);
        System.out.println("Prodi: "+this.prodi);
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNamaMatkul());
        }
        System.out.println("DosWal: "+this.DosenWali);
        System.out.println("Kendaraan: "+this.kendaraan);
    }
}
