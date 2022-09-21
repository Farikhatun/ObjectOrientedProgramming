/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject2;

/**
 *
 * @author FARIKHATUN
 */
public class MyMainClass {
    public static void main(String[] args){
        MyClass m = new MyClass();
        int x = m.myMethod1(m.myMethod1(6, 8), m.myMethod1(6, 8));
        System.out.println(x);
    }
}
