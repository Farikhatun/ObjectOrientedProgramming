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
public class PersegiPanjang {
    //atribut
    double panjang;
    double lebar;
    
    //constructor
    PersegiPanjang(double x, double y){
        this.panjang = x;
        this.lebar = y;
    }
    
    //method
    void hitungLuas(){
        double luas = this.panjang * this.lebar;
        System.out.println("Luas pesegi panjang adalah " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 2 *(this.panjang + this.lebar);
        System.out.println("Keliling persegi panjang " + keliling);
    }
}
