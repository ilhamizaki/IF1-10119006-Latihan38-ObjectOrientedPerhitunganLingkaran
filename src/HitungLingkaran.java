/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class menghitung lingkaran
 */
public class HitungLingkaran {
    public double diameter;
    public double jarijari;
    public double luas;
    public double keliling;
    
    public double hitungJarijari() {
        return diameter / 2;
    }
    
    public double hitungLuas() {
        return Math.PI * Math.pow(jarijari, 2);
    }
    
    public double hitungKeliling() {
        return 2 * Math.PI * jarijari; 
    }

}
