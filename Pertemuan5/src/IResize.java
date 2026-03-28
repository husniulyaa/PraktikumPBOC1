/*  Nama File   : IResize.java
*   Deskripsi   : berisi interface IResize 
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 12 Maret 2026
*   Lab         : PBO C1
*/

public interface IResize {

    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
