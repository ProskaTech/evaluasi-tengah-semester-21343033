//Created by 21343033_Nicholas RYan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import javax.swing.JOptionPane;

//Buat program untuk menguji aoakah sebuah bilangan yang dimasukkan bersifat negatif atau positif menggunakan JOptionPane

/**
 *
 * @author User
 */
public class UTS3 {
    public static void main(String[] args) {
        String a = "", msg = "";
        int nilai;
        
        a = JOptionPane.showInputDialog("Masukkan nilai : ");
        nilai = Integer.parseInt(a);
        
        if(nilai < 0) {
           msg = "Bilangan " + nilai + " adalah Bilangan NEGATIF";
        }
        else if(nilai > 0){
           msg = "Bilangan " + nilai + " adalah Bilangan POSITIF";
        }
        else {
            msg = "Bilangan " + nilai + " adalah Bilangan NOL";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Bilangan " + nilai + "adalah " + msg);
        
        
    }
}
