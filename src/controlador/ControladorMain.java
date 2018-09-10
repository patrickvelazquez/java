/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import  modelo.Fecha;
import vista.dlgFecha;
import java.awt.AWTError.*;
import javax.swing.*;

/**
 *
 * @author sistemas
 */
public class ControladorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha  hoy = new Fecha ();
        dlgFecha  vista = new dlgFecha(new JFrame(),true);
       Controlador inicio = new Controlador(hoy,vista);
       
    }
    
}
