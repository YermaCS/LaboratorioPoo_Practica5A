package com.mycompany.wordle2;
import java.util.ArrayList;

public class PalabraPuesta {
private ArrayList<Character> palabraP = new ArrayList();
private String palabraPuesta;

    public PalabraPuesta(){
        palabraPuesta="arbol";
        convertirArrayList();
    }
    
    public void convertirArrayList(){
        int i;
        for(i=0;i<palabraPuesta.length();i++)
            palabraP.add(palabraPuesta.charAt(i));
    }
    
    public String getPalabraPuesta(){
        return palabraPuesta;
    }
    
    public ArrayList getArrayListPalabraPuesta(){
        return palabraP;
    }
}
