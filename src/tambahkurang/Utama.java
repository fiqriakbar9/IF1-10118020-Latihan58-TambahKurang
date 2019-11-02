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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      JumlahBilangan jb = new JumlahBilangan();
      jb.tampilHasilJumlah();
      
      SelisihBilangan sb = new SelisihBilangan();
      sb.tampilSelisih();
      
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
      
      
    }
    
}
