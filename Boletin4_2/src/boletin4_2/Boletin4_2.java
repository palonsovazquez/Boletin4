/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Satelite sat  = new Satelite(20000d,5000d,4555d);
       
       sat.verPosicion();
    }
    
}
