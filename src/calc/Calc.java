/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;

import com.formdev.flatlaf.FlatDarkLaf;

public class Calc {
    
    
    
        public static void main(String args[]) {
        
        FlatDarkLaf.setup();
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }
}
