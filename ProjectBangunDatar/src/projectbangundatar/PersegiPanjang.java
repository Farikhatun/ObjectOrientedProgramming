/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author FARIKHATUN
 */
public class PersegiPanjang {
    //atribut
    int panjang;
    int lebar;
    
    //methods 
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luas: " + luas + " cm²");
    }
    
    void hitungKeliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Keliling: " + keliling + " cm");
    }
}
