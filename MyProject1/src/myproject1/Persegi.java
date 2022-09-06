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
public class Persegi {
    
    //atribut sisi dari persegi
    int sisi;
    
    //method untuk menghitung luas persigi
    void hitungLuas(){
        int luas = this.sisi * this.sisi;
        System.out.println("Luasnya: " + luas);
    }
    
    //method untuk menghitung keliling pergegi
    void hitungKeliling(){
        int keliling = this.sisi * 4;
        System.out.println("Keliling: " + keliling);
    }
    
    public static void main(String[] args){
        Persegi p2 = new Persegi();
        p2.sisi = 6;
        p2.hitungLuas();
        p2.hitungKeliling();
        
    }
}