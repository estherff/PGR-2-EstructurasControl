/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciale;

import java.util.Scanner;
import javax.print.attribute.standard.Sides;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_anidados1 {

    /**
     * Estructura if anidada: Pregunta por el nombre, si es Ana pregunta por la
     * edad y le dice si es mayor de edad o no
     */
    public static void main(String[] args) {
        int edad;
        String nombre;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = miScanner.nextLine();
        System.out.println("Introduce tu edad");
        edad = miScanner.nextInt();

        if (nombre.equals("Ana")) {
            System.out.println("Hola Ana");
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Aún no eres mayor de edad");
            }
        }
    }
}
