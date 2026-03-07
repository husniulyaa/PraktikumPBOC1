public class MMahasiswa {
    public static void main(String[] args) {
        // Informasi Dosen [Class Dosen]
        System.out.println(("Informasi Dosen: "));
        Dosen D1 = new Dosen();
        Dosen D2 = new Dosen("238382", "Dosen2", "Informatika");
        Dosen D3 = new Dosen("4528301", "Dosen3", "Informatika");
        System.out.println("Dosen 1: ");
        D1.setNIP("12345");
        D1.setNama("Dosen1");
        D1.setProdi("Informatika");
        System.out.println("NIP: " + D1.getNIP());
        System.out.println("Nama: "+ D1.getNama());
        System.out.println("Prodi: " + D1.getProdi());
        System.out.println();

        System.out.println("Dosen 2: ");
        System.out.println("NIP: " + D2.getNIP());
        System.out.println("Nama: "+ D2.getNama());
        System.out.println("Prodi: " + D2.getProdi());
        System.out.println();

        System.out.println("Dosen 3: ");
        System.out.println("NIP: " + D3.getNIP());
        System.out.println("Nama: "+ D3.getNama());
        System.out.println("Prodi: " + D3.getProdi());
        System.out.println();

        System.out.println("Data keseluruhan Dosen: ");
        D1.printDosen();
        D2.printDosen();
        D3.printDosen();
        System.out.println();

        // informasi kendaraan [Class Kendaraan]
        System.out.println("Informasi Kendaraan: ");
        Kendaraan K1 = new Kendaraan();
        Kendaraan K2 = new Kendaraan("AB 123 Y", "BMW");
        Kendaraan K3 = new Kendaraan("H 1528 Z", "Mercy");
        System.out.println("Kendaraan 1: ");
        K1.setNoPlat("K 2572 ZX");
        K1.setJenis("Mazda");
        System.out.println("No Plat: " + K1.getNoPlat());
        System.out.println("Jenis: "+ K1.getJenis());

        System.out.println();
        System.out.println("Kendaraan 2:");
        System.out.println("No Plat: " + K2.getNoPlat());
        System.out.println("Jenis: "+ K2.getJenis());

        System.out.println();
        System.out.println("Kendaraan 3:");
        System.out.println("No Plat: " + K3.getNoPlat());
        System.out.println("Jenis: "+ K3.getJenis());


        System.out.println();
        System.out.println("Data keseluruhan kendaraan:");
        K1.printKendaraan();
        K2.printKendaraan();
        K3.printKendaraan();
        System.out.println();

        // Informasi Mata Kuliah [Class MataKuliah]
        System.out.println("Informasi Mata Kuliah: ");
        MataKuliah MK1 = new MataKuliah();
        MataKuliah MK2 = new MataKuliah("MK345", "ASA", 3);
        MataKuliah MK3 = new MataKuliah("MK728", "PBO", 3);
        MataKuliah MK4 = new MataKuliah("MK212", "GTI", 3);
        System.out.println("MK1: ");
        MK1.setID("MK123");
        MK1.setNama("MBD");
        MK1.setSKS(3);
        System.out.println("ID MK1: " + MK1.getID());
        System.out.println("Nama MK1: " + MK1.getNamaMatkul());
        System.out.println("SKS MK1: " + MK1.getSKS());

        System.out.println();
        System.out.println("MK2: ");
        System.out.println("ID MK2: " + MK2.getID());
        System.out.println("Nama MK2: " + MK2.getNamaMatkul());
        System.out.println("SKS MK2: " + MK2.getSKS());
        System.out.println();

        System.out.println("MK3: ");
        System.out.println("ID MK3: " + MK3.getID());
        System.out.println("Nama MK3: " + MK3.getNamaMatkul());
        System.out.println("SKS MK3: " + MK3.getSKS());
        System.out.println();

        System.out.println("MK4: ");
        System.out.println("ID MK4: " + MK4.getID());
        System.out.println("Nama MK4: " + MK4.getNamaMatkul());
        System.out.println("SKS MK4: " + MK4.getSKS());
        System.out.println();

        System.out.println("Data keseluruhan Mata Kuliah:");
        MK1.printMatKul();
        MK2.printMatKul();
        MK3.printMatKul();
        MK4.printMatKul();
        System.out.println();

        // Informasi Mahasiswa [Class Mahasiswa]
        System.out.println("Informasi Mahasiswa: ");
        Mahasiswa Mhs1 = new Mahasiswa();
        Mahasiswa Mhs2 = new Mahasiswa();
        Mahasiswa Mhs3 = new Mahasiswa();
        Mhs1.setNIM("12345678");
        Mhs1.setNama("Mhs1");
        Mhs1.setProdi("Informatika");
        Mhs1.setDosWal(D3);
        Mhs1.setKendaraan(K3);
        Mhs1.addMatKul(MK1);
        Mhs1.addMatKul(MK2);
        Mhs1.addMatKul(MK4);
        System.out.println("Data Mhs1: ");
        System.out.println("NIM Mhs1: "+Mhs1.getNIM());
        System.out.println("Nama Mhs1: "+Mhs1.getNama());
        System.out.println("Prodi Mhs1: "+Mhs1.getProdi());
        System.out.print("ListMatKul Mhs1: ");
        Mhs1.getListMatKul();
        System.out.println();
        System.out.println("DosWal Mhs1: "+Mhs1.getDosWal().getNama());
        System.out.println("Kendaraan Mhs1: "+Mhs1.getKendaraan().getJenis());
        System.out.println("Jumlah SKS Mhs1: "+Mhs1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah Mhs1: "+ Mhs1.getJumlahMatkul());
        
        System.out.println();
        System.out.println("Mahasiswa 2:");
        Mhs2.setNIM("23619301");
        Mhs2.setNama("Mhs2");
        Mhs2.setProdi("Informatika");
        Mhs2.setDosWal(D1);
        Mhs2.setKendaraan(K2);
        Mhs2.addMatKul(MK4);
        Mhs2.addMatKul(MK2);
        System.out.println("Data Mhs2: ");
        System.out.println("NIM Mhs2: "+Mhs2.getNIM());
        System.out.println("Nama Mhs2: "+Mhs2.getNama());
        System.out.println("Prodi Mhs2: "+Mhs2.getProdi());
        System.out.print("ListMatKul Mhs2: ");
        Mhs2.getListMatKul();
        System.out.println();
        System.out.println("DosWal Mhs2: "+Mhs2.getDosWal().getNama());
        System.out.println("Kendaraan Mhs2: "+Mhs2.getKendaraan().getJenis());
        System.out.println("Jumlah SKS Mhs2: "+Mhs2.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah Mhs2: "+ Mhs2.getJumlahMatkul());

        System.out.println();
        System.out.println("Mahasiswa 3:");
        Mhs3.setNIM("27318740");
        Mhs3.setNama("Mhs3");
        Mhs3.setProdi("Informatika");
        Mhs3.setDosWal(D2);
        Mhs3.setKendaraan(K1);
        Mhs3.addMatKul(MK1);
        Mhs3.addMatKul(MK3);
        System.out.println("Data Mhs3: ");
        System.out.println("NIM Mhs3: "+Mhs3.getNIM());
        System.out.println("Nama Mhs3: "+Mhs3.getNama());
        System.out.println("Prodi Mhs3: "+Mhs3.getProdi());
        System.out.print("ListMatKul Mhs3: ");
        Mhs3.getListMatKul();
        System.out.println();
        System.out.println("DosWal Mhs3: "+Mhs3.getDosWal().getNama());
        System.out.println("Kendaraan Mhs3: "+Mhs3.getKendaraan().getJenis());
        System.out.println("Jumlah SKS Mhs3: "+Mhs3.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah Mhs3: "+ Mhs3.getJumlahMatkul());

        System.out.println();
        System.out.println("Identitas Mahasiswa keseluruhan: ");
        System.out.println("Mahasiswa 1:");
        Mhs1.printMhs();
        System.out.println();
        System.out.println("Mahasiswa 2:");
        Mhs2.printMhs();
        System.out.println();
        System.out.println("Mahasiswa 2:");
        Mhs3.printMhs();
        System.out.println();

        System.out.println("Data keseluruhan Mahasiswa: ");
        System.out.println("Mahasiswa 1:");
        Mhs1.printDetailMhs();
        System.out.println();
        System.out.println("Mahasiswa 2:");
        Mhs2.printDetailMhs();
        System.out.println();
        System.out.println("Mahasiswa 2:");
        Mhs3.printDetailMhs();
    }
}
