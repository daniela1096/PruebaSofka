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
public class Equipaje extends Bulto{
    
    public double capCargaAvion = 18.000;
    //public int numBultos;
    public double pesoBultoMax;
    public double pesoBultoMin;
    public double pesoProm ;

    public Equipaje(double pesoBultoMax, double pesoBultoMin, double pesoProm, int pesoBulto, int valorKgBulto, int numBultos) {
        super(pesoBulto, valorKgBulto, numBultos);
        this.numBultos = numBultos;
        this.pesoBultoMax = pesoBultoMax;
        this.pesoBultoMin = pesoBultoMin;
        this.pesoProm = pesoProm;
    }
   

    public Equipaje() {
    }

    public double getCapCargaAvion() {
        return capCargaAvion;
    }

    public void setCapCargaAvion(double capCargaAvion) {
        this.capCargaAvion = capCargaAvion;
    }

    

    public double getPesoBultoMax() {
        return pesoBultoMax;
    }

    public void setPesoBultoMax(double pesoBultoMax) {
        this.pesoBultoMax = pesoBultoMax;
    }

    public double getPesoBultoMin() {
        return pesoBultoMin;
    }

    public void setPesoBultoMin(double pesoBultoMin) {
        this.pesoBultoMin = pesoBultoMin;
    }

    public double getPesoProm() {
        return pesoProm;
    }

    public void setPesoProm(double pesoProm) {
        this.pesoProm = pesoProm;
    }
    
    
    public void calcularProm(){
        pesoProm = pesoBultoMax - pesoBultoMin;
        System.out.println("El promedio de los bultos es: " + pesoProm);
    
    }
    
    public void controlBultos(){
        /*for(int i=1; i<=numBultos; i++){
            String pesoBulto = JOptionPane.showInputDialog("Ingrese el peso del bulto "+i);
            //tengo que pasar a int el pesoBulto
            calcularValorKiloBulto();
            
        }*/
        calcularValorKiloBulto();
        
        
        
        }
    }
