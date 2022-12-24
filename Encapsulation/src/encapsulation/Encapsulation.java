/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author FARIKHATUN
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    PersegiPanjang pp1 = new PersegiPanjang();
    //    pp1.setPanjang(50);
    //    pp1.setLebar(20);
    //    System.out.println("Luas persegi panjang yang p= " + pp1.getPanjang() + " l= " + pp1.getLebar() + " adalah " + pp1.hitungLuas());
    //    System.out.println("Keliling persegi panjang yang p= " + pp1.getPanjang() + " l= " + pp1.getLebar() + " adalah " + pp1.hitungKeliling());
        
        KaryawanA k1 = new KaryawanA();
        k1.nik = "K0001";
        k1.nama = "Joyi";
        k1.setMasaKerja(4);
        k1.printStrukGaji();
        
        KaryawanB k2 = new KaryawanB();
        k2.nik = "K0002";
        k2.nama = "Joya";
        k2.setMasaKerja(11);
        k2.printStrukGaji();

    }
    
}
