/*  Nama File   : OperatorGenerik.java
*   Deskripsi   : berisi operasi generik Tukar dan fungsi Bobot2
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class OperatorGenerik {
    /****************METHOD***************/
    /*************METHOD LAIN*************/
    // Menukar isi dari dua objek Datum dengan tipe data yang sama.
    public <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // Menghitung total bobot dari dua objek keluarga Kucing.
    public static <T> double Bobot2(Kucing k1, Kucing k2){
        return k1.getBobot() + k2.getBobot();
    }
}
