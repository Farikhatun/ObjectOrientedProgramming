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
public class Segitiga {
    //atribut
    int tinggi;
    int alas;
    
    //methods 
    void hitungLuas(){
        int luas = (this.alas * this.tinggi)/2;
        System.out.println("Luas: " + luas + " cm²");
    }
    
}
