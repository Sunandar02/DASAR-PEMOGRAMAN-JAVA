/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deklarasis_dan_akses_variabel;

/**
 *
 * 
 * Nama : Sunandar 
 * KELAS : TI-1C
 * NIM : A2.1900173
 */
public class Deklarasis_dan_akses_variabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi variabel
        int nilaiInt;
        final double PHI =3.14; //kontanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel Logika = " + nilaiLogika);
        System.out.println("isi variabel nilaiKarakter = " + nilaiKarakter);
    }
}
