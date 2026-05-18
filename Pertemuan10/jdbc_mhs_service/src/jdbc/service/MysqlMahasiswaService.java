package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService(){
        try {
            koneksi = MysqlUtility.getConnection();
        } catch (SQLException ex) {
            System.out.println("Koneksi database gagal: " + ex.getMessage());
        }
    }

    // Membuat objek mahasiswa.
    public Mahasiswa makeMhsObject(int id, String nama){
        return new Mahasiswa(id, nama);
    }

    /** Menambahkan data mahasiswa. */
    public void add (Mahasiswa mhs){
        if (koneksi == null) {
            return;
        }

        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, mhs.getId());
            statement.setString(2, mhs.getNama());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Gagal insert mahasiswa: " + ex.getMessage());
        }
    }

    /** Update data mahasiswa. */
    public void update (Mahasiswa mhs){
        if (koneksi == null) {
            return;
        }

        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, mhs.getNama());
            statement.setInt(2, mhs.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Gagal update mahasiswa: " + ex.getMessage());
        }
    }

    /** Delete data mahasiswa sesuai id. */
    public void delete(int id){
        if (koneksi == null) {
            return;
        }

        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Gagal delete mahasiswa: " + ex.getMessage());
        }
    }

    /** Ambil mahasiswa sesuai id. */
    public Mahasiswa getById(int id){
        if (koneksi == null) {
            return null;
        }

        String sql = "SELECT id, nama FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            Mahasiswa mahasiswa = null;
            if (resultSet.next()) {
                mahasiswa = new Mahasiswa(
                        resultSet.getInt("id"),
                        resultSet.getString("nama")
                );
            }

            resultSet.close();
            statement.close();
            return mahasiswa;
        } catch (SQLException ex) {
            System.out.println("Gagal ambil mahasiswa: " + ex.getMessage());
            return null;
        }
    }

    /** Ambil semua isi tabel mahasiswa. */
    public List<Mahasiswa> getAll (){
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        if (koneksi == null) {
            return listMahasiswa;
        }

        String sql = "SELECT id, nama FROM mahasiswa ORDER BY id";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Mahasiswa mahasiswa = new Mahasiswa(
                        resultSet.getInt("id"),
                        resultSet.getString("nama")
                );
                listMahasiswa.add(mahasiswa);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Gagal ambil semua mahasiswa: " + ex.getMessage());
        }

        return listMahasiswa;
    }
}
