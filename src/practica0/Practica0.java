/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author infor03
 */
public class Practica0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        // TODO code application logic here
    
        int[] numeros = new int[5];
        Scanner read=new Scanner(System.in);
        
        for(int i=1; i<numeros.length+1; i++){
            System.out.println("Introduce el número " + i);
            int numero=read.nextInt();
            numeros[i-1]=numero;
        }
        System.out.println("Elija el método a usar");
        int metodo=read.nextInt();
        switch(metodo){
            case 1:
                practica1(numeros); 
                break;
            case 2:
                practica2(numeros); 
                break;
            default:
                System.out.println("No hay elección seleccionada, prueba1");
        }
    }
        
    public static void practica1(int[] numeros){
        System.out.println(Arrays.toString(numeros));
    }
    public static void practica2(int[] numeros){
        int[] numeros2 = new int[5];
        int contador=0;
        for(int i=numeros.length-1; i>=0; i--){
            numeros2[contador]=numeros[i];
            contador=contador+1;
        }
        System.out.println(Arrays.toString(numeros2));
    }
}
