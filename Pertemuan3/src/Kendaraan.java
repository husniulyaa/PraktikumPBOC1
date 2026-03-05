public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String plat, String jenis){
        this.noPlat = plat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setNoPlat(String plat){
        this.noPlat = plat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan(){
        System.out.println("No Plat: "+this.noPlat+", jenis: "+this.jenis);
    }

}
