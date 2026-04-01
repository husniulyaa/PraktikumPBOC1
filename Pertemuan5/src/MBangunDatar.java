/*  Nama File   : MBangunDatar.java
*   Deskripsi   : berisi main dari class BangunDatar, Persegi, dan Lingkaran
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 12 Maret 2026
*   Lab         : PBO C1
*/

/***************MAIN CLASS***************/
public class MBangunDatar {
    public static void main(String[] args) {
    /*************OBJEK CLASS*************/
    BangunDatar P1 = new Persegi();
    BangunDatar L1 = new Lingkaran();
    BangunDatar P2 = new Persegi(10, "Putih", "Cream");
    BangunDatar L2 = new Lingkaran(8, "Blue", "Navy");

    /***************APLIKASI***************/
    BangunDatar.printCounterBangunDatar(); // Menghitung jumlah objek yang terbuat

    System.out.println("Persegi P1: "); // Informasi terkait objek persegi pertama
    System.out.println("Sisi: " + ((Persegi)(P1)).getSisi());
    System.out.println("Jumlah Sisi: " + P1.getJmlSisi());
    System.out.println("Border: " + P1.getBorder());
    System.out.println("Warna: " + P1.getWarna());
    System.out.println("Luas P1: " + ((Persegi)(P1)).getLuas());
    System.out.println("Keliling P1: " + ((Persegi)(P1)).getKeliling());
    System.out.println("Diagonal P1: " + ((Persegi)(P1)).getDiagonal());
    ((Persegi)(P1)).setSisi(8);
    ((Persegi)(P1)).setWarna("Pink");
    ((Persegi)(P1)).setBorder("Purple");
    System.out.println();
    System.out.println("Persegi 1 info: ");
    ((Persegi)(P1)).printInfo();

    System.out.println();
    System.out.println("Persegi P2: "); // Informasi terkait objek persgei kedua
    System.out.println("Sisi: " + ((Persegi)(P2)).getSisi());
    System.out.println("Jumlah Sisi: " + P2.getJmlSisi());
    System.out.println("Border: " + P2.getBorder());
    System.out.println("Warna: " + P2.getWarna());
    System.out.println("Luas P2: " + ((Persegi)(P2)).getLuas());
    System.out.println("Keliling P2: " + ((Persegi)(P2)).getKeliling());
    System.out.println("Diagonal P2: " + ((Persegi)(P2)).getDiagonal());
    ((Persegi)(P2)).setSisi(12);
    System.out.println();
    System.out.println("Persegi 2 info: ");
    ((Persegi)(P2)).printInfo();

    System.out.println();
    System.out.println("Lingkaran L1: "); // Informasi terkait objek lingkaran pertama
    System.out.println("Sisi: " + ((Lingkaran)(L1)).getJari());
    System.out.println("Jumlah Sisi: " + L1.getJmlSisi());
    System.out.println("Border: " + L1.getBorder());
    System.out.println("Warna: " + L1.getWarna());
    System.out.println("Luas L1: " + ((Lingkaran)(L1)).getLuas());
    System.out.println("Keliling L1: " + ((Lingkaran)(L1)).getKeliling());
    ((Lingkaran)(L1)).setJari(6);
    System.out.println();
    System.out.println("Lingkaran 1 info: ");
    ((Lingkaran)(L1)).printInfo();

    System.out.println();
    System.out.println("Lingkaran L2: "); // Informasi terkait objek lingkaran kedua
    System.out.println("Sisi: " + ((Lingkaran)(L2)).getJari());
    System.out.println("Jumlah Sisi: " + L2.getJmlSisi());
    System.out.println("Border: " + L2.getBorder());
    System.out.println("Warna: " + L2.getWarna());
    System.out.println("Luas L2: " + ((Lingkaran)(L2)).getLuas());
    System.out.println("Keliling L2: " + ((Lingkaran)(L2)).getKeliling());
    ((Lingkaran)(L2)).setJari(6);
    System.out.println();
    System.out.println("Lingkaran 2 info: ");
    ((Lingkaran)(L2)).printInfo();

    System.out.println();
    System.out.println("isEqualLuas L1 and P1 = " + L1.isEqualLuas(P1));
    System.out.println("isEqualKeliling L1 and P1 = " + L1.isEqualKeliling(P1));
    }
}
