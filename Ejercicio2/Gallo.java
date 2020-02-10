/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9.Ejercicio2;

/**
 *
 * @author SEBAS
 */
public class Gallo implements puedeCantar {
    
    public Gallo(){
    }

    @Override
    public String cantar() {
        
        for (int i = 0; i < 1; i++) {
            return "Ki ki ri ki";
        }
        return "Ki ki ri ki";
    }
    
}
