/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author FARIKHATUN
 */
public class Rerata {
    int n;
    int[] data = new int[10];
        
    void input(){
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> bil = new ArrayList<>();
        
        System.out.print("Masukkan n: ");
        bil.add(input.nextInt());
        
        for(int i=0; i<bil.size(); i++){
            System.out.print("Masukkan data: ");
            this.data[i] = input.nextInt();
        }
    }
        
    double hitungRerata(){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += this.data[i];
        }
        
        double rerata = sum / this.n;
        return rerata;
    }        

    void output(){
        System.out.println("Reratanya adalah: " + this.hitungRerata());
    }
}
