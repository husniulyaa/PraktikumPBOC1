/*  Nama File   : mainOverloading.java
*   Deskripsi   : berisi program utama untuk menguji overloading konstruktor dan method pada class Mahasiswa
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

public class mainOverloading {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk membuat beberapa objek mahasiswa dan menguji overloading yang tersedia.
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("2406012412", "Freya", "Informatika");

        m1.setNama("Floryn");
        m1.setProgramStudi();

        Mahasiswa m3 = new Mahasiswa(m1);
        m1.setNIM("2406012378");
        m3.setProgramStudi(m2);
        m3.setNIM("2406012234");
        m3.setNama("Harith");

        System.out.println("----------------------------------------------------------");
        System.out.println("Data general mahasiswa: ");
        System.out.println("Nama m1: " + m1.getNama());
        System.out.println("Nama m2: " + m2.getNama());
        System.out.println("Nama m3: " + m3.getNama());
        System.out.println("NIM m2: " + m2.getNIM());
        System.out.println("Program studi: " + m3.getProgramStudi());

        Mahasiswa m4 = new Mahasiswa(m3);
        System.out.println("----------------------------------------------------------");
        System.out.println("Data mahasiswa 1: ");
        m1.printInfo();
        System.out.println("----------------------------------------------------------");
        System.out.println("Data mahasiswa 2: ");
        m2.printInfo();
        System.out.println("----------------------------------------------------------");
        System.out.println("Data mahasiswa 3: ");
        m3.printInfo();
        System.out.println("----------------------------------------------------------");
        System.out.println("Data mahasiswa 4: ");
        m4.printInfo();

        System.out.println("----------------------------------------------------------");
        System.out.println("Setelah dilakukan perubahan program studi: ");
        m4.setProgramStudi("Magister Sistem Informasi");
        m4.printInfo();
    }
}
