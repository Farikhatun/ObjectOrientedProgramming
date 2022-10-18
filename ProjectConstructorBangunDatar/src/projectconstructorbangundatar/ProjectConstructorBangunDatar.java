/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconstructorbangundatar;

/**
 *
 * @author FARIKHATUN
 */
public class ProjectConstructorBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi A = new Persegi(8);
        A.hitungLuas();
        A.hitungKeliling();
        System.out.println();
        
        PersegiPanjang B = new PersegiPanjang(3.6, 8);
        B.hitungLuas();
        B.hitungKeliling();
        System.out.println();
        
        Lingkaran C = new Lingkaran(14);
        C.hitungLuas();
        C.hitungKeliling();
        System.out.println();
    }
    
}
