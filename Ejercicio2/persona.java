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
public class persona implements puedeCantar {
    
    public persona(){
    }

    @Override
    public String cantar() {
        
        for (int i = 0; i < 1; i++) {
            return "DO-RE-MI-FA-SOL-LA-SI";
        }
        return "DO-RE-MI-FA-SOL-LA-SI";
    }
    
}
