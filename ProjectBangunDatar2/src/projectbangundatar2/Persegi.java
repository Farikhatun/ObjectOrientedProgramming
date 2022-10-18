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
public class Persegi {
    //atribut
    int sisi;
    
    //methods 
    void hitungLuas(){
        int luas = this.sisi * this.sisi;
        System.out.println("Luas: " + luas + " cm²");
    }
    
    void hitungKeliling(){
        int keliling = 4 * (this.sisi);
        System.out.println("Keliling: " + keliling + " cm");
    }
}
