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
public class Coche {
    private int velocidade;

    public Coche() {
    this.velocidade = 0;
    
    }

    public int getVelocidade() {
        return velocidade;
    }
    
    public void acelerar(int valor){
    this.velocidade+= valor;
    
    }
    
    public void frenar (int valor){
    this.velocidade-= valor;
    
    }
    
    
}
