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
public class Satelite {
     private double meridiano ;
     private double paralelo;   // faltaba ;
     private double distanciaTerra ;

    public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}

public Satelite ( double m, double p , double d ) //; sobra

{

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion () {

System.out.println ("O satelite atopase  no paralelo "+ paralelo + "meridiano " + meridiano +" a unha distancia da terra " + distanciaTerra ); // + mal colocados. faltaba ; 
    
    
    
}
}