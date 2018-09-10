/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sistemas
 */
import java.io.*;
import java.util.ArrayList;
public class Fecha implements Serializable, Persistencia {

    @Override
    public void escribir(Object obj) {
        
        try{
          FileOutputStream file = new FileOutputStream("archivoFechas");
          ObjectOutputStream salida = new ObjectOutputStream(file);
          salida.writeObject((Fecha)obj);
        
        } catch (IOException e ){ System.err.println("Ocurrio un error: " + e.getMessage());}
        

    }

    @Override
    public Object leer() {
        Fecha fec1 = new Fecha();
        
        try{
            
            FileInputStream  file = new FileInputStream("ArchivoFechas");
            ObjectInputStream  entrada  = new ObjectInputStream(file);
            
                    try{
                    
                     fec1 = (Fecha) entrada.readObject();
                    
                     } catch(ClassNotFoundException e){ System.err.println("Surgio un error " + e.getMessage());}
            
        
        } catch(IOException e ){ System.err.println("Surgio un error :" + e.getMessage());}
        
       return (Fecha) fec1;
    }

    @Override
    public ArrayList<Object> mostrarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int dia;
    private int mes ;
    private int año;
    
    public Fecha(){ 
    dia=1;
    mes=1;
    año=2017;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    String mostrarGecha(){
    return dia + " /" + mes +"/ "+ año;
    }
    
    
}
