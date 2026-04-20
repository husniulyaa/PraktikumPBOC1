/**
 * File         : Lingkaran.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * 
 */

// class Lingkaran
public class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}