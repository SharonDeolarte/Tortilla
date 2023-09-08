/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.negocio;

/**
 * Contiene metodos para trabajar con cadenas de texto.
 * @author Sharon D.
 */
public class Operacion {
    
      /**
         * M. Separa una cadena de texto en donde encuentre el caracter guion medio.
         * @param oracion Es la oracion que sera separada en fracciones.
         * @return Array de String en cuyo cada componente sera una fraccion de la cadena otorgada.
      */

    public String[] separar(String oracion) {

       String[] resultado = oracion.split("-");
         return resultado;


    }

}
