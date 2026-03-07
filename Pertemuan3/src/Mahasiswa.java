/*  Nama File   : Mahasiswa.java
*   Deskripsi   : berisi atribut dan method dalam class Mahasiswa
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 5 Maret 2026
*   Lab         : PBO C1
*/

/***************LIBRARY IMPORT***************/
import java.util.ArrayList;

public class Mahasiswa {
    /***************ATRIBUT***************/
    private String NIM;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen DosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/
    // konstruktor mahasiswa tanpa parameter
    public Mahasiswa(){
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.DosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // konstruktor mahasiswa disertai parameter sesuai dengan inputan
    public Mahasiswa(String NIM, String nama, String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.DosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Selektor mahasiswa untuk mendapatkan NIM
    public String getNIM(){
        return this.NIM;
    }

    // Selektor mahasiswa untuk mendapatkan Nama
    public String getNama(){
        return this.nama;
    }

    // Selektor mahasiswa untuk mendapatkan Prodi
    public String getProdi(){
        return this.prodi;
    }

    // Selektor mahasiswa untuk mendapatkan list mata kuliah apa saja yang diambil mahasiswa
    public void getListMatKul(){
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.print(listMatKul.get(i).getNamaMatkul()+" ");
        }
    }

    // Selektor mahasiswa untuk mendapatkan dosen wali mahasiswa
    public Dosen getDosWal(){
        return this.DosenWali;
    }

    // Selektor mahasiswa untuk mendapatkan kendaraan milik mahasiswa 
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    // Mutator untuk set NIM
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    // Mutator untuk set nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mutator untuk set prodi mahasiswa
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // Mutator untuk set dosen wali mahasiswa
    public void setDosWal(Dosen doswal){
        this.DosenWali = doswal;
    }
    
    // Mutator untuk set kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Menambahkan mata kuliah ke dalam list mata kuliah mahasiswa
    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    // Mengembalikan jumlah sks yang diambil oleh mahasiswa
    public int getJumlahSKS(){
        int total = 0;
        int i;
        for(i=0;i<listMatKul.size();i++){
            total = total + listMatKul.get(i).getSKS();
        }

        return total;
    }

    // Mengembalikan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return listMatKul.size();
    }

    // Mencetak informasi nim, nama, dan prodi dari mahasiswa ke layar
    public void printMhs(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: "+this.nama);
        System.out.println("Prodi: "+this.prodi);
    }

    // Mencetak informasi lengkap mulai dari nim hingga kendaraan dari mahasiswa
    public void printDetailMhs(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: "+this.nama);
        System.out.println("Prodi: "+this.prodi);
        System.out.print("List MatKul: ");
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.print(listMatKul.get(i).getNamaMatkul()+" ");
        }
        System.out.println();
        System.out.println("DosWal: "+this.DosenWali.getNama());
        System.out.println("Kendaraan: "+this.kendaraan.getJenis());
    }
}
