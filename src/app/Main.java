/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import gui.MPTD;
import gui.ProgramacionLineal;
import gui.MetodTransporte;
import gui.Planeaciondeact;
import gui.Teoriadeinventarios;
import gui.LineasdeEspera;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {
    
    public JFrame mainASYS;
    public JFrame introduction;
    public JFrame fourierSeries;
    public JFrame fourierTransform;
    public JFrame discreteSystem;
    public JFrame tema;
    
    public Main() {
        mainASYS = new MPTD(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);
        
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainASYS.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
