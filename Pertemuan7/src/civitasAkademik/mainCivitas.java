/*  Nama File   : mainCivitas.java
*   Deskripsi   : berisi program utama untuk menguji seluruh class pada package civitasAkademik
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

package civitasAkademik;

public class mainCivitas {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk membuat objek dosen dan mahasiswa lalu menguji proses registrasi seminar.
    public static void main(String[] args) {
        // Membuat dua objek dosen, lima objek mahasiswa, dan satu objek seminar.
        Dosen d1 = new Dosen("198001012005011001");
        Dosen d2 = new Dosen("197912122006041002");
        Mahasiswa m1 = new Mahasiswa("24060124130001", d1);
        Mahasiswa m2 = new Mahasiswa("24060124130002", d1);
        Mahasiswa m3 = new Mahasiswa("24060124130003", d2);
        Mahasiswa m4 = new Mahasiswa("24060124130004", d2);
        Mahasiswa m5 = new Mahasiswa("24060124130005", d1);
        Seminar seminar = new Seminar();

        // Mengisi nama dosen.
        d1.setNama("Dr. Budi Santoso");
        d2.setNama("Dr. Sinta Maharani");

        // Mengisi nama mahasiswa.
        m1.setNama("Andi Pratama");
        m2.setNama("Bella Nirmala");
        m3.setNama("Cahyo Saputra");
        m4.setNama("Dina Lestari");
        m5.setNama("Eko Ramadhan");

        // Menampilkan data dua objek dosen.
        System.out.println("------------------------- Data Dosen ----------------------------");
        System.out.println("Dosen 1");
        d1.printInfo();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Dosen 2");
        d2.printInfo();

        // Menampilkan data lima objek mahasiswa.
        System.out.println("------------------------- Data Mahasiswa ----------------------------");
        System.out.println("Mahasiswa 1");
        m1.tampilDataMahasiswa();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mahasiswa 2");
        m2.tampilDataMahasiswa();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mahasiswa 3");
        m3.tampilDataMahasiswa();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mahasiswa 4");
        m4.tampilDataMahasiswa();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mahasiswa 5");
        m5.tampilDataMahasiswa();
        System.out.println("---------------------------------------------------------------------");

        // Mendaftarkan seluruh dosen dan mahasiswa ke seminar.
        System.out.println("------------------------- Registrasi Seminar ----------------------------");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // Menampilkan jumlah peserta dan daftar peserta seminar.
        System.out.println("Jumlah peserta seminar: " + seminar.countPeserta());
        System.out.println("Jumlah peserta mahasiswa: " + seminar.countMahasiswa());
        System.out.println("------------------------- Daftar Peserta Seminar ----------------------------");
        seminar.tampilPeserta();
    }
}
