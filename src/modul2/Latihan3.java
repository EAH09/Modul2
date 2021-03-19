/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author erisa
 */
public class Latihan3 {
    public static void main(String[] args) {
        String nama, kelas;
        Double p, l, luas;
        
        nama = "Errisa Aura Hidayah";
        kelas = "X RPL 1";
        p = 15.0;
        l = 5.0;
        luas = p*l;
        
        
        System.out.println("nama: "+nama);
        System.out.println("kelas: "+kelas);
        System.out.print("luas persegi: "+ luas + " m ");
        
        if (luas > 60 ) {
            System.out.println("bisa digunakan untuk sepakbola");
        }
        
              
    }
}
