public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan();
        System.out.println("No Plat: " + K1.getNoPlat());
        System.out.println("Jenis: "+ K1.getJenis());
        K1.setNoPlat("12ABC1");
        K1.setJenis("Mazda");
        K1.printKendaraan();
    }
}
