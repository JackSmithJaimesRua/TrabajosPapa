/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numpares_impares;

import java.util.Scanner;

/**
 *
 * @author jackypiero
 */
public class NumPares_Impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int nElementos;
        int contador_Pares = 0;
        int contador_Impares = 0;
        int iterador = 0;
        int valor;
        
        
        System.out.print("Digite la cantidad de elementos que desea: ");
        nElementos = teclado.nextInt();
        
        while(iterador < nElementos){
            System.out.print("Digite su numero " + iterador + " : ");
            valor = teclado.nextInt();
            
            if (valor % 2 == 0) {
                contador_Pares ++; // cont = cont + 1
            }
            else{
                contador_Impares ++;
            }
            iterador ++;
        }
        
        System.out.println("La cantidad de elementos pares son " + contador_Pares);
        System.out.println("La cantidad de elementos impares son " + contador_Impares);
        
    }
    
}
