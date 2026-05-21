/*  Nama File   : MySQLPersonDAO.java
*   Deskripsi   : berisi implementasi PersonDAO untuk database MySQL
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO{
    /****************METHOD***************/
    /*************METHOD LAIN*************/
    // Menyimpan data person ke tabel person dalam database MySQL.
    public void savePerson(Person person) throws Exception{
        // Mengambil nama dari objek person.
        String name = person.getName();

        // Membuat koneksi ke database, nama db, user, dan password menyesuaikan.
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo","root","lulusmbd");
        
        // Membuat dan menjalankan query insert data person.
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // Menutup koneksi database.
        con.close();
    }
}
