/*  Nama File   : MysqlUtility.java
*   Deskripsi   : berisi utility untuk membuat koneksi database MySQL
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
package jdbc_mhs_service_GUI.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    /***************ATRIBUT***************/
    private static Connection koneksi;
    private static String lastError = "";

    /****************METHOD***************/
    /*************METHOD LAIN*************/
    // Mengembalikan koneksi database MySQL.
    public static Connection getConnection() throws SQLException {
        // Membuat koneksi baru jika koneksi belum ada atau sudah tertutup.
        if (koneksi == null || koneksi.isClosed()) {
            try {
                // Memuat driver MySQL.
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Menentukan url, user, dan password database.
                String url = "jdbc:mysql://localhost:3306/pbo?serverTimezone=Asia/Jakarta";
                String user = "root";
                String password = "lulusmbd";

                // Membuat koneksi ke database.
                koneksi = DriverManager.getConnection(url, user, password);

                // Menampilkan pesan jika koneksi berhasil dibuat.
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                    lastError = "";
                }
            } catch (ClassNotFoundException cne) {
                // Menampilkan pesan error jika driver MySQL gagal dimuat.
                lastError = "Gagal load driver: " + cne.getMessage();
                System.out.println(lastError);
            } catch (SQLException sqle) {
                // Menampilkan pesan error jika koneksi database gagal.
                lastError = "Gagal koneksi: " + sqle.getMessage();
                System.out.println(lastError);
            }
        }
        return koneksi;
    }

    public static String getLastError() {
        return lastError;
    }
}
