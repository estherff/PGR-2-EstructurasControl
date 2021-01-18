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
public class Principal_doble {

    /**
     * Alternativa doble: Pregunta por la nota y si es >=5=> aprobado sino ==>
     * suspenso
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del examen: ");
        int nota = sc.nextInt();
        if (nota >= 5) {
            System.out.println("Enorabuena!! Has aprobado");
        } else {
            System.out.println("Lo Siento, has suspendido");
        }
    }
}
