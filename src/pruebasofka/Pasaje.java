/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasofka;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class Pasaje {
    
    public int valor;
    public int distancia;
    public int numDias;
    public double km = 35.00;
    public double desc = 0.30;

    public Pasaje(int valor, int distancia, int numDias) {
        this.valor = valor;
        this.distancia = distancia;
        this.numDias = numDias;
    }

    public Pasaje() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }
    
    
    public void calcularValor(){
        
        String dist = JOptionPane.showInputDialog("Ingrese la distancia a recorrer: ");
        int distancia = Integer.parseInt(dist);
        System.out.println("Distancia a recorrer: "+distancia);
        
        String dias = JOptionPane.showInputDialog("Ingrese el numero de días: ");
        int numDias = Integer.parseInt(dias);
        System.out.println("Numero de días: "+numDias);
        
        if(distancia > 1000 && numDias >  7){
            valor = (int) ((distancia * km ) * numDias);
            double valorDesc = valor * desc;
            double valorFinal = valor - valorDesc;
            System.out.println("Valor vuelo con descuento: "+ valorFinal);
        }else{
            valor = (int) ((distancia * km ) * numDias);
            System.out.println("Valor vuelo: "+ valor);
        
        }
        
    
    }
    
    
    
    
}
