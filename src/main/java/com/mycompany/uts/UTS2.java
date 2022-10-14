//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;

/**
 *Masukkan jumlah baris
 *5
 * # # # # #
 *  # # # #
 *   # # #
 *    # #
 *     #
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
*/

/**
 *
 * @author User
 */
public class UTS2 {
    public static void main(String[] args){
        int i, j, k;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int jlh = in.nextInt();
        
        for (i = jlh; i >= 1; i--) {
            for (j = jlh; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * i); k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (i = 1; i <= jlh; i++) {
            for (j = jlh; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
