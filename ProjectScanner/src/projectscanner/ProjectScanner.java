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
public class ProjectScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bacaData = new Scanner(System.in);
        Persegi A = new Persegi();
        A.hitung();
        System.out.println();
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.hitung();
        System.out.println();
        Lingkaran Lo = new Lingkaran();
        Lo.hitung();
    }
    
}
