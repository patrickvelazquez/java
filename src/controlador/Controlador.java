/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Fecha;
import vista.dlgFecha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



/**
 *
 * @author sistemas
 */
public class Controlador implements ActionListener{
    
    private Fecha modeloFecha;
    private dlgFecha vistaFecha;
    private int a;
    

    public Controlador (Fecha modeloFecha, dlgFecha vistaFecha){
    this.modeloFecha = modeloFecha;
    this.vistaFecha = vistaFecha;
    
    this.vistaFecha.btnGuardar.addActionListener(this);
    this.vistaFecha.btnLeer.addActionListener(this);
    this.vistaFecha.btnLimpiar.addActionListener(this);
    this.vistaFecha.btnCerrar.addActionListener(this);
    this.iniciarVista();
    
    
    
    }
    
    private void iniciarVista(){
    vistaFecha.setTitle("Fechas .....");
    vistaFecha.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            // Mira quien habla 
            
     if(e.getSource()== vistaFecha.btnGuardar){
     
     Fecha tmp = new Fecha();
      tmp.setDia(Integer.parseInt(vistaFecha.txtDia.getText()));
      tmp.setAño(Integer.parseInt(vistaFecha.txtMes.getText()));
      tmp.setAño(Integer.parseInt(vistaFecha.txtAño.getText()));
      tmp.escribir(tmp);
      
      JOptionPane.showMessageDialog(vistaFecha, "Se guardo con exito");
      
      
     
     }       
            
             
     if(e.getSource()== vistaFecha.btnLeer){
     
     Fecha tmp = new Fecha();
      tmp = (Fecha) tmp.leer();
      
      vistaFecha.txtDia.setText(String.valueOf(tmp.getDia()));
      vistaFecha.txtMes.setText(String.valueOf(tmp.getMes()));
      vistaFecha.txtAño.setText(String.valueOf(tmp.getAño()));
       
      
      JOptionPane.showMessageDialog(vistaFecha, "Esta es la Informacion");
      
      
     
     }       
     
            
            
      
    }
    
}
