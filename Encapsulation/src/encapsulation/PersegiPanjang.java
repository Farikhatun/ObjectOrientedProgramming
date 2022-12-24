/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author FARIKHATUN
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    private int luas;
    private int keliling;
    
    void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        }else {
            System.out.println("Nilai panjang tidak valid");
            System.exit(0);
        }
    }
    
    void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        }else {
            System.out.println("Nilai lebar tidak valid");
            System.exit(0);
        }
    }
    
    int getPanjang(){
        return this.panjang;
    }
    
    int getLebar(){
        return this.lebar;
    }
    
    int hitungLuas(){
        return this.luas = this.panjang * this.lebar;
    }
    
    int hitungKeliling(){
        return this.keliling = 2 * (this.panjang + this.lebar);
    }
    
}
