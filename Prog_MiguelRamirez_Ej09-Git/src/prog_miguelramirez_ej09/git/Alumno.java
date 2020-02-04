/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_miguelramirez_ej09.git;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Alumno {

    private String nombre;
    private ArrayList notas;
    private static int n_asignaturas = 5;

    /**
     * constructor por defecto
     */
    public Alumno() {
        nombre = "";
        notas = new ArrayList<Double>(n_asignaturas);
    }

    /**
     * constructor por parametros
     *
     * @param nombre nombre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    /**
     * meotodo get dara devolver el nombre del alumno
     *
     * @return devuelve el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo set para guardar el nombre del alumno
     *
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Pide notas por teclado, tantas como el numero de asignaturas
     *
     * @throws RangoException en caso de que estas no sean entre 0 - 10 salta
     */
    public void pedirNotas() throws RangoException {
        Scanner teclado = new Scanner(System.in);
        try {
            for (int i = 0; i < n_asignaturas; i++) {
                System.out.print("Dame la +" + (i + 1) + " nota del alumno +" + nombre + ":");
                double nota = teclado.nextDouble();
                if (nota < 0 || nota > 10) {
                    throw new RangoException("Nota no valida.");
                }
                notas.add(nota);
            }
        } catch (RangoException e) {
            System.out.println(" (Error: " + e.toString() + ")");
        }
    }

    public void modificarNota(int posicion, double nnota) throws RangoException, MisteriosaException {

        try {
            if (nnota < 0 || nnota > 10) {
                throw new RangoException("Nota no valida.");
            }
            if (posicion > n_asignaturas || posicion < 0) {
                throw new MisteriosaException (0,0);
            }
            notas.add(nnota);
        } catch (RangoException e) {
            System.out.println(" (Error: " + e.toString() + ")");
        }
    }

}
