/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan11;

/**
 *
 *  
 * Nama : Sunandar 
 * KELAS : TI-1C
 * NIM : A2.1900173
 */
public class Latihan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3456764;
        int iMinus = -i;
        System.out.println("d : " + i);
        System.out.printf("%%d : %d%n",i);
        System.out.printf("%%10d : %10d%n",i);
        System.out.printf("%%+10d : %+10d%n",i);
        System.out.printf("%%+10d : %+10d%n",iMinus);
        System.out.printf("%%,10d : %,10d%n",i);
        System.out.printf("%%-10d : %-10d%n",i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n",f);
        System.out.printf("%%.2f : %.2f%n",f);
        System.out.printf("%%12.2f : %12.2f%n",f);
        System.out.printf("%%,12.2f : %12.2f%n",f);
    }
}
