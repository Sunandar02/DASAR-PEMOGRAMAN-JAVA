/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * NAMA : Sunandar
 * KELAS: TI-1C
 * NIM  : A2.1900173
 */
public class Latihan6 {
        //variabel jumlahKambing dideklarasikan sebagai statik
        public static int jumlahKambing;
    }
    class KambingStatic{
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = " MIDUN "; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan6.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Latihan6.jumlahKambing);
    }
}
