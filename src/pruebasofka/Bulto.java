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
public class Bulto {
    
    public int pesoBulto;
    public int valorKgBulto;
    public int capCarga = 18000;
    public int capMax = 500;
    public int numBultos;
    Integer[] arrayBultos;

    public Bulto(int pesoBulto, int valorKgBulto, int numBultos) {
        this.pesoBulto = pesoBulto;
        this.valorKgBulto = valorKgBulto;
        this.numBultos = numBultos;
    }
    
    public Bulto() {
        
    }

    public int getPesoBulto() {
        return pesoBulto;
    }

    public void setPesoBulto(int pesoBulto) {
        this.pesoBulto = pesoBulto;
    }

    public int getValorKgBulto() {
        return valorKgBulto;
    }

    public void setValorKgBulto(int valorKgBulto) {
        this.valorKgBulto = valorKgBulto;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getNumBultos() {
        return numBultos;
    }

    public void setNumBultos(int numBultos) {
        this.numBultos = numBultos;
    }
    
    
    
    public void calcularValorKiloBulto(){
        
        String numBulto = JOptionPane.showInputDialog("Ingrese el numero de bultos");
        int numBultos = Integer.parseInt(numBulto);
        System.out.println("Numero total de bultos: "+numBultos);
        
        for(int i=1; i<=numBultos; i++){
            String pesoBulto = JOptionPane.showInputDialog("Ingrese el peso del bulto "+i);
            //tengo que pasar a int el pesoBulto
            int pesoBu = Integer.parseInt(pesoBulto);
            //arrayBultos.add(pesoBu);
            if((pesoBu > capCarga) || (pesoBu > capMax)){
            System.out.println("No puede subir el equipaje, debido a que supera la capacidad de carga máxima");
        }else{
            if(pesoBu >= 0 && pesoBu <= 25){
            valorKgBulto = 0;
            System.out.println("VALOR: $0");
            }else if(pesoBu >= 26 && pesoBu <= 300){
            valorKgBulto = 1500;
            System.out.println("VALOR: $1500");
            }else{
                valorKgBulto = 2500;
                System.out.println("VALOR: $2500");
            }
            }
            
            //PARA CALCULAR EL PROMEDIO NECESITO HACER UN ARREGLO GUARDANDO EL PESO INDICADO CADA
            //QUE SE INGRESA POR PANTALLA Y LUEGO HACER LA SUMA DE ELLOS Y DIVIDIRLO POR numBultos
            
            
            //PARA SABER CUAL ES EL BULTO MÁS PESADO Y MENOS PESADO NECESITO HACER UNA CONDICIÓN COMPARANDO EL ARREGLO
            
            
        } //cierra for valor kilos
    
    }
    
    
    
    
}
