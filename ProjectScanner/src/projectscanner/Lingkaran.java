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
public class Lingkaran {
    Scanner bacaData = new Scanner(System.in);
        
    void hitung(){
    System.out.print("Masukkan nilai jejari : ");
    double jejari = bacaData.nextDouble();
    double luas = 3.14 * (jejari * jejari);
    System.out.println("Luas Lingkaran adalah : " + luas);
    double keliling = 2 * 3.14 * jejari;
    System.out.println("Keliling Lingkaran adalah " + keliling);
    }
}
