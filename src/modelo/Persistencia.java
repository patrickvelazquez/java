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
import java.util.ArrayList;
public interface Persistencia {
    public void escribir(Object obj);
    public Object leer();
    public ArrayList<Object> mostrarTodos();
    
    
}
