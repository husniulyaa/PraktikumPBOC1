/*  Nama File   : mainPiaraan.java
*   Deskripsi   : berisi program utama untuk menguji class Piaraan
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 10 Mei 2026
*   Lab         : PBO C1
*/

public class mainPiaraan {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk membuat objek Piaraan dan mencoba semua method pada class Piaraan.
    public static void main(String[] args) {
        // Inisialisasi queue piaraan kosong.
        Piaraan P1 = new Piaraan();

        // Inisialisasi beberapa objek anabul dari class turunan yang berbeda.
        Anabul A1 = new Kucing("Milo", "Milo", 4.5);
        Anabul A2 = new Anggora("Miko", "Miko", 5.2, "Putih");
        Anabul A3 = new Kembangtelon("Ciko", "Ciko", 3.8, "Jantan");
        Anabul A4 = new Anjing("Bobby", "Bob");
        Anabul A5 = new Burung("Rio", "Rio");

        // Menguji method pada kondisi queue masih kosong.
        System.out.println("==================== PIARAAN KOSONG ====================");
        System.out.println("Jumlah anabul awal: " + P1.getNbelm());
        System.out.print("Anabul terdepan: ");
        Anabul anabul1 = P1.getAnabul();
        if(anabul1 != null){
            System.out.println(anabul1.getNama());
        }
        else{
            System.out.println("tidak ada");
        }
        System.out.println("Jumlah kucing pada queue kosong: " + P1.countKucing());
        System.out.println("Total bobot kucing pada queue kosong: " + P1.bobotKucing());
        System.out.println();

        // Menambahkan anabul ke dalam queue piaraan.
        System.out.println("==================== ENQUEUE ANABUL ====================");
        P1.enqueueAnabul(A1);
        P1.enqueueAnabul(A2);
        P1.enqueueAnabul(A3);
        P1.enqueueAnabul(A4);
        P1.enqueueAnabul(A5);

        System.out.println("Jumlah anabul setelah enqueue: " + P1.getNbelm());
        System.out.println("Daftar nama anabul:");
        P1.showAnabul();
        System.out.println();

        // Mengecek keanggotaan objek anabul dalam queue.
        System.out.println("==================== CEK MEMBER ====================");
        System.out.println("Apakah Milo ada di piaraan? " + P1.isMember(A1));
        System.out.println("Apakah anabul baru bernama Lulu ada di piaraan? " + P1.isMember(new Kucing("Lulu", "Lu", 2.7)));
        System.out.println();

        // Mengambil data anabul paling depan pada queue.
        System.out.println("==================== ANABUL TERDEPAN ====================");
        Anabul depan = P1.getAnabul();
        if(depan != null){
            System.out.println("Nama anabul terdepan: " + depan.getNama());
            System.out.println("Panggilan anabul terdepan: " + depan.getPanggilan());
        }
        System.out.println();

        // Menampilkan nama anabul beserta jenis class-nya.
        System.out.println("==================== JENIS ANABUL ====================");
        P1.showJenisAnabul();
        System.out.println();

        // Menghitung jumlah kucing dan total bobot kucing.
        System.out.println("==================== DATA KUCING ====================");
        System.out.println("Jumlah kucing: " + P1.countKucing());
        System.out.println("Total bobot kucing: " + P1.bobotKucing());
        System.out.println();

        // Menghapus satu anabul dari depan queue.
        System.out.println("==================== DEQUEUE ANABUL ====================");
        P1.dequeueAnabul();
        System.out.println("Jumlah anabul setelah dequeue: " + P1.getNbelm());
        System.out.println("Anabul terdepan sekarang: " + P1.getAnabul().getNama());
        System.out.println("Daftar anabul setelah dequeue:");
        P1.showAnabul();
        System.out.println();

        // Menguji mutator jumlah elemen pada objek Piaraan lain.
        System.out.println("==================== SET NBELM ====================");
        Piaraan P2 = new Piaraan();
        System.out.println("Jumlah anabul P2 sebelum setNbelm: " + P2.getNbelm());
        P2.setNbelm(0);
        System.out.println("Jumlah anabul P2 setelah setNbelm(0): " + P2.getNbelm());
        System.out.println();

        // Menghapus semua anabul sampai queue kosong.
        System.out.println("==================== DEQUEUE SAMPAI KOSONG ====================");
        P1.dequeueAnabul();
        P1.dequeueAnabul();
        P1.dequeueAnabul();
        P1.dequeueAnabul();
        System.out.println("Jumlah anabul akhir: " + P1.getNbelm());
        P1.showAnabul();
    }
}
