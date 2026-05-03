/*  Nama File   : mainOperatorGenerik.java
*   Deskripsi   : berisi program utama untuk menguji class OperatorGenerik
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 3 Mei 2026
*   Lab         : PBO C1
*/

public class mainOperatorGenerik {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk menguji Tukar dan Bobot2 pada class OperatorGenerik.
    public static void main(String[] args) {
        OperatorGenerik operator = new OperatorGenerik();

        // Menguji prosedur Tukar untuk tipe data String.
        System.out.println("----------- TUKAR STRING ------------");
        Datum<String> teks1 = new Datum<>("Halo");
        Datum<String> teks2 = new Datum<>("PBO");
        System.out.println("Isi teks1 sebelum tukar: " + teks1.getIsi());
        System.out.println("Isi teks2 sebelum tukar: " + teks2.getIsi());
        operator.Tukar(teks1, teks2);
        System.out.println("Isi teks1 setelah tukar: " + teks1.getIsi());
        System.out.println("Isi teks2 setelah tukar: " + teks2.getIsi());

        // Menguji prosedur Tukar untuk tipe data Integer.
        System.out.println();
        System.out.println("----------- TUKAR INTEGER -----------");
        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);
        System.out.println("Isi angka1 sebelum tukar: " + angka1.getIsi());
        System.out.println("Isi angka2 sebelum tukar: " + angka2.getIsi());
        operator.Tukar(angka1, angka2);
        System.out.println("Isi angka1 setelah tukar: " + angka1.getIsi());
        System.out.println("Isi angka2 setelah tukar: " + angka2.getIsi());

        // Menguji prosedur Tukar untuk tipe data Double.
        System.out.println();
        System.out.println("------------ TUKAR DOUBLE -----------");
        Datum<Double> double1 = new Datum<>(0.2);
        Datum<Double> double2 = new Datum<>(2.007);
        System.out.println("Isi double1 sebelum tukar: " + double1.getIsi());
        System.out.println("Isi double2 sebelum tukar: " + double2.getIsi());
        operator.Tukar(double1, double2);
        System.out.println("Isi double1 setelah tukar: " + double1.getIsi());
        System.out.println("Isi double2 setelah tukar: " + double2.getIsi());

        // Menguji prosedur Tukar untuk objek Anjing.
        System.out.println();
        System.out.println("----------- TUKAR ANJING ------------");
        Datum<Anjing> anjing1 = new Datum<>(new Anjing("Doki"));
        Datum<Anjing> anjing2 = new Datum<>(new Anjing("Bobi"));
        System.out.println("Nama anjing1 sebelum tukar: " + anjing1.getIsi().getNama());
        System.out.println("Nama anjing2 sebelum tukar: " + anjing2.getIsi().getNama());
        operator.Tukar(anjing1, anjing2);
        System.out.println("Nama anjing1 setelah tukar: " + anjing1.getIsi().getNama());
        System.out.println("Nama anjing2 setelah tukar: " + anjing2.getIsi().getNama());

        // Menguji prosedur Tukar untuk objek Burung.
        System.out.println();
        System.out.println("----------- TUKAR BURUNG ------------");
        Datum<Burung> burung1 = new Datum<>(new Burung("Ocong"));
        Datum<Burung> burung2 = new Datum<>(new Burung("Pipit"));
        System.out.println("Nama burung1 sebelum tukar: " + burung1.getIsi().getNama());
        System.out.println("Nama burung2 sebelum tukar: " + burung2.getIsi().getNama());
        operator.Tukar(burung1, burung2);
        System.out.println("Nama burung1 setelah tukar: " + burung1.getIsi().getNama());
        System.out.println("Nama burung2 setelah tukar: " + burung2.getIsi().getNama());

        // Menguji prosedur Tukar untuk objek Anggora.
        System.out.println();
        System.out.println("----------- TUKAR ANGGORA -----------");
        Datum<Anggora> anggora1 = new Datum<>(new Anggora("Cimmy", 6.5, "Snow White"));
        Datum<Anggora> anggora2 = new Datum<>(new Anggora("Milo", 4.5, "Abu-abu"));
        System.out.println("Nama anggora1 sebelum tukar: " + anggora1.getIsi().getNama());
        System.out.println("Nama anggora2 sebelum tukar: " + anggora2.getIsi().getNama());
        operator.Tukar(anggora1, anggora2);
        System.out.println("Nama anggora1 setelah tukar: " + anggora1.getIsi().getNama());
        System.out.println("Nama anggora2 setelah tukar: " + anggora2.getIsi().getNama());

        // Menguji prosedur Tukar untuk objek Kembangtelon.
        System.out.println();
        System.out.println("--------- TUKAR KEMBANGTELON --------");
        Datum<Kembangtelon> kembangtelon1 = new Datum<>(new Kembangtelon("Kimi", 5.5, "Betina"));
        Datum<Kembangtelon> kembangtelon2 = new Datum<>(new Kembangtelon("Momo", 4.8, "Jantan"));
        System.out.println("Nama kembangtelon1 sebelum tukar: " + kembangtelon1.getIsi().getNama());
        System.out.println("Nama kembangtelon2 sebelum tukar: " + kembangtelon2.getIsi().getNama());
        operator.Tukar(kembangtelon1, kembangtelon2);
        System.out.println("Nama kembangtelon1 setelah tukar: " + kembangtelon1.getIsi().getNama());
        System.out.println("Nama kembangtelon2 setelah tukar: " + kembangtelon2.getIsi().getNama());

        // Menguji prosedur Tukar untuk kombinasi keluarga Anabul.
        System.out.println();
        System.out.println("------- TUKAR KOMBINASI ANABUL ------");
        Datum<Anabul> anabul1 = new Datum<>(new Anjing("Doki"));
        Datum<Anabul> anabul2 = new Datum<>(new Burung("Ocong"));
        System.out.println("Nama anabul1 sebelum tukar: " + anabul1.getIsi().getNama());
        System.out.println("Nama anabul2 sebelum tukar: " + anabul2.getIsi().getNama());
        operator.Tukar(anabul1, anabul2);
        System.out.println("Nama anabul1 setelah tukar: " + anabul1.getIsi().getNama());
        System.out.println("Nama anabul2 setelah tukar: " + anabul2.getIsi().getNama());

        // Menguji fungsi Bobot2 untuk dua objek keturunan Kucing.
        System.out.println();
        System.out.println("----------- BOBOT 2 KUCING ----------");
        Anggora anggora = new Anggora("Cimmy", 6.5, "Snow White");
        Kembangtelon kembangtelon = new Kembangtelon("Kimi", 5.5, "Betina");
        System.out.println("Bobot " + anggora.getNama() + " = " + anggora.getBobot());
        System.out.println("Bobot " + kembangtelon.getNama() + " = " + kembangtelon.getBobot());
        System.out.println("Total bobot = " + OperatorGenerik.Bobot2(anggora, kembangtelon));
    }
}
