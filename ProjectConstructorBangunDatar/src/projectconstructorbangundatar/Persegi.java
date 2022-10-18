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
public class Persegi {
    //atribut
    int sisi;
    
    //constructor
    Persegi(int a){
        this.sisi = a;
    }
    
    //method
    void hitungLuas(){
        int luas = this.sisi * this.sisi;
        System.out.println("Luas pesegi adalah " + luas);
    }
    
    void hitungKeliling(){
        int keliling = 4 * this.sisi;
        System.out.println("Keliling persegi " + keliling);
    }
}
