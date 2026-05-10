/*  Nama File   : Piaraan.java
*   Deskripsi   : berisi atribut dan method untuk mengelola queue anabul piaraan
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    /***************ATRIBUT***************/
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk membuat queue anabul kosong.
    public Piaraan(){
        this.nbelm = 0;
        Lanabul = new LinkedList<Anabul>();
    }

    // Konstruktor dengan parameter untuk membuat queue berdasarkan satu anabul.
    public Piaraan(Anabul anabul) {
        this.nbelm = 1;
        Lanabul = new LinkedList<Anabul>();
        nbelm = nbelm + 1;
    }

    /**************SELEKTOR**************/
    // Mengembalikan jumlah elemen anabul dalam queue.
    public int getNbelm() {
        return nbelm;
    }

    /*************METHOD LAIN*************/
    // Menambahkan anabul ke bagian belakang queue.
    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(anabul);
        nbelm = nbelm + 1;
    }

    // Mengecek apakah anabul merupakan anggota queue.
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    // Mengembalikan anabul paling depan tanpa menghapusnya dari queue.
    public Anabul getAnabul(){
        try{
            if(nbelm == 0){
                throw new Exception("Queue kosong: ");
            }
            return Lanabul.peek();
        } catch (Exception e){
            System.out.print(e.getMessage());
            return null;
        }
    }

    // Menghapus anabul paling depan dari queue.
    public void dequeueAnabul(){
        try{
            if(nbelm == 0){
                throw new Exception("Queue kosong!");
            }
            Anabul delAnabul = Lanabul.poll();
            nbelm = nbelm - 1;
            System.out.println("Anabul terhapus: " + delAnabul);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /***************MUTATOR***************/
    // Mengubah jumlah elemen anabul sesuai masukan.
    public void setNbelm(int nbelm) {
        this.nbelm = nbelm;
    }

    /*************METHOD LAIN*************/
    // Menampilkan seluruh nama anabul dalam queue.
    public void showAnabul(){
        try{
            if(nbelm == 0){
                throw new Exception("Queue kosong!");
            }
            for(Anabul a:Lanabul){
                System.out.println(a.getNama() + "; ");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Menghitung jumlah anabul yang merupakan objek Kucing atau turunannya.
    public int countKucing(){
        try{
            if(nbelm == 0){
                throw new Exception("Queue kosong!");
            }
            int count = 0;
            for(Anabul i : Lanabul){
                if(i instanceof Kucing){
                    count = count + 1;
                }
            }
            return count;
        } catch (Exception e){
            System.out.print("Queue kosong: ");
            return -1;
        }
    }

    // Menghitung total bobot semua kucing dalam queue.
    public double bobotKucing(){
        try{
            if(nbelm == 0){
                throw new Exception("Queue kosong");
            }
            double count = 0.0;
            for(Anabul a:Lanabul){
                if(a instanceof Kucing){
                    count = count + ((Kucing)a).getBobot();
                }
            }
            return count;
        } catch (Exception e){
            return -1;
        }
    }

    // Menampilkan nama anabul beserta jenis class-nya.
    public void showJenisAnabul(){
        try{
            if(nbelm == 0){
                throw new Exception("Queue kosong");
            }
            for(Anabul a:Lanabul){
                System.out.println(a.getNama() + " - " + a.getClass() + "; ");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
