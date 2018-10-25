/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche car = new Coche();
        car.acelerar(20);
        System.out.println("velocidad = " + car.getVelocidade());
        car.frenar(10);
        System.out.println("velocidad = " + car.getVelocidade());

    }

}
