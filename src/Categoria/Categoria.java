/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

/**
 *
 * @author Miguel
 */
public class Categoria {
    
    String animales;
    String colores;
    String frutas;
    String[] Arreglo;
    String vocal;
    // METODO CONSTRUCTOR
    public Categoria(){
        
        animales = "NONE";
        colores = "NONE";
        frutas = "NONE";
        vocal = "NONE";
        String[] Arreglo = new String[10];
    }
    
    public void setArregloAnimales(){
        Arreglo[0] = "oso";
        Arreglo[1] = "tigre";
        Arreglo[2] = "pez";
        Arreglo[3] = "gato";
        Arreglo[4] = "raton";
        Arreglo[5] = "ballena";
        Arreglo[6] = "caracol";
        Arreglo[7] = "panda";
        Arreglo[8] = "caballo";
        Arreglo[9] = "oveja";
        
    }
    
    public void setArregloColores(){
        Arreglo[0] = "azul";
        Arreglo[1] = "verde";
        Arreglo[2] = "cafe";
        Arreglo[3] = "rojo";
        Arreglo[4] = "amarillo";
        Arreglo[5] = "morado";
        Arreglo[6] = "blanco";
        Arreglo[7] = "gris";
        Arreglo[8] = "naranja";
        Arreglo[9] = "negro";
        
    }
    
    public void setArregloFrutas(){
        Arreglo[0] = "manzana";
        Arreglo[1] = "fresa";
        Arreglo[2] = "papaya";
        Arreglo[3] = "mango";
        Arreglo[4] = "sandia";
        Arreglo[5] = "uvas";
        Arreglo[6] = "pera";
        Arreglo[7] = "kiwi";
        Arreglo[8] = "mandarina";
        Arreglo[9] = "limon";
        
    }
    
    public String getArreglo(int indice){
        return Arreglo[indice];
    }
    
    public String quitarVocal(String palabra){
        String palabra1 = palabra;
        String palabraSinVocal;
        String vocal;
        int contador = 0;
        for( int j = 0; j < palabra1.length(); j++ ){
            
            if ( contador == 0 & palabra1[ j ] == "a" | palabra1[ j ] == "e" | 
                 palabra1[ j ] == "i" | palabra1[ j ] == "o" | 
                 palabra1[ j ] == "u" | ){
                
                vocal = palabra1[j];
                palabra1[j] = " ";
                contador++;
            }
        }
        palabraSinVocal = palabra1;
        this.vocal = vocal;
        return palabraSinVocal;
    }
    
}
