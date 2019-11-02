/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahkurang;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan hasil 
 * perjumlahan dan pengurangan
 *
 */
public class SelisihBilangan extends Bilangan {
    
    public void tampilSelisih(){
         System.out.println("Selisih Bilangan "+getX()+" - "+getY()+" = "+(getX()-getY()));
    }
}
