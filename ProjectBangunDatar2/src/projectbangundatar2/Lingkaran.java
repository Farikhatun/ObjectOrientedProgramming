/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author FARIKHATUN
 */
public class Lingkaran {
    //atribut
    int jejari;
    double luas, keliling, phi = 3.14;
    
    //methods
    void hitungLuas(){
        double Luas = phi * jejari * jejari;
        System.out.println("Luas: " + Luas + " cm²");
    }
    
    void hitungKeliling(){
        double Keliling = 2 * phi * jejari;
        System.out.println("Keliling: " + Keliling + " cm");
    }
}
