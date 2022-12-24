/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import myinterfaces.*;
/**
 *
 * @author FARIKHATUN
 */
public class Persegi extends BangunDatar implements Simetri, Keliling{
    public double sisi;

    @Override
    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Persegi");
        System.out.println("---------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
        System.out.println("");
    }

    @Override
    public double hitungSimPutar() {
        return 4.0;
    }

    @Override
    public double hitungSimLipat() {
        return 4.0;
    }

    @Override
    public double hitungKeliling() {
        return 4 * this.sisi;
    }
    
}
