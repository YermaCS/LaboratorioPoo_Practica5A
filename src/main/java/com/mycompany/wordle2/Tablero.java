package com.mycompany.wordle2;
import java.util.Scanner;
import java.util.ArrayList;

public class Tablero {
private Scanner entrada = new Scanner(System.in);
private String valorEntrada;

private PalabraPuesta palabraP = new PalabraPuesta();

private Canva canva = new Canva();

private ArrayList<PalabrasUsadas> palabrasU = new ArrayList();
private int i;

private ArrayList<Character> letrasUsadas = new ArrayList();
    
    public Tablero(){
        i=-1;
    }    
    //Acciones con palabras escritas
    public String pedirPalabra(){
        
        do
        {
            System.out.println("Escribe una palabra palabra de 5 letras");
            valorEntrada = entrada.nextLine();
            
        }while(validarPalabraPuesta(valorEntrada));
                
        definirLetrasUsadas(valorEntrada);
        return valorEntrada;
    }
    
    public void agregarPalabraEscrita(String palabra){
        palabrasU.add(new PalabrasUsadas(palabra));
    }
    
    public int cantPalabrasPuestas(){
        return palabrasU.size();
    }
    
    public boolean validarPalabraPuesta(String valorEntrada){
        boolean valido;
        
        if(palabraP.getListaDePalabras().contains(valorEntrada))
        {
            i++;
            valido=false;
        }
        else
        {
            System.out.println("Has escrito una palabra inválida o inexistente... intenta de nuevo");
            valido = true;
            
        }
        
        return valido;
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
    
    public String getPalabraPuesta(){
        return palabraP.getPalabraPuesta();
    }
    
    public void definirLetrasUsadas(String entrada){
        int i;
        
        for(i=0;i<5;i++)
            letrasUsadas.add(entrada.charAt(i));
    }
    
    //Acciones Canva
    public void mostrarPalabrasUsadas(){
        int i,tam=palabrasU.size();
        
        mostrarInstrucciones();
        if(!palabrasU.isEmpty())
        {
            for(i=0;i<5;i++)
            if(i<tam)
                canva.mostrarPalabrasUsadas(true,palabrasU.get(i).getPalabra(),palabraP.getPalabraPuesta(),palabraP.getArrayListPalabraPuesta());
            else
                canva.mostrarPalabrasUsadas(false,palabrasU.get(0).getPalabra(),palabraP.getPalabraPuesta(),palabraP.getArrayListPalabraPuesta());
            
            System.out.println("");
        }
        else
            canva.mostrarVacio();
    }
    
    public void mostrarInstrucciones(){
        System.out.println("[] = No se encuentra en la palabra\n{} = Se encuentra en la palabra pero no en esa posicion\n() = Se encuentra en la palabra en esa posición\n");
    }
    
    public void mostrarTeclado(){
        canva.desplegarTeclado(letrasUsadas);
    }
    
}
