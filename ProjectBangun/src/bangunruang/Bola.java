/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author FARIKHATUN
 */
public class Bola extends BangunRuang {
    public double jejari;
     
    public double hitungVolume(){
        double volume = 4./3 * 3.14 * this.jejari * this.jejari * this.jejari;
        return volume;
    }
    
    public double hitungLP(){
 	double LP = 4 * 3.14 * this.jejari * this.jejari;
        return LP;
    }
}
