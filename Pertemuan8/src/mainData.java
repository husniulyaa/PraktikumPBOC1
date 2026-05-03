/*  Nama File   : mainData.java
*   Deskripsi   : berisi program utama untuk menguji class generik Data
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class mainData {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk menguji setIsi, getIsi, dan getSize pada class Data.
    public static void main(String[] args) {
        // Membuat dan menguji data bertipe String.
        System.out.println("----------- DATA STRING ------------");
        Data<String> dataString = new Data<>();
        System.out.println("Size awal data string: " + dataString.getSize());
        dataString.setIsi(1, "Nama Hewan");
        dataString.setIsi(2, "Seekor Kucing Anggora");
        System.out.println("Isi data string posisi 1: " + dataString.getIsi(1));
        System.out.println("Isi data string posisi 2: " + dataString.getIsi(2));
        System.out.println("Size akhir data string: " + dataString.getSize());

        // Membuat dan menguji data bertipe Integer.
        System.out.println();
        System.out.println("----------- DATA INTEGER -----------");
        Data<Integer> dataInteger = new Data<>();
        System.out.println("Size awal data integer: " + dataInteger.getSize());
        dataInteger.setIsi(1, 16);
        dataInteger.setIsi(2, 2);
        System.out.println("Isi data integer posisi 1: " + dataInteger.getIsi(1));
        System.out.println("Isi data integer posisi 2: " + dataInteger.getIsi(2));
        System.out.println("Size akhir data integer: " + dataInteger.getSize());

        // Membuat dan menguji data bertipe Double.
        System.out.println();
        System.out.println("------------ DATA DOUBLE -----------");
        Data<Double> dataDouble = new Data<>();
        System.out.println("Size awal data double: " + dataDouble.getSize());
        dataDouble.setIsi(1, 0.2);
        dataDouble.setIsi(2, 2.007);
        System.out.println("Isi data double posisi 1: " + dataDouble.getIsi(1));
        System.out.println("Isi data double posisi 2: " + dataDouble.getIsi(2));
        System.out.println("Size akhir data double: " + dataDouble.getSize());

        // Membuat data untuk menyimpan keluarga objek Anabul.
        System.out.println();
        System.out.println("----------- DATA ANABUL ------------");
        Data<Anabul> dataAnabul = new Data<>();
        System.out.println("Kapasitas data: " + dataAnabul.getKapasitas());
        System.out.println("Size awal data: " + dataAnabul.getSize());

        // Mengisi data Anabul dengan berbagai objek turunannya.
        System.out.println();
        System.out.println("----------- SET ISI DATA -----------");
        dataAnabul.setIsi(1, new Anjing("Doki"));
        dataAnabul.setIsi(2, new Burung("Ocong"));
        dataAnabul.setIsi(3, new Anggora("Cimmy", 6.5, "Snow White"));
        dataAnabul.setIsi(4, new Kembangtelon("Kimi", 5.5, "Betina"));
        System.out.println("Data posisi 1 diisi Anjing");
        System.out.println("Data posisi 2 diisi Burung");
        System.out.println("Data posisi 3 diisi Anggora");
        System.out.println("Data posisi 4 diisi Kembangtelon");

        // Menampilkan isi data Anabul yang sudah disimpan.
        System.out.println();
        System.out.println("----------- GET ISI DATA -----------");
        System.out.println("Nama data posisi 1: " + dataAnabul.getIsi(1).getNama());
        System.out.print("Gerak: ");
        dataAnabul.getIsi(1).Gerak();
        System.out.print("Suara: ");
        dataAnabul.getIsi(1).Bersuara();

        System.out.println();
        System.out.println("Nama data posisi 2: " + dataAnabul.getIsi(2).getNama());
        System.out.print("Gerak: ");
        dataAnabul.getIsi(2).Gerak();
        System.out.print("Suara: ");
        dataAnabul.getIsi(2).Bersuara();

        System.out.println();
        System.out.println("Nama data posisi 3: " + dataAnabul.getIsi(3).getNama());
        System.out.println("Bobot: " + ((Anggora)dataAnabul.getIsi(3)).getBobot());
        System.out.println("Warna: " + ((Anggora)dataAnabul.getIsi(3)).getWarna());
        System.out.print("Gerak: ");
        dataAnabul.getIsi(3).Gerak();
        System.out.print("Suara: ");
        dataAnabul.getIsi(3).Bersuara();

        System.out.println();
        System.out.println("Nama data posisi 4: " + dataAnabul.getIsi(4).getNama());
        System.out.println("Bobot: " + ((Kembangtelon)dataAnabul.getIsi(4)).getBobot());
        System.out.println("Jenis kelamin: " + ((Kembangtelon)dataAnabul.getIsi(4)).getJenisKelamin());
        System.out.print("Gerak: ");
        dataAnabul.getIsi(4).Gerak();
        System.out.print("Suara: ");
        dataAnabul.getIsi(4).Bersuara();

        System.out.println();
        System.out.println("----------- GET SIZE DATA ----------");
        // Menampilkan banyak data Anabul yang sudah terisi.
        System.out.println("Size akhir data: " + dataAnabul.getSize());
    }
}
