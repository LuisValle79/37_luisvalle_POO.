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
public class Main_S05_37luisvalle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libro libro1 = new libro();
        libro1.año="2015";
        libro1.estado="nuevo";
        System.out.println("el libro es del año "+libro1.año+" y su estado es "+libro1.estado);
        
         estudiante estudiante1 = new estudiante();
         estudiante1.jugar(25,"luis");
         estudiante1.correr("ruben", 20);
         
        
         estudiante estudiante2 = new estudiante();
         estudiante2.jugar(18,"jose");
         estudiante2.correr("max",32);
         
        auto auto1 = new auto();
        auto1.color ="negro";
        auto1.marca ="ferrari";
        auto1.km = 125;
        System.out.println("el auto es de color "+auto1.color+" y su marca es "+auto1.marca+" y su kilometraje es "+auto1.km);
           
        
        cuentabancaria cuenta1 = new cuentabancaria();
        cuenta1.retirar("456897526341");
        cuenta1.depositar(7850);
        
        
        
}
}
