/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan14_bit;

/**
 *
 * 
 * Nama : Sunandar 
 * KELAS : TI-1C
 * NIM : A2.1900173
 */
public class Latihan14_bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;
        
        System.out.println("a & b = "+c);
         c = a | b;
        
        System.out.println("a | b = "+c);
         c = a ^ b;
        
        System.out.println("a ^ b = "+c);
         c = ~a;
        
        System.out.println("~a = "+c);
         c = a << 2;
        
        System.out.println("a << 2 = "+c);
         c = a >> 2;
        
        System.out.println("a >> 2 = "+c);
    }
}
