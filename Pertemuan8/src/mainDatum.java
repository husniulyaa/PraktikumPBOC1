/*  Nama File   : mainDatum.java
*   Deskripsi   : berisi program utama untuk menguji class generik Datum
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class mainDatum {
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor kosong untuk class mainDatum.
    public mainDatum(){

    }

    /*************METHOD MAIN************/
    // Method utama untuk menguji getIsi dan setIsi pada class Datum.
    public static void main(String[] args) {
        // Membuat dan menguji datum bertipe String.
        System.out.println("----------- DATUM DENGAN STRING -----------");
        Datum<String> datumString = new Datum<>("Nama Hewan");
        System.out.println("Isi Datum: " + datumString.getIsi());
        datumString.setIsi("Seekor Kucing Anggora");
        System.out.println("Isi Datum setelah update: " + datumString.getIsi());

        // Membuat dan menguji datum bertipe Integer.
        System.out.println("----------- DATUM DENGAN INTEGER -----------");
        Datum<Integer> datumInteger = new Datum<>(16);
        System.out.println("Isi Datum: " + datumInteger.getIsi());
        datumInteger.setIsi(2);
        System.out.println("Isi Datum setelah update: " + datumInteger.getIsi());

        // Membuat dan menguji datum bertipe Double.
        System.out.println("----------- DATUM DENGAN DOUBLE ------------");
        Datum<Double> datumDouble = new Datum<>(0.2);
        System.out.println("Isi Datum: " + datumDouble.getIsi());
        datumDouble.setIsi(2.007);
        System.out.println("Isi Datum setelah update: " + datumDouble.getIsi());

        // Membuat dan menguji datum bertipe keluarga Anabul.
        System.out.println("----------- DATUM DENGAN ANABUL ------------");
        Datum<Anabul> datumAnabul1 = new Datum<>(new Anjing("Doki"));
        System.out.println("Nama: " + datumAnabul1.getIsi().getNama());
        System.out.print("Gerak: ");
        datumAnabul1.getIsi().Gerak();
        System.out.print("Suara: ");
        datumAnabul1.getIsi().Bersuara();

        System.out.println();
        Datum<Anabul> datumAnabul2 = new Datum<>(new Burung("Ocong"));
        System.out.println("Nama: " + datumAnabul2.getIsi().getNama());
        System.out.print("Gerak: ");
        datumAnabul2.getIsi().Gerak();
        System.out.print("Suara: ");
        datumAnabul2.getIsi().Bersuara();

        System.out.println();
        Datum<Kucing> datumAnabul3 = new Datum<>(new Anggora("Cimmy", 6.5, "Snow White"));
        System.out.println("Nama: " + datumAnabul3.getIsi().getNama());
        System.out.println("Bobot: " + datumAnabul3.getIsi().getBobot());
        System.out.println("Warna: " + ((Anggora)datumAnabul3.getIsi()).getWarna());
        System.out.print("Gerak: ");
        datumAnabul3.getIsi().Gerak();
        System.out.print("Suara: ");
        datumAnabul3.getIsi().Bersuara();

        System.out.println();
        Datum<Kucing> datumAnabul4 = new Datum<>(new Kembangtelon("Cimmy", 5.5, "Betina"));
        System.out.println("Nama: " + datumAnabul4.getIsi().getNama());
        System.out.println("Bobot: " + datumAnabul4.getIsi().getBobot());
        System.out.println("Jenis kelamin: " + ((Kembangtelon)datumAnabul4.getIsi()).getJenisKelamin());
        System.out.print("Gerak: ");
        datumAnabul4.getIsi().Gerak();
        System.out.print("Suara: ");
        datumAnabul4.getIsi().Bersuara();
    }
}
