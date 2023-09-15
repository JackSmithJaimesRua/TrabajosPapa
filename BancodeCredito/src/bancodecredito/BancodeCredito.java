/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancodecredito;

import java.util.Scanner;


/**
 *
 * @author jackypiero
 */
public class BancodeCredito {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int saldo_actual = 200;
        String optionSeleccionada=" ";
        String monto_Deposito=" ";
        double Ver_saldo;
        double Depositar;
        double Retirar;
        
        System.out.println("***BANCO DE CREDITO JACK***");
        System.out.println("1. VER SALDO: ");
        System.out.println("2. DEPOSITAR: ");
        System.out.println("3. RETIRAR: ");
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la opcion:");
        optionSeleccionada = sc.nextLine();        
        
        if (optionSeleccionada.equals("1")){
            System.out.println("Su saldo es: " + saldo_actual);
        }
        
        Scanner cs = new Scanner(System.in);
        monto_Deposito = cs.nextLine();
        if (optionSeleccionada.equals("2")){
            System.out.println("Cuanto vas a depositar: ");
            System.out.println("Saldo actual: ");
            System.out.println(saldo_actual + monto_Deposito);
        }
        
        
        
        
        
       
    }
    
}
