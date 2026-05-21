/*  Nama File   : MainDAO.java
*   Deskripsi   : berisi program utama untuk akses DAO
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
public class MainDAO{
    /****************METHOD***************/
    /*************METHOD MAIN*************/
    // Method utama untuk menyimpan objek Person menggunakan DAO MySQL.
    public static void main(String args[]){
        // Membuat objek person yang akan disimpan.
        Person person = new Person("Indra");

        // Membuat DAOManager dan mengatur implementasi DAO yang digunakan.
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try{
            // Menyimpan data person ke database melalui DAO.
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            // Menampilkan pesan error jika proses penyimpanan gagal.
            e.printStackTrace();
        }
    }
}
