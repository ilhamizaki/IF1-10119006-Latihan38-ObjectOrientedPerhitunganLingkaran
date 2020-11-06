/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class main HitungLingkaran
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        HitungLingkaran value = new HitungLingkaran();
        
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan Nilai diameter lingkaran : ");
        value.diameter = scanner.nextDouble();
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        value.jarijari = value.hitungJarijari();
        
        System.out.println();
        System.out.println("=======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + (int)value.hitungJarijari() + " cm");
        System.out.println("Luas Lingkaran = " + (df.format(value.hitungLuas())) + " cm");
        System.out.println("Keliling Lingkaran = " + (df.format(value.hitungKeliling()))+ " cm");
    }
}
