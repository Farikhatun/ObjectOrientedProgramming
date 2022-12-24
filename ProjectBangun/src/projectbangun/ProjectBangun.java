/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.Persegi;
import bangundatar.Lingkaran;
import bangundatar.PersegiPanjang;
import bangunruang.Tabung;
import bangunruang.Balok;
import bangunruang.Bola;
/**
 *
 * @author FARIKHATUN
 */
public class ProjectBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 15;
        p1.tampilHasil();
        
        Lingkaran l2 = new Lingkaran();
        l2.jejari = 7;
        l2.tampilHasil();
        
        PersegiPanjang pp3 = new PersegiPanjang();
        pp3.panjang = 10;
        pp3.lebar = 13;
        pp3.tampilHasil();
        
        Tabung t1 = new Tabung();
        t1.jejari = 7;
        t1.tinggi = 10;
        t1.tampilHasil();
        
        Balok b2 = new Balok();
        b2.panjang = 10;
        b2.lebar = 6;
        b2.tinggi = 20;
        b2.tampilHasil();
        
        Bola b3 = new Bola();
        b3.jejari = 10;
        b3.tampilHasil();
    }
    
}
