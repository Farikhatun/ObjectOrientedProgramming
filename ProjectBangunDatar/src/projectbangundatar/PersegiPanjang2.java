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
public class PersegiPanjang2 {
    public static void main(String[] args) {
        // membuat obyek persegi panjang A
        PersegiPanjang C = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari C
        C.panjang = 17;
        C.lebar = 8;
        
        // menghitung luas dan keliling dari C
        C.hitungLuas();
        C.hitungKeliling();
        
        // membuat obyek persegi panjang B
        PersegiPanjang D = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari D
        D.panjang = 26;
        D.lebar = 14;
        
        // menghitung luas dan keliling dari D
        D.hitungLuas();
        D.hitungKeliling();
    }
}
