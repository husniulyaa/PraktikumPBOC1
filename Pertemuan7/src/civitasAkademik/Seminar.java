/*  Nama File   : Seminar.java
*   Deskripsi   : berisi atribut dan method untuk mengelola data peserta seminar dari civitas akademika
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package civitasAkademik;

public class Seminar {
    /***************ATRIBUT***************/
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakpeserta;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menyiapkan array peserta seminar dan jumlah peserta awal.
    public Seminar(){
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    /**************SELEKTOR**************/
    // Mengembalikan jumlah peserta yang telah terdaftar dalam seminar.
    public int countPeserta(){
        return this.banyakpeserta;
    }
    
    /*************METHOD LAIN*************/
    // Menambahkan peserta baru ke dalam daftar seminar jika kapasitas masih tersedia.
    public void registrasi(Civitasakademika pesertaBaru){
        if (banyakpeserta < 100){
            pesertas[banyakpeserta] = pesertaBaru;
            banyakpeserta++;
        }
        else{
            System.out.println("Kapasitas penuh!");
        }
    }

    // Menampilkan daftar seluruh peserta seminar yang sudah terdaftar.
    public void tampilPeserta(){
        int i;
        for(i=0;i<banyakpeserta;i++){
            System.out.println("Nomor: " + (i+1) + " | " + "Nama: " + pesertas[i].getNama());
        }
    }

    // Menghitung jumlah peserta seminar yang berstatus sebagai mahasiswa.
    public int countMahasiswa(){
        int i;
        int count = 0;
        for(i=0;i<banyakpeserta;i++){
            if (pesertas[i] instanceof Mahasiswa){
                count = count+1;
            }
        }

        return count;
    }
} 
