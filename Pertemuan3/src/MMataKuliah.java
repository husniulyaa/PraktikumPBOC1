public class MMataKuliah {
    public static void main(String[] args) {
        MataKuliah MK1 = new MataKuliah();
        MK1.setID("MK123");
        MK1.setNama("MBD");
        MK1.setSKS(3);
        MK1.printMatKul();
        System.out.println("ID MK1: " + MK1.getID());
    }
}
