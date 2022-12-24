/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import bangundatar.*;
/**
 *
 * @author FARIKHATUN
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.tampilHasil();
        
        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.panjang = 20;
        pp2.lebar = 5;
        pp2.tampilHasil();
        
        Lingkaran l3 = new Lingkaran();
        l3.jejari = 14;
        l3.tampilHasil();
        
        Segitiga s4 = new Segitiga();
        s4.alas = 5;
        s4.tinggi = 12;
        s4.tampilHasil();
    }
    
}
