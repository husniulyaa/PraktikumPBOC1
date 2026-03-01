/*  Nama File   : Garis.java
*   Deskripsi   : berisi atribut dan method dalam class Garis
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 26 Februari 2026
*/

public class Garis {
    /***************ATRIBUT***************/
    Titik T1;
    Titik T2;
    static int counterGaris = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat garis
    Garis(){ 
        T1 = new Titik();
        T2 = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik P1, Titik P2){
        this.T1 = P1;
        this.T2 = P2;
        counterGaris++;
    }

    Titik geTitikAwal(){
        return this.T1;
    }

    Titik geTitikAkhir(){
        return this.T2;
    }

    void seTitikAwal(Titik T){
        T1.setAbsis(T.getAbsis());
        T1.setOrdinat(T.getOrdinat());
    }

    void seTitikAkhir(Titik T){
        T2.setAbsis(T.getAbsis());
        T2.setOrdinat(T.getOrdinat());
    }

    void setGaris(Titik p1, Titik p2){
        this.T1 = p1;
        this.T2 = p2;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double panjangGaris(){
        return Math.sqrt(Math.pow(T1.getAbsis() - T2.getAbsis(), 2)+Math.pow(T1.getOrdinat()-T2.getOrdinat(), 2));
    }

    double gradien(){
        return (T2.getOrdinat()-T1.getOrdinat())/(T2.getAbsis()-T1.getAbsis());
    }

    Titik titikTengah(){
        Titik T = new Titik();
        T.setAbsis((T1.getAbsis()+T2.getAbsis())/2);
        T.setOrdinat((T1.getOrdinat()+T2.getOrdinat())/2);

        return T;
    }

    boolean isSejajar(Garis G){
        if (this.gradien() == G.gradien()){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isTegakLurus(Garis G){
        if (this.gradien() * G.gradien() == -1){
            return true;
        }
        else{
            return false;
        }
    }

    void printGaris(){
        System.out.println("T. Awal: ("+ T1.getAbsis() + ", " + T1.getOrdinat() + "), T. Akhir: (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    void persamaanGaris(){
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
