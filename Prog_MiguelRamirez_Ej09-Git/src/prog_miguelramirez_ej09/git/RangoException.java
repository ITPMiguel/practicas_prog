/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_miguelramirez_ej09.git;

/**
 *
 * @author Miguel
 */
public class RangoException extends Exception {

    /**
     * Constructor con parámetros de la clase
     *
     * @param nota Nota para mostrar en la excepción
     */
    public RangoException(String nota) {
        super(nota);

    }

    /**
     * metodo toString para monstrar la informacion
     *
     * @return devuelve la informacion
     */
    @Override
    public String toString() {
        return "El numero supera los limites. Error: RangoException";
    }

}
