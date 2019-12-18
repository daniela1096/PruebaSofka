/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasofka;

/**
 *
 * @author Daniela
 */
public class PruebaSofka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("============ EJERCICIO 1 ===========");
        Pasaje pasaje1 = new Pasaje();
        //pasaje1.setDistancia(1230);
        //pasaje1.setNumDias(10);
        pasaje1.calcularValor();
        
        System.out.println("====================================");
        System.out.println("============ EJERCICIO 2 ===========");
        
        Equipaje equip = new Equipaje();
        //equip.setNumBultos(5);
        equip.controlBultos();
        equip.setPesoBultoMax(400);
        equip.setPesoBultoMin(30);
        equip.calcularProm();
    }
    
}
