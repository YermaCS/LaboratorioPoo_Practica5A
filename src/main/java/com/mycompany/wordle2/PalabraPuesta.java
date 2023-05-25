package com.mycompany.wordle2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

public class PalabraPuesta {
private ArrayList<Character> palabraP = new ArrayList();
private String palabraPuesta=" ";
private FileReader archivo;
private BufferedReader lector;
private ArrayList<String> listaPalabras = new ArrayList();
private Random rmd = new Random();

    public PalabraPuesta(){
        
        try{
            archivo = new FileReader("C:\\Users\\pluto\\OneDrive\\Documents\\NetBeansProjects\\Wordle2\\palabras.txt");
            
            if(archivo.ready())
                lector = new BufferedReader(archivo);
            else
                System.out.println("El archivo no está listo para ser leido");
        }
        catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
        
        while(palabraPuesta!=null)
        {
            try {
                palabraPuesta = lector.readLine();
                listaPalabras.add(palabraPuesta);
            } catch (IOException ex) {
                Logger.getLogger(PalabraPuesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        palabraPuesta = listaPalabras.get(rmd.nextInt(listaPalabras.size()));
        
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
    
    public ArrayList getListaDePalabras(){
        return listaPalabras;
    }
}
