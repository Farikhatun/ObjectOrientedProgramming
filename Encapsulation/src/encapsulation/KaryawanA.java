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
public class KaryawanA {
    String nik;
    String nama;
    protected int masaKerja;
    private int gapok = 3000000;
    protected int tunjangan;
    private int totalGaji;
    
    void setMasaKerja(int mk){
        if (mk > 0){
            this.masaKerja = mk;
        }else {
            System.out.println("Masa kerja invalid");
            System.exit(0);
        }
    }
    
    protected void hitungTunjangan(){
        if(this.masaKerja < 10){
            this.tunjangan = 2000000;
        } else {
            this.tunjangan = 3000000;
        }
    }
    
    private void hitungTotalGaji(){
        this.totalGaji = this.tunjangan + this.gapok;
    }
    
    void printStrukGaji(){
        this.hitungTunjangan();
        this.hitungTotalGaji();
        System.out.println("NIK                 : " + this.nik);
        System.out.println("Nama                : " + this.nama);
        System.out.println("Masa Kerja          : " + this.masaKerja);
        System.out.println("-----------------------------------------");
        System.out.println("Gaji Pokok          : " + this.gapok);
        System.out.println("Tunjangan           : " + this.tunjangan);
        System.out.println("-----------------------------------------");
        System.out.println("Total Gaji          : " + this.totalGaji);
        System.out.println();
    }
}
