/*  Nama File   : Titik.java
*   Deskripsi   : berisi atribut dan method dalam class Titik
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 26 Februari 2026
*/

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (x, y)
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return this.absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    //mengubah nilai absis
    public void setAbsis(double x){
        this.absis = x;
    }

    //mengubah nilai ordinat
    public void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser absis sejauh x dan ordinat sejauh y
    public void geser(double x, double y){
        absis = this.absis + x;
        ordinat = this.ordinat + y;
    }

    //mencetak koordinat titik
    public void prinTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // mencetak banyak titik yang sudah dibuat
    public static int getCounterTitik(){
        return counterTitik;
    }

    // mencetak nilai kuadran dari suatu titik
    public int getKuadran(){
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

    // mencetak jarak antara titik dengan titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // mencetak jarak antara titik dengan titik T (x,y)
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.getAbsis(), 2) + Math.pow(this.ordinat - T.getOrdinat(), 2));
    }

    // melakukan refleksi terhadap sumbu x pada titik 
    public void refleksiX(){
        setOrdinat(this.ordinat*(-1)); 
    }

    // melakukan refleksi terhadap sumbu y pada titik
    public void refleksiY(){
        setAbsis(this.absis*(-1));
    }

    // mencetak titik baru hasil refleksi dari titik terhadap sumbu x
    public Titik getRefleksiX(){
        Titik Tnew = new Titik();
        Tnew.setAbsis(this.absis);
        Tnew.setOrdinat(this.ordinat*(-1));

        return Tnew;
    }

    // mencetak titik baru hasil refleksi dari titik terhadap sumbu y
    public Titik getRefleksiY(){
        Titik Tnew = new Titik();
        Tnew.setAbsis(this.absis*(-1));
        Tnew.setOrdinat(this.ordinat);

        return Tnew;
    }

} //end class Titik



