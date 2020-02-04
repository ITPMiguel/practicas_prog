/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_miguelramirez_ej09.git;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Prog_MiguelRamirez_Ej09Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecladoint = new Scanner(System.in);
        Scanner tecladodouble = new Scanner(System.in);
        Scanner tecladostring = new Scanner(System.in);
        Alumno alu1 = new Alumno();
        try {
            System.out.println("Nombre del alumno: ");
            String nombre = tecladostring.nextLine();
            alu1.setNombre(nombre);
            System.out.println("-----------");
            alu1.pedirNotas();
            System.out.println("-----------");
            System.out.println("¿Quieres modifocar alguna de las notas?");
            System.out.println("1.- Si");
            System.out.println("2.- No");
            int opcion = tecladoint.nextInt();
            if (opcion == 1) {
                System.out.print("Dame la posicion de la nota: ");
                int pos = tecladoint.nextInt();
                System.out.print("Dame la nueva nota: ");
                double nnota = tecladodouble.nextDouble();
                alu1.modificarNota(pos, nnota);
            }
            System.out.println("-----------");
            alu1.imprimirCalificaciones();
            System.out.println("-----------");
        } catch (MisteriosaException | RangoException e) {
            System.out.println("(Error: " + e.toString() + ")");
        }
    }

}
