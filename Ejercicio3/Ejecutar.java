package taller9.Ejercicio3;

import java.util.ArrayList;

public class Ejecutar implements I_ArraySimple{


    public Ejecutar(){
    }

    @Override
    public boolean estaVacio(String[] s) {
        if(s.equals("")){
        return true;
        } 
        return false;
    }

    @Override
    public void extraer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadir() {
        
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
