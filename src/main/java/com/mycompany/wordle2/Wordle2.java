package com.mycompany.wordle2;

public class Wordle2 {
private Tablero tb = new Tablero();
    
    public static void main(String[] args) {
        Wordle2 wr = new Wordle2();
        int i;
        
        wr.tb.mostrarPalabrasUsadas();
        wr.tb.mostrarTeclado();
        
        for(i=0;i<5;i++)
        {
            wr.tb.agregarPalabraEscrita(wr.tb.pedirPalabra());
            wr.tb.mostrarPalabrasUsadas();
            wr.tb.mostrarTeclado();
            
            if(wr.tb.compararValidez())
                break;
        }
        System.out.println("Juego Terminado");
        System.out.println("Palabra secreta: "+wr.tb.getPalabraPuesta());
    }    
}
