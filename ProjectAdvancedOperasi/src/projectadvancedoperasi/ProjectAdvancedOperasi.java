/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author FARIKHATUN
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Operasi O = new Operasi();
        
        //Kegiatan 2 - penjumlahan
        int A = O.jumlahkan(3, 4);
        System.out.println("a.  3 + 4 = " + A);
        
        int B = O.jumlahkan(4, 7, -9);
        System.out.println("b.  4 + 7 + (-9) = " + B);
        
        double C = O.jumlahkan(3.4, -0.002, 0.12313);
        System.out.println("c.  3.4 + (-0.002) + 0.12313 = " + C);
        
        System.out.println();
        
        //Project 1 - Perkalian
        int AA = O.kalikan(3, 4);
        System.out.println("a.  3 * 4 = " + AA);
        
        int BB = O.kalikan(4, 7, -9);
        System.out.println("b.  4 * 7 * (-9) = " + BB);
        
        double CC = O.kalikan(3.4, -0.002, 0.12313);
        System.out.println("c.  3.4 * (-0.002) * 0.12313 = " + CC);
    }
    
}
