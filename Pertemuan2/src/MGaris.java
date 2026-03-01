/*  Nama File   : MGaris.java
*   Deskripsi   : berisi main dalam class Garis
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 26 Februari 2026
*/

public class MGaris {
    public static void main(String[] args) {
        Titik P1 = new Titik(-2, 0); // sejajar
        Titik P2 = new Titik(0, 4); // sejajar
        Titik P3 = new Titik(-3, 0); // tegak lurus
        Titik P4 = new Titik(); // sejajar
        Titik P5 = new Titik(1, 2); // tegak lurus
        Titik P6 = new Titik(3, -2); // tegak lurus
        Titik P7 = new Titik(1, 2); // sejajar

        Garis G1 = new Garis();
        Garis G2 = new Garis(P1, P2); // sejajar
        Garis G3 = new Garis();
        Garis G4 = new Garis(P3, P5); // tegak lurus dgn G5
        Garis G5 = new Garis(P5, P6); // tegak lurus dgn G4
        Garis G6 = new Garis(P4, P7); // sejajar
        

        G1.printGaris();
        G2.printGaris();
        G1.seTitikAwal(P2);
        G1.seTitikAkhir(P3);
        G1.printGaris();
        G3.setGaris(P2, P1);
        G3.printGaris();

        System.out.println("Banyak garis yang sudah dibuat: " + Garis.getCounterGaris());
        System.out.println("Panjang G2: " + G2.panjangGaris());
        System.out.println("Panjang G3: "+ G3.panjangGaris());
        System.out.println("Gradien G1: " + G6.gradien());
        System.out.println("Gradien G2: " + G5.gradien());
        
        P4 = G2.titikTengah();
        P4.prinTitik();
        System.out.println("is sejajar G1 & G2: " + G1.isSejajar(G2));
        System.out.println("is sejajar: " + G2.isSejajar(G6));
        System.out.println("is tegak lurus: " + G4.isTegakLurus(G5));
        System.out.println("is tegak lurus: " + G2.isTegakLurus(G6));

        G2.persamaanGaris();
        G4.persamaanGaris();
        G6.persamaanGaris();
    }
}
