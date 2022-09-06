/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject1;

/**
 *
 * @author FARIKHATUN
 */
public class Lingkaran {
    //atribut diameter lingkaran
    int jari;
    
    //method untuk menghitung luas lingkaran
    void hitungLuas(){
        int luas = this.jari * this.jari * 22/7;
        System.out.println("Luasnya: " + luas);
    }
    
    //method untuk menghitung keliling lingkaran
    void hitungKeliling(){
        int keliling = this.jari * 2 * 22/7;
        System.out.println("Keliling: " + keliling);
    }
    
    public static void main(String[] args){
        Lingkaran p1 = new Lingkaran();
        p1.jari = 10;
        p1.hitungLuas();
        p1.hitungKeliling();
        
    }
}
