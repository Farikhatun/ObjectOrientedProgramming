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
public class PersegiPanjang {
    //atribut sisi dari persegi panjang
    int panjang;
    int lebar;
    int luas;
    int keliling;
    
    //method untuk menghitung luas persegi panjang
    int hitungLuas(){
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
    
    //method untuk menghitung keliling persegi panjang
    int hitungKeliling(){
        this.keliling = (this.panjang + this.lebar) * 2;
        return this.keliling;
    }
    
    public static void main(String[] args){
        PersegiPanjang A = new PersegiPanjang();
        A.panjang = 12;
        A.lebar = 8;
                
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 4;
        C.lebar = 3;
        
    }
}
