/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.model;

/**
 *
 * @author Eliulson
 */
public class ComprobarDato {
    
    public boolean sinData(String dato){
        return dato == null || dato.isEmpty();
    }
    
    
}
