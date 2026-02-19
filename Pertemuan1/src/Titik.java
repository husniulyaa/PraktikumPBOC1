/*  Nama File   : Titik.java
*   Deskripsi   : berisi atribut dan method dalam class Titik
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 19 Februari 2026
*/
public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this.absis = 0;
        ordinat = 0;
    }

    //konstruktor untuk membuat titik (x, y)
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return this.absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    //mengubah nilai absis
    void setAbsis(double x){
        this.absis = x;
    }

    //mengubah nilai ordinat
    void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser absis sejauh x dan ordinat sejauh y
    void geser(double x, double y){
        absis = this.absis + x;
        ordinat = this.ordinat + y;
    }

    //mencetak koordinat titik
    void prinTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
} //end class Titik
