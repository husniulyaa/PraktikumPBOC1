/*  Nama File   : MTitik.java
*   Deskripsi   : berisi main dalam class Titik
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 19 Februari 2026
*/

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan 
        T1.prinTitik(); //mencetak titik koordinat
        T1.geser(5, 2); //menggeser T1 sejauh (5, 2)
        T1.prinTitik(); //menampilkan koordinat T1 setelah digeser
    }
}
