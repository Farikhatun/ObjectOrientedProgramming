/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject3;
import java.util.Scanner;
/**
 *
 * @author FARIKHATUN
 */
public class MyProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bacaData = new Scanner(System.in);
        
        System.out.print("Masukkan bil 1: ");
        int bil1 = bacaData.nextInt();
        
        System.out.print("masukkan bil 2: ");
        int bil2 = bacaData.nextInt();
        
        int hasil = bil1 + bil2;
        
        System.out.println("Hasil penjumlahannya : " + hasil);
    }
    
}
