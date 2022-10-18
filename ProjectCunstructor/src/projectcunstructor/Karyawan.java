/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcunstructor;

/**
 *
 * @author FARIKHATUN
 */
public class Karyawan {
    String id;
    String nama;
    String alamat;
    int gaji;
    
    Karyawan(String a, String b, String c, int d){
        this.id = a;
        this.nama = b;
        this.alamat = c;
        this.gaji = d ;
    }
    
    void showData(){
        System.out.println("ID Karyawan     : " + this.id);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Alamat          : " + this.alamat);
        System.out.println("Gaji            : " + this.gaji);
    }
}
