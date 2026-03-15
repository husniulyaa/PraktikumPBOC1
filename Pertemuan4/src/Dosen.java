public class Dosen extends Pegawai {
    /***************ATRIBUT***************/
    protected String fakultas;

    public Dosen(){
        this.fakultas = "";
    }

    public Dosen(String fakul){
        this.fakultas = fakul;
    }

    public void printInfoDosen(){
        super.printInfoPegawai();
        System.out.println("fakultas: " + this.fakultas);
    }
}
