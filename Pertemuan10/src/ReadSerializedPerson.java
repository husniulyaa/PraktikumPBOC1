/*  Nama File   : ReadSerializedPerson.java
*   Deskripsi   : berisi program untuk membaca hasil serialisasi objek Person
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/

import java.io.*;

public class ReadSerializedPerson{
    /****************METHOD***************/
    /*************METHOD MAIN*************/
    // Method utama untuk membaca objek Person dari file hasil serialisasi.
    public static void main(String[] args) {
        // Membuat variabel person untuk menampung objek hasil pembacaan file.
        Person person = null;

        try{
            // Membuka file person.ser sebagai sumber data serialisasi.
            FileInputStream f = new FileInputStream("person.ser");

            // Membaca objek dari file person.ser.
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject () ;
            s.close ();

            // Menampilkan nama person hasil deserialisasi.
            System.out.println("serialized person name = "+person.getName () ) ;
        }catch (Exception ioe) {
            // Menampilkan pesan error jika proses pembacaan objek gagal.
            ioe.printStackTrace ();
        }
    }
}
