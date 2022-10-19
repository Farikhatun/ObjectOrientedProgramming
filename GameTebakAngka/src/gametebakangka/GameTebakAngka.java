/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;
import java.util.Scanner;
/**
 *
 * @author FARIKHATUN
 */
public class GameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tebakAngka;
        
        RandomNumber RN1 = new RandomNumber();
        int Random = RN1.generate();
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        Scanner jawaban = new Scanner(System.in);
        
        do{
            System.out.print("Masukan tebakan anda: ");
            tebakAngka = jawaban.nextInt();
            
            if(tebakAngka < Random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                
            } else if(tebakAngka > Random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }
        } while (tebakAngka != Random);
    }
    
}
