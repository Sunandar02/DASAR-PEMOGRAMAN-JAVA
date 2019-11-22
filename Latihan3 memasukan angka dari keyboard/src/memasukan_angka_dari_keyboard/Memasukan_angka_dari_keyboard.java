/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memasukan_angka_dari_keyboard;

import java.util.Scanner;

/**
 *
 *
 * Nama : Sunandar 
 * KELAS : TI-1C
 * NIM : A2.1900173
 */
public class Memasukan_angka_dari_keyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda adalah "+ nama);
    }
}
