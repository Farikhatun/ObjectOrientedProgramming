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
public class Tabung extends BangunRuang {
    public double jejari;
    public double tinggi;
     
    public double hitungVolume(){
        double volume = 3.14 * this.jejari * this.jejari * this.tinggi;
        return volume;
    }
    
    public double hitungLP(){
 	double LP = (2 * (3.14 * this.jejari * this.jejari)) + ((3.14 * this.jejari * 2) * this.tinggi);
        return LP;
    }
}
