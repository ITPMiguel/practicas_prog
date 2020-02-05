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
    public static int n_asignaturas = 5;

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

        for (int i = 0; i < n_asignaturas; i++) {
            System.out.print("Dame la " + (i + 1) + "º nota del alumno " + nombre + ": ");
            double nota = teclado.nextDouble();
            if (nota < 0 || nota > 10) {
                throw new RangoException("Nota no valida.");
            }
            notas.add(nota);
        }

    }

    /**
     * metodo que modifica la nota dandole al posicion y la nueva nota
     *
     * @param posicion la posicion de la nota a cambiar
     * @param nnota la nueva nota a sustituir
     * @throws RangoException salta en caso de sobrpasar las notas validas
     * @throws IndexOutOfBoundsException Salta en caso de introducir una posicion
     * erronea
     */
    public void modificarNota(int posicion, double nnota) throws RangoException, IndexOutOfBoundsException {
        notas.set(posicion, nnota);
    }

    /**
     * imprime los datos de la clase alumno
     */
    public void imprimirCalificaciones() {
        System.out.println("Nombre del Alumno: " + nombre);
        System.out.println("Notas: ");
        for (int i = 0; i < n_asignaturas; i++) {
            System.out.println(notas.get(i));
        }
    }

}
