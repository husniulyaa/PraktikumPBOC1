/*  Nama File   : Person.java
*   Deskripsi   : berisi atribut dan method dalam class Person
*   Pembuat     : Husni Ulyaa Khanifah/24060124120021
*   Tanggal     : 21 Mei 2026
*   Lab         : PBO C1
*/

import java.io.Serializable;

public class Person implements Serializable {
    /***************ATRIBUT***************/
    private int id;
    private String name;
    
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor dengan parameter nama untuk menginisialisasi objek Person.
    public Person(String n){
        this.name = n;
    }
    
    // Konstruktor dengan parameter id dan nama untuk menginisialisasi objek Person.
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    /**************SELEKTOR**************/
    // Mengembalikan id person.
    public int getId(){
        return id;
    }
    
    // Mengembalikan nama person.
    public String getName(){
        return name;
    }
}
