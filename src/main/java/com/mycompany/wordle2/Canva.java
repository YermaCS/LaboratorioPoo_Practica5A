/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wordle2;
import java.util.ArrayList;


public class Canva {
Teclado teclado = new Teclado();    

    public Canva(){
        
    }
    
    public void desplegarTeclado(ArrayList letrasUsadas){
        teclado.mostrarTeclado(letrasUsadas);
    }
    
    public void mostrarPalabrasUsadas(boolean existe,String palabraU,String palabraP,ArrayList ArrayPalabraP){
        int i=0;
        
        for(i=0;i<5;i++)
            if(existe==true)
            {
                if(palabraU.charAt(i)==palabraP.charAt(i))
                    System.out.print("("+(palabraU.charAt(i))+")");
                else
                    if(ArrayPalabraP.contains(palabraU.charAt(i)))
                        System.out.print("{"+(palabraU.charAt(i))+"}");
                    else
                        System.out.print("["+(palabraU.charAt(i))+"]");
            }
            else
                System.out.print("[ ]");
        
        System.out.println("");
    }
    
    public void mostrarVacio(){
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
                System.out.print("[ ]");
            System.out.print("\n");
        }
        
    }
}
