/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;

/**
 *
 * @author NITRO V15
 */
public class Person implements Serializable {
    private int id;
    private String name;
    
    public Person(String n){
        this.name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
