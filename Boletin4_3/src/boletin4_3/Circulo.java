/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Circulo {
    private Double radio;
    private final Double Pi = Math.PI;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public Double calcularArea(){
        
     Double area ; 
     area = this.Pi*Math.pow(this.getRadio(), 2);
     return area;
    
    }
    
    public Double CalcularLonxitude(){
        Double lonxitude;
        lonxitude = 2*this.Pi*this.radio;
        
        
    
    return lonxitude;
    
    }
}
