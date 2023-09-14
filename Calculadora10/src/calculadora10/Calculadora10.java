/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora10;
import java.util.Scanner;
/**
 *
 * @author jackypiero
 */
public class Calculadora10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("TABLA DE MULTIPLICAR");
        System.out.println("Digite el número:");
        
        int numero=scanner.nextInt();
        
        for (int i =0; i <= 10; i++){
            System.out.println(numero + "*" + i + "=" + (numero*i));
        }
        
        
    }
    
}
