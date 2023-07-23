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
public class CalcularIntere {
    
    public int intereSimple(double capital, double intere, double anio){
        return (int) (capital * (intere/100) * anio);
    }
    
}
