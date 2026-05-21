/*  Nama File   : PersonDAO.java
*   Deskripsi   : berisi interface untuk person access object
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
public interface PersonDAO{
    /****************METHOD***************/
    // Method abstrak untuk menyimpan data person.
    public void savePerson(Person p) throws Exception;
}
