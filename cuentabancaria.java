/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_37luisvalle;

/**
 *
 * @author Luis
 */
public class cuentabancaria {
    String ncuenta;
    int monto;
    
    public void retirar(String ncuenta){
        System.out.println("ingrese el numero de cuenta: "+ncuenta);
    }
    public void depositar(int monto){
        System.out.println("ingrese el monto a depositar: "+monto);
    }
}
