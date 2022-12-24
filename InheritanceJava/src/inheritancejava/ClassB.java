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
public class ClassB extends ClassA{
    int z;
    
    ClassB(int a, int b, int c){
        super(a, b);
        this.z = c;
    }
}
