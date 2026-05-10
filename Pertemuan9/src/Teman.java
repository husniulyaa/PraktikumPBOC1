/*  Nama File   : Teman.java
*   Deskripsi   : berisi atribut dan method untuk mengelola daftar nama teman
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

import java.util.ArrayList;

public class Teman {
    /***************ATRIBUT***************/
    private int nbelm;
    private ArrayList<String> Lnama;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk membuat daftar teman kosong.
    public Teman(){
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    // Konstruktor dengan parameter untuk membuat daftar teman dengan satu nama awal.
    public Teman(String nama){
        this.nbelm = 1;
        this.Lnama = new ArrayList<>();
        this.Lnama.add(nama);
    }

    /**************SELEKTOR**************/
    // Mengembalikan jumlah elemen nama teman.
    public int getNbelm(){
        return this.nbelm;
    }

    // Mengembalikan nama teman berdasarkan indeks masukan.
    public String getNama(int i){
        return Lnama.get(i-1);
    }

    /***************MUTATOR***************/
    // Mengubah nama teman pada indeks tertentu.
    public void setNama(int i, String newNama){
        this.Lnama.set(i-1, newNama);
    }

    /*************METHOD LAIN*************/
    // Menambahkan nama baru ke dalam daftar teman.
    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm = this.nbelm + 1;
    }

    // Menghapus nama dari daftar teman jika nama ditemukan.
    public void delNama(String nama){
        try{
            if(nbelm == 0){
                throw new Exception("Yah, daftar temannya kosong!");
            }

            if(this.Lnama.remove(nama)){
                this.nbelm = this.nbelm - 1;
            }
            else{
                System.out.println(nama + " tidak ditemukan!");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }     
    }

    // Mengecek apakah nama merupakan anggota daftar teman.
    public boolean isMember(String nama){
        return this.Lnama.contains(nama);
    }

    // Mengganti semua nama lama yang ditemukan dengan nama baru.
    public void gantiNama(String nama, String namabaru){
        int i = 0;
        for(i=0;i<nbelm;i++){
            if (Lnama.get(i).equals(nama)){
                Lnama.set(i, namabaru);
            }
        }
    }

    // Menghitung banyak kemunculan suatu nama dalam daftar teman.
    public int countNama(String nama){
        if(nbelm == 0){
            return -1;
        }
        else{
            int i = 0;
            int count = 0;
            for(i=0;i<nbelm;i++){
                if (Lnama.get(i).equals(nama)){
                    count = count + 1;
                }
            }
            return count;
        }
    }

    // Menampilkan seluruh nama teman dalam daftar.
    public void showTeman(){
        try{
            if(nbelm == 0){
                throw new Exception("Yah, tidak ada teman!");
            }
            int i = 0;
            for(i=0;i<nbelm;i++){
                System.out.println((i+1) + ". " + Lnama.get(i));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
