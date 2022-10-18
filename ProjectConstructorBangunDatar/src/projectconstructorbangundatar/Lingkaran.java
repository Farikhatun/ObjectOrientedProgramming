/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconstructorbangundatar;

/**
 *
 * @author FARIKHATUN
 */
public class Lingkaran {
    double jejari;
    double phi = 3.14;
    
    Lingkaran(double r){
        this.jejari = r;
    }
    
    //methods
    void hitungLuas(){
        double Luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas lingkaran adalah " + Luas + " cm²");
    }
    
    void hitungKeliling(){
        double Keliling = 2 * 3.14 * this.jejari;
        System.out.println("Keliling lingkaran adalah " + Keliling + " cm");
    }
}
