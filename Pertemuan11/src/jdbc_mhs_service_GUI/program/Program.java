/*  Nama File   : Program.java
*   Deskripsi   : berisi program utama untuk menjalankan service mahasiswa
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/
package jdbc_mhs_service_GUI.program;

import java.util.List;
import jdbc_mhs_service_GUI.model.Mahasiswa;
import jdbc_mhs_service_GUI.service.MysqlMahasiswaService;

public class Program {
    /***************ATRIBUT***************/
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    /****************METHOD***************/
    /*************METHOD MAIN*************/
    // Method utama untuk menguji proses insert, update, dan delete data mahasiswa.
    public static void main(String[] args) {
        System.out.println("");

        // Menambahkan data mahasiswa baru.
        System.out.println(" === insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // Mengubah data mahasiswa berdasarkan id.
        System.out.println(" == update");
        Mahasiswa mhsUpdate = service.getById(5);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate);
            service.update(mhsUpdate);
        }
        displayAll();

        // Menghapus data mahasiswa berdasarkan id.
        System.out.println(" === delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    /*************METHOD LAIN*************/
    // Menampilkan seluruh data mahasiswa dari database ke layar.
    private static void displayAll() {
        System.out.println("Data mahasiswa:");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mahasiswa : listmhs) {
            System.out.println(mahasiswa);
        }
        System.out.println("");
    }
}
