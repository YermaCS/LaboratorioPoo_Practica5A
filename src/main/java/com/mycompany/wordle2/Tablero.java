package com.mycompany.wordle2;
import java.util.Scanner;
import java.util.ArrayList;

public class Tablero {
private Scanner entrada = new Scanner(System.in);
private String valorEntrada;

private PalabraPuesta palabraP = new PalabraPuesta();

private Canva canva = new Canva();

private ArrayList<PalabrasUsadas> palabrasU = new ArrayList();
private int i=-1;

private ArrayList<Character> letrasUsadas = new ArrayList();
    
    public Tablero(){
        
    }    
    //Acciones con palabras escritas
    public String pedirPalabra(){
        System.out.println("Escribe la palabra");
        valorEntrada = entrada.nextLine();
                
        definirLetrasUsadas(valorEntrada);
        return valorEntrada;
    }
    
    public void agregarPalabraEscrita(String palabra){
        palabrasU.add(new PalabrasUsadas(palabra));
        i++;
    }
    
    public int cantPalabrasPuestas(){
        return palabrasU.size();
    }
    
    //Acciones con palabra Puesta
    public boolean compararValidez(){
        boolean gana=false;
        
        if(palabrasU.get(i).getPalabra().equals(palabraP.getPalabraPuesta()))
        {
            System.out.println("Ganaste");
            gana=true;
        }
        return gana;
    }
    
    public void definirLetrasUsadas(String entrada){
        int i;
        
        for(i=0;i<5;i++)
            letrasUsadas.add(entrada.charAt(i));
    }
    
    //Acciones Canva
    public void mostrarPalabrasUsadas(){
        int i,tam=palabrasU.size();
        
        if(!palabrasU.isEmpty())
        {
            for(i=0;i<5;i++)
            if(i<tam)
                canva.mostrarPalabrasUsadas(true,palabrasU.get(i).getPalabra(),palabraP.getPalabraPuesta(),palabraP.getArrayListPalabraPuesta());
            else
                canva.mostrarPalabrasUsadas(false,palabrasU.get(0).getPalabra(),palabraP.getPalabraPuesta(),palabraP.getArrayListPalabraPuesta());
        }
        else
            canva.mostrarVacio();
          
    }
    
    public void mostrarTeclado(){
        canva.desplegarTeclado(letrasUsadas);
    }
    
}
