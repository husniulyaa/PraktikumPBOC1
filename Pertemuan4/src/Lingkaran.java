public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        this.jari = 0;
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*Math.pow(jari, 2);
    }

    public double getKeliling(){
        return 2*Math.PI*this.jari;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + this.jari);
    }
}
