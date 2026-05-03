/*  Nama File   : mainAnabul.java
*   Deskripsi   : berisi program utama untuk menguji class Anabul, Kucing, Anjing, dan Burung
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

public class mainAnabul {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk membuat objek anabul dan menguji polimorfisme pada method suara dan gerak.
    public static void main(String[] args) {
        // Deklarasi referensi objek anabul.
        Kucing A1;
        Anabul A2;
        Anabul A3;
        Kucing A4;

        // Inisialisasi objek anabul dari class turunan yang berbeda.
        A1 = new Anggora("Miko", 9, "Snow White");
        A4 = new Kembangtelon("Ciko", 8, "Jantan");
        A2 = new Anjing("Phaw phaw");
        A3 = new Burung("Ocong");

        // Menampilkan data dan perilaku objek anabul pertama.
        System.out.println("------------------------- Anabul 1 ----------------------------");
        System.out.println("Nama: " + A1.getNama());
        System.out.println("Bobot: " + ((Anggora) A1).getBobot());
        System.out.println("Warna: " + ((Anggora) A1).getWarna());
        System.out.print("Suara: ");
        A1.Bersuara();
        System.out.print("Gerak: ");
        A1.Gerak();

        // Menampilkan data dan perilaku objek anabul kedua.
        System.out.println("------------------------- Anabul 2 ----------------------------");
        System.out.println("Nama: " + A2.getNama());
        System.out.print("Suara: ");
        A2.Bersuara();
        System.out.print("Gerak: ");
        A2.Gerak();

        // Menampilkan data dan perilaku objek anabul ketiga.
        System.out.println("------------------------- Anabul 3 ----------------------------");
        System.out.println("Nama: " + A3.getNama());
        System.out.print("Suara: ");
        A3.Bersuara();
        System.out.print("Gerak: ");
        A3.Gerak();

        // Menampilkan data dan perilaku objek anabul keempat.
        System.out.println("------------------------- Anabul 4 ----------------------------");
        System.out.println("Nama: " + A4.getNama());
        System.out.println("Bobot: " + A4.getBobot());
        System.out.println("Jenis Kelamin: " + ((Kembangtelon) A1).getJenisKelamin());
        System.out.print("Suara: ");
        A4.Bersuara();
        System.out.print("Gerak: ");
        A4.Gerak();

    }
}
