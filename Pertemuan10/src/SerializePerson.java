/*  Nama File   : SerializePerson.java
*   Deskripsi   : berisi program untuk serialisasi objek Person
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson{
    /****************METHOD***************/
    /*************METHOD MAIN*************/
    // Method utama untuk menulis objek Person ke file serialisasi.
    public static void main (String[] args) {
        // Membuat objek person yang akan diserialisasi.
        Person person = new Person("Panji");

        try{
            // Membuka file person.ser sebagai tujuan penulisan objek.
            FileOutputStream f= new FileOutputStream("person.ser");

            // Menulis objek person ke file person.ser.
            ObjectOutputStream s = new ObjectOutputStream (f);
            s.writeObject (person) ;
            System.out.println("selesai menulis objek person");
            s.close () ;
        }catch (IOException e) {
            // Menampilkan pesan error jika proses penulisan objek gagal.
            e.printStackTrace ();
        }
    }
}
