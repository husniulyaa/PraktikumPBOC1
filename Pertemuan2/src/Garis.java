/*  Nama File   : Titik.java
*   Deskripsi   : berisi atribut dan method dalam class Titik
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 26 Februari 2026
*/

public class Garis {
    /***************ATRIBUT***************/
    Titik a;
    Titik b;
    static int counterGaris = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat garis
    Garis(){ 
        a = new Titik();
        b = new Titik(1, 1);
        counterGaris++;
    }

    Garis(double x1, double y1, double x2, double y2){
        this.a = new Titik(x1, y1);
        this.b = new Titik(x2, y2);
        counterGaris++;
    }

    Titik geTitik(){
        return this.a;
    }

}
