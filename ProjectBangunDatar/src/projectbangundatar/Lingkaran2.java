/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author FARIKHATUN
 */
public class Lingkaran2 {
    public static void main(String[] args) {
        // membuat obyek persegi lingkaran L1
        Lingkaran L1 = new Lingkaran();
        
        // memberi nilai atribut dari Lingkaran L1
        L1.jejari = 6;
        
        // menghitung luas dan keliling dari Lingkaran L1
        L1.hitungLuas();
        L1.hitungKeliling();
        
        // membuat obyek persegi lingkaran L2
        Lingkaran L2 = new Lingkaran();
        
        // memberi nilai atribut dari Lingkaran L2
        L2.jejari = 12;
        
        // menghitung luas dan keliling dari Lingkaran L2
        L2.hitungLuas();
        L2.hitungKeliling();
    }
}
