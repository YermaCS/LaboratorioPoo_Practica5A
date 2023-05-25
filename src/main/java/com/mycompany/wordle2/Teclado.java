package com.mycompany.wordle2;
import java.util.ArrayList;

public class Teclado {
    ArrayList<Character> teclado = new ArrayList();
    
    public Teclado(){
        teclado.add('q');
        teclado.add('w');
        teclado.add('e');
        teclado.add('r');
        teclado.add('t');
        teclado.add('y');
        teclado.add('u');
        teclado.add('i');
        teclado.add('o');
        teclado.add('p');
        teclado.add('a');
        teclado.add('s');
        teclado.add('d');
        teclado.add('f');
        teclado.add('g');
        teclado.add('h');
        teclado.add('j');
        teclado.add('k');
        teclado.add('l');
        teclado.add('ñ');
        teclado.add('z');
        teclado.add('x');
        teclado.add('c');
        teclado.add('v');
        teclado.add('b');
        teclado.add('n');
        teclado.add('m');
    }
    
    public void mostrarTeclado(ArrayList letrasUsadas){
        int i;
        
         
        
        for(i=0;i<teclado.size();i++)
        {
            
            if(letrasUsadas.contains(teclado.get(i)))
                System.out.print("("+teclado.get(i)+")"); 
            else
                System.out.print("["+teclado.get(i)+"]");  
            
            if(i==9 || i==19)
                if(i==19)
                    System.out.println("\t");
                else
                    System.out.println("");
        }
        
        System.out.println("\n");
    }
    
}