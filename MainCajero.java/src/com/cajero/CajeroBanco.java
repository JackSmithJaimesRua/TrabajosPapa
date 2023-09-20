/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cajero;

/**
 *
 * @author jackypiero
 */
public class CajeroBanco {
    private double saldo;
    
    public CajeroBanco(){
        this.saldo = 0.0;
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo actual:$" + saldo);
    }
    
    public void retirar(double cantidad){
        if(cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("Has retirado $" + cantidad);
        } else {
            System.out.println("No se pudo realizar el retiro. Verifica el saldo y la cantidad.");
            
        }
        
    }
    
    public void depositar(double cantidad){
        if(cantidad > 0){
           saldo += cantidad;
           System.out.println("Has depositado $" + cantidad);
           
        }else{
            System.out.println("No se pudo realizar el depósito. Verifica la cantidad.");
        }
    }
   
}

