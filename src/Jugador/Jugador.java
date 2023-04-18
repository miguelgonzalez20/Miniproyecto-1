/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author Miguel
 */
public class Jugador {
    
    //ATRIBUTOS
    
    public String nombre;
    
    // METODO CONSTRUCTOR
    public Jugador(){
        nombre = "NONE";
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
