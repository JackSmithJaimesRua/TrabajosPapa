/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maincajero.java;

import com.cajero.CajeroBanco;

import java.util.Scanner;
/**
 *
 * @author jackypiero
 */
public class MainCajeroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CajeroBanco cajero = new CajeroBanco();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("1. Mostrar Saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción");
            
            int opcion = scanner.nextInt();
            
            switch (opcion){
                case 1:
                    cajero.mostrarSaldo();
                    break;
                
                case 2:
                    System.out.println("Ingresa la cantidad a retirar:$");
                    double cantidadRetiro = scanner.nextDouble();
                    cajero.retirar(cantidadRetiro);
                    break;
                    
                case 3:
                    System.out.println("Ingresa la cantidad a depositar:$");
                    double cantidadDeposito = scanner.nextDouble();
                    cajero.depositar(cantidadDeposito);
                    break;
                    
                case 4:
                    System.out.println("Gracias por utilizar nuestro cajero.");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
            

    }
    
}
