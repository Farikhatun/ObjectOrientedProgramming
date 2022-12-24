/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancejava;

/**
 *
 * @author FARIKHATUN
 */
public class ClassC extends ClassB{
    int c;
    
    ClassC(int a, int b, int c, int d){
        super(a, b, c);
        this.c = d;
    }
    
    void myMethod2(){
        System.out.println("Annyeong!");
    }
    
}
