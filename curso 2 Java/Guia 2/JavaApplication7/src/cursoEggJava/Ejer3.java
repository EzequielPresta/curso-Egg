/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoEggJava;

import java.util.Scanner;

/**
 *
 * @author Eze
 */
public class Ejer3 {
    
    //Escribir un programa que pida una frase y la muestre 
   // toda en mayúsculas y después toda en minúsculas.
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        
        String frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
        
        
    }
          
    
}
