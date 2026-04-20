/**
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * 
 */

// class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran l = " + kelilingLingkaran);
    }
}

