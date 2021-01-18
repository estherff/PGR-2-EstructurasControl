/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciale;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_encadenados {

    /**
     * Estructura de control: else if
     * Muestra la clasificación de la nota
     * en función de la nota numérica
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Nota(0 - 10): ");
        double nota = in.nextDouble();
        
        if (nota == 10) {
            System.out.println("Matricula de Honor");
        } else if ((nota >= 9) && (nota < 10)) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}

