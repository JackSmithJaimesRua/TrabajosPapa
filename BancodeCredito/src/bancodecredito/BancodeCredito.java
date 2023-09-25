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
        String Nombre_ID = " ";
        String Contraseña = " ";
        final int saldo_actual = 200;
        String optionSeleccionada=" ";
        String monto_Deposito=" ";
        String monto_Retirar="";
        
        
        System.out.println("***BANCO DE CREDITO JACK***");
        System.out.println("0.Ingrese su ID: ");
        System.out.println("1.1 Ingrese su Contraseña:");
        System.out.println("1. VER SALDO: ");
        System.out.println("2. DEPOSITAR: ");
        System.out.println("3. RETIRAR: ");
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la opcion:");
        optionSeleccionada = sc.nextLine();        
        
        
        Scanner id = new Scanner(System.in);
        
        if (optionSeleccionada.equals("0")){
            System.out.println("Ingresa su ID: " + Nombre_ID);
      
        } else {
            System.out.println("Su ID es incorrecto");
        }
        
            optionSeleccionada = id.nextLine();
        
          
        Scanner rs = new Scanner(System.in);
        
        if (optionSeleccionada.equals("1.1")){
            System.out.println("Ingresa tu contraseña: " + Contraseña);
        } else {
            System.out.println("Contraseña incorrecta");
            
        }
       
        optionSeleccionada = rs.nextLine(); 
        
        if (optionSeleccionada.equals("1")){
            System.out.println("Su saldo es: " + saldo_actual);
        }
        
        Scanner cs = new Scanner(System.in);
        
        
        
        if  (optionSeleccionada.equals("2")){
            System.out.println("Saldo_actual: " + saldo_actual);
            System.out.println("Cuanto vas a depositar: ");
            
            monto_Deposito = cs.nextLine();
            
            double cantidadDeposito = Integer.parseInt(monto_Deposito);
            
            double nuevoSaldo = saldo_actual + cantidadDeposito;
            System.out.println("Nuevo saldo: " + nuevoSaldo);
            
        }
        
        
        Scanner rt = new Scanner(System.in);
        
         
        
        
        if (optionSeleccionada.equals("3")){
            System.out.println("Saldo_actual: " + saldo_actual);
            System.out.println("Cuanto vas a retirar: ");
        
            monto_Retirar = rt.nextLine();
        
            double cantidadRetiro = Integer.parseInt(monto_Retirar);
        
            double nuevoRetiro = saldo_actual - cantidadRetiro;
        
            System.out.println("Saldo que te queda: " + nuevoRetiro);
        
        } 
   
    }
}
