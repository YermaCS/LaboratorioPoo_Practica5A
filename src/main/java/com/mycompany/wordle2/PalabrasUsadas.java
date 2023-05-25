/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordle2;
import java.util.ArrayList;

public class PalabrasUsadas {
    private ArrayList<Character> palabraU = new ArrayList<>();
    private String palabra;
    
    public PalabrasUsadas(String palabra){
        convertirArrayList(palabra);
        this.palabra = palabra;
    }
    
    public void convertirArrayList(String palabra){
        int i;
        for(i=0;i<palabra.length();i++)
            palabraU.add(palabra.charAt(i));
    }
    
    public String getPalabra(){
        return palabra;
    }
    
}
