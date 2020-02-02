/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_miguelramirez_ej09.git;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Alumno {

    private String nombre;
    private ArrayList notas;
    private static int n_asignaturas = 5;

    public Alumno() {
        nombre = "";
        notas = new ArrayList<Double>(n_asignaturas);
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
