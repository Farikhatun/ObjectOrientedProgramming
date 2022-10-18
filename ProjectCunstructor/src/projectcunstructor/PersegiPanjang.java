/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcunstructor;

/**
 *
 * @author FARIKHATUN
 */
public class PersegiPanjang {
    //atribut
    int panjang;
    int lebar;
    
    //constructor
    PersegiPanjang(int x, int y){
        this.panjang = x;
        this.lebar = y;
    }
    
    //method
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luas Pesegi Panjang adalah " + luas);
    }
    
    void hitungKeliling(){
        int keliling = 2 *(this.panjang + this.lebar);
        System.out.println("Keliling persegi Panjang " + keliling);
    }
}
