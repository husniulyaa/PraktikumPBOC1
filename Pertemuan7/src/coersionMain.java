/*  Nama File   : coersionMain.java
*   Deskripsi   : berisi program utama untuk menguji berbagai proses konversi tipe data sederhana di Java
*   Tanggal     : 24 April 2026
*   Lab         : PBO C1
*/

public class coersionMain {
    /***************METHOD***************/
    /*************METHOD MAIN************/
    // Method utama untuk menampilkan contoh konversi antar tipe data primitif dan objek.
    public static void main(String[] args){
        System.out.println("----------------------------------------------------------");
        // Menampilkan konversi nilai integer ke karakter dan ke bilangan real.
        int intValue = 70;
        char char1 = 'F';
        System.out.println("Nilai integer: " + intValue);
        System.out.println("Konversi ke karakter: " + (char)intValue);
        System.out.println("Konversi char ke int: " + (int)char1);
        System.out.println("Hasil konversi nilai int ke real: " + (double)intValue);

        // Menampilkan hasil konversi nilai real kembali ke integer.
        System.out.println("----------------------------------------------------------");
        double realValue = (double)intValue;
        int newIntValue = (int)realValue;
        System.out.println("Nilai real: " + realValue);
        System.out.println("Konversi nilai double ke integer: " + newIntValue);

        // Menampilkan perbedaan hasil konkatenasi string dan penjumlahan numerik.
        System.out.println("----------------------------------------------------------");
        String X = "164";
        String Y = "90";
        String S = X + Y;
        int Z = (Integer.parseInt(X) + Integer.parseInt(Y));
        System.out.println("Konversi X ke integer: " + Integer.parseInt(X));
        System.out.println("Konversi Y ke integer: " + Integer.parseInt(Y));
        System.out.println("Hasil concat dari X dan Y: " + S);
        System.out.println("Hasil jumlah X + Y dalam integer: " + Z);
        System.out.println("Konversi X ke double: " + Double.parseDouble(X));
        System.out.println("Konversi Y ke double: " + Double.parseDouble(Y));
        System.out.println("Penjumlahan X double + Y double: " + Double.parseDouble(X) + Double.parseDouble(Y));
        System.out.println("Penjumlahan (X double + Y double): " + (Double.parseDouble(X) + Double.parseDouble(Y)));

        // Menampilkan hasil konkatenasi dan penjumlahan dua bilangan pecahan dalam bentuk string.
        System.out.println("----------------------------------------------------------");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = (Double.parseDouble(P) + Double.parseDouble(Q));
        System.out.println("Hasil konkatenasi: " + R);
        System.out.println("Hasil penjumlahan: " + D);

        // Menampilkan hasil konversi string numerik menjadi integer.
        System.out.println("----------------------------------------------------------");
        Integer A = Integer.parseInt(S);
        System.out.println("Konversi S ke integer: " + A);
        System.out.println("Tipe data variabel A: " + A.getClass().getSimpleName());
        
        // Menampilkan hasil konversi integer object kembali menjadi string.
        System.out.println("----------------------------------------------------------");
        String T = A.toString();
        System.out.println("Konversi B ke String: " + T);
        System.out.println("Tipe data variabel T: " + T.getClass().getSimpleName());
    }
}
