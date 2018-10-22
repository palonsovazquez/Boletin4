/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class CalculadoraPolboExtra {
    


private static final Float POLBOPAX = 2f/3f; //2 kg de polbo para 3 persoas.
private static final Float PATACAPAX = 1f/3f; // 1 kg de patacas para 3 persoas.
private Float polbo = 0f;
private Float patacas = 0f;
private Float racAct;

    public CalculadoraPolboExtra() {
        this.patacas = 0f;
        this.polbo = 0f;
        
    }
private void actRaciones(){
    float racionesPat= this.patacas * PATACAPAX, x;
    float racionesPolb = this.polbo * POLBOPAX;
    if (racionesPat <= racionesPolb){
        x = racionesPat;}
    else{
    x = racionesPolb;
    }
    this.racAct = x;
}

    public CalculadoraPolboExtra(Float polv,Float pat) {
        this.setPatacas(polv);
        this.setPolbo(pat);
        
        
    }
    public Float amosarPolbo() {
        return polbo;
    }

    public void setPolbo(Float Polbo) {
        this.polbo = Polbo;
        this.actRaciones();
    }

    public Float amosarPatacas() {
        return patacas;
    }

    public void setPatacas(Float Patacas) {
        this.patacas = Patacas;
        this.actRaciones();
    }
    
    public void engadirPolbo(int x){
        this.setPolbo(this.amosarPolbo() + x) ;
        
    
    }
    
    public void engadirPatacas(int x ){
    this.setPatacas(this.amosarPatacas()+ x);
    
    
    }
    
    public Float getRaciones(){
   
    return this.racAct;
    }

}

    

