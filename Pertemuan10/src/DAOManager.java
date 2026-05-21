/*  Nama File   : DAOManager.java
*   Deskripsi   : berisi pengelola DAO dalam program
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
public class DAOManager{
    /***************ATRIBUT***************/
    private PersonDAO personDAO;

    /****************METHOD***************/
    /***************MUTATOR***************/
    // Mengubah DAO person sesuai input.
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    /**************SELEKTOR**************/
    // Mengembalikan DAO person yang digunakan.
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
