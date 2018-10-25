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
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo x = new Circulo(50d);
        System.out.println("La circunferencia es = " + x.CalcularLonxitude());
        System.out.println("El area es = " + x.calcularArea());
    }

}
