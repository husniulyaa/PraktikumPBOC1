public class MDosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        System.out.println("NIP: " + D1.getNIP());
        System.out.println("Nama: "+ D1.getNama());
        System.out.println("Prodi: " + D1.getProdi());
        D1.setNIP("12345");
        D1.setNama("Adalah Pokoknya");
        D1.setProdi("Informatika");
        D1.printDosen();
    }
}
