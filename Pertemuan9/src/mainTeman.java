/*  Nama File   : mainTeman.java
*   Deskripsi   : berisi program utama untuk menguji class Teman
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

public class mainTeman {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk membuat objek Teman dan mencoba semua method pada class Teman.
    public static void main(String[] args) {
        // Inisialisasi objek Teman dengan konstruktor berparameter dan tanpa parameter.
        Teman T1 = new Teman("Carmen");
        Teman T2 = new Teman();

        // Menampilkan jumlah elemen awal dan menambahkan beberapa nama ke T1.
        System.out.println("=== Data T1 ===");
        System.out.println("NBElmt awal: " + T1.getNbelm());
        T1.addNama("Karina");
        T1.addNama("Giselle");
        T1.addNama("Karina");

        // Menampilkan seluruh isi daftar teman pada T1.
        System.out.println("Daftar teman T1:");
        T1.showTeman();
        System.out.println();

        // Mengambil nama teman berdasarkan indeks.
        System.out.println("Nama indeks 1: " + T1.getNama(1));
        System.out.println("Nama indeks 2: " + T1.getNama(2));
        System.out.println("Nama indeks 3: " + T1.getNama(3));
        
        // Mengubah nama teman pada indeks tertentu.
        System.out.println();
        System.out.println("Nama indeks ke 3 sebelum diupdate: " + T1.getNama(3));
        T1.setNama(3, "Winter");
        System.out.println("Nama indeks ke 3 setelah diupdate: " + T1.getNama(3));
        System.out.println();

        // Mengecek anggota, menghitung nama, dan mengganti nama pada T1.
        System.out.println("Apakah Karina member T1? " + T1.isMember("Karina"));
        System.out.println("Jumlah nama Karina di T1: " + T1.countNama("Karina"));
        T1.gantiNama("Karina", "Ningning");
        System.out.println("Daftar teman T1 setelah Karina diganti Ningning:");
        T1.showTeman();
        System.out.println();

        // Menghapus nama dari daftar teman T1.
        T1.delNama("Carmen");
        System.out.println("Daftar teman T1 setelah Carmen dihapus:");
        T1.showTeman();
        System.out.println("NBElmt akhir T1: " + T1.getNbelm());
        System.out.println();

        // Menambahkan dan menampilkan data teman pada T2.
        System.out.println("=== Data T2 ===");
        System.out.println("NBElmt awal T2: " + T2.getNbelm());
        T2.addNama("Ciko");
        T2.addNama("Budi");
        System.out.println("Nama indeks 1 T2: " + T2.getNama(1));
        System.out.println("Daftar teman T2:");
        T2.showTeman();
    }
}
