/*  Nama File   : Garis.java
*   Deskripsi   : berisi atribut dan method dalam class Garis
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 26 Februari 2026
*/

public class Garis {
    /***************ATRIBUT***************/
    private Titik T1;
    private Titik T2;
    private static int counterGaris = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat garis dengan nilai titik (0, 0) dan (1, 1)
    public Garis(){ 
        T1 = new Titik();
        T2 = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor untuk membuat garis dengan masukan titik 1 dan titik 2
    public Garis(Titik P1, Titik P2){
        this.T1 = P1;
        this.T2 = P2;
        counterGaris++;
    }

    // selektor untuk mengambil titik awal dari garis
    public Titik geTitikAwal(){
        return this.T1;
    }

    // selektor untuk mengambil titik akhir dari garis
    public Titik geTitikAkhir(){
        return this.T2;
    }

    // mutator untuk menge-set titik awal sesuai dengan inputan titik baru
    public void seTitikAwal(Titik T){
        T1.setAbsis(T.getAbsis());
        T1.setOrdinat(T.getOrdinat());
    }

    // mutator garis untuk set titik akhir dari garis sesuai dengan inputan titik 
    public void seTitikAkhir(Titik T){
        T2.setAbsis(T.getAbsis());
        T2.setOrdinat(T.getOrdinat());
    }

    // mutator untuk set titik awal dan titik akhir dari suatu garis
    public void setGaris(Titik p1, Titik p2){
        this.T1 = p1;
        this.T2 = p2;
    }

    // fungsi yang akan mengembalikan jumlah banyaknya garis yang sudah dibuat
    public static int getCounterGaris(){
        return counterGaris;
    }

    // fungsi untuk menghitung panjang garis
    public double panjangGaris(){
        return Math.sqrt(Math.pow(T1.getAbsis() - T2.getAbsis(), 2)+Math.pow(T1.getOrdinat()-T2.getOrdinat(), 2));
    }

    // fungsi untuk menghitung nilai gradien/kemiringan dari suatu garis
    public double gradien(){
        return (T2.getOrdinat()-T1.getOrdinat())/(T2.getAbsis()-T1.getAbsis());
    }

    // fungsi untuk mendapatkan titik tengah dari suatu garis
    public Titik titikTengah(){
        Titik T = new Titik();
        T.setAbsis((T1.getAbsis()+T2.getAbsis())/2);
        T.setOrdinat((T1.getOrdinat()+T2.getOrdinat())/2);

        return T;
    }

    // fungsi yang mengembalikan nilai true jika garis sejajar dan false jika tidak sejajar
    public boolean isSejajar(Garis G){
        if (this.gradien() == G.gradien()){
            return true;
        }
        else{
            return false;
        }
    }

    // fungsi yang mengembalikan nilai true jika garis tegak lurus dan false jika tidak tegak lurus
    public boolean isTegakLurus(Garis G){
        if (this.gradien() * G.gradien() == -1){
            return true;
        }
        else{
            return false;
        }
    }

    // mengeprint koordinat garis mulai dari titik awal dan titik akhir
    public void printGaris(){
        System.out.println("T. Awal: ("+ T1.getAbsis() + ", " + T1.getOrdinat() + "), T. Akhir: (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    // mengembalikan persamaan dari suatu garis
    public void persamaanGaris(){
        // y-y1(x2-x1) = x-x1(y2-y1)
        // y*x2 - y*x1 - y1*x2 + y1*x1 = y2*x - y1*x - x1*y2 + x1*y1
        // y*x2 - y*x1 = y2*x - y1*x - x1*y2 + y1*x2
        // y*x2 - y*x1 = y2*x - y1*x - (x1*y2 - y1*x2)
        char operasi = ' ';
        double koefY = T2.getAbsis() - T1.getAbsis();
        double koefX = (T2.getOrdinat() - T1.getOrdinat());
        double konst = ((T1.getAbsis() * T2.getOrdinat()) - (T1.getOrdinat() * T2.getAbsis()));
        
        if (koefX % koefY == 0){
            if (konst % koefY == 0){
                koefX = koefX/koefY;
                konst = konst/koefY;
            }
        }
        if (konst < 0){
            operasi = '+';
        }
        else{
            if (konst >= 0){
                operasi = '-';
            }
        }
        System.out.println("y = " + koefX + "x " + operasi + " " + Math.abs(konst));
    }

}
