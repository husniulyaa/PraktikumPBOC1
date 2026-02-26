/*  Nama File   : Titik.java
*   Deskripsi   : berisi atribut dan method dalam class Titik
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 26 Februari 2026
*/

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this.absis = 0;
        ordinat = 0;
        counterTitik++;
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

    static int getCounterTitik(){
        return counterTitik;
    }

    int getKuadran(){
        if (this.absis == 0 && this.ordinat == 0){
            return -1;
        }
        else if (this.absis > 0) {
            if (this.ordinat > 0){
                return 1;
            }
            else{
                if (this.ordinat < 0){
                    return 4;
                }
            }
        }
        else {
            if (this.ordinat > 0){
                return 3;
            }
            else if (this.ordinat < 0){
                return 4;
            }
        }

        return 0;
    }
} //end class Titik



