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
    public char vocal;
    public String palabraMostrar;
    // METODO CONSTRUCTOR
    public Categoria(){
        
        animales = "NONE";
        colores = "NONE";
        frutas = "NONE";
        vocal = ' ';
        palabraMostrar = "NONE";
        
        Arreglo = new String[10];
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
    
    public String quitarVocal(String palabra){ //QUITA LA VOCAL Y LO REEMPLAZA POR UN " "
        
        StringBuilder resultado = new StringBuilder();
        
        String palabra1 = palabra;
        String palabraSinVocal;
        int contador = 0;
        for( int j = 0; j < palabra1.length(); j++ ){
            
            char caracter = palabra1.charAt(j);
            
            if (('a' == palabra1.charAt(j) | 'e' == palabra1.charAt(j) | 
                'i' == palabra1.charAt(j) | 'o' == palabra1.charAt(j) | 
                'u' == palabra1.charAt(j)) & contador == 0){
                
                resultado.append(' ');
                contador++;
               
            } else {
                resultado.append(caracter);
            }
        }
        this.palabraMostrar = resultado.toString();
        return resultado.toString();
    }
    
    public char getVocal(String palabra){
        String palabra2 = palabra;
        char vocal;
        //int contador = 0;
        for( int j = 0; j < palabra2.length(); j++ ){
            
            if ('a' == palabra2.charAt(j) | 'e' == palabra2.charAt(j) | 
                'i' == palabra2.charAt(j) | 'o' == palabra2.charAt(j) | 
                'u' == palabra2.charAt(j) ){
                
                vocal = palabra2.charAt(j);
                this.vocal = vocal;
                return vocal;
            }
        }
        return 0;
        
    }
    
}
