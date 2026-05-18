package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() throws SQLException {
        if (koneksi == null || koneksi.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "lulusmbd";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("KOneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver :" + cne.getMessage());
            } catch (SQLException sqle){
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
