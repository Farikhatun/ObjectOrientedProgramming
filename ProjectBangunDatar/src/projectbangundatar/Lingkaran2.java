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
        // membuat obyek persegi lingkaran A
        Lingkaran A = new Lingkaran();
        
        // memberi nilai atribut dari Lingkaran A
        A.jejari = 6;
        
        // menghitung luas dan keliling dari Lingkaran A
        A.hitungLuas();
        A.hitungKeliling();
        
        // membuat obyek persegi lingkaran B
        Lingkaran B = new Lingkaran();
        
        // memberi nilai atribut dari Lingkaran B
        B.jejari = 12;
        
        // menghitung luas dan keliling dari Lingkaran B
        B.hitungLuas();
        B.hitungKeliling();
    }
}
