/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectscanner;
import java.util.Scanner;
/**
 *
 * @author FARIKHATUN
 */
public class PersegiPanjang {
    Scanner bacaData = new Scanner(System.in);
        
    void hitung(){
    System.out.print("Masukkan nilai panjang : ");
    double panjang = bacaData.nextDouble();
    System.out.print("Masukkan nilai lebar : ");
    double lebar = bacaData.nextDouble();
    double luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang adalah : " + luas);
    double keliling = 2 * (panjang + lebar);
    System.out.println("Keliling Persegi Panjang adalah " + keliling);
    }
}
    
   