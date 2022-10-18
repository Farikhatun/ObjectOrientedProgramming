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
public class Persegi {
    Scanner bacaData = new Scanner(System.in);
        
    void hitung(){
    System.out.print("Masukkan nilai sisi : ");
    double sisi = bacaData.nextDouble();
    double luas = sisi * sisi;
    System.out.println("Luas Persegi adalah : " + luas);
    double keliling = 4 * sisi;
    System.out.println("Keliling Persegi adalah " + keliling);
    }
}
