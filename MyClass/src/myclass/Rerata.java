/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;
import java.util.Scanner;
/**
 *
 * @author FARIKHATUN
 */
public class Rerata {
    double rerata;
    double sum = 0;
    double n = 0;
    
    void input(){
        Scanner data = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan bilangan bulat : ");
            int bil = data.nextInt();
            sum += bil;
            n++;
            System.out.print("Entri lagi (y/n)? ");
            char ans = data.next().charAt(0);
            if (ans == 'n'){
                break;
            }
        }
    }
    
    void hitung(){
        this.rerata = this.sum/this.n;
        System.out.println("Reratanya adalah : " + this.rerata);
    }
}
