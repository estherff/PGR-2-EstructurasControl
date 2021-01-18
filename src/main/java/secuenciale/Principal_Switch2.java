/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciale;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_Switch2 {

     /**
     * Estructura condicional switch
     * Pregunta por el tipo de coche
     * En función de valor introducido mustra información
     */
    public static void main(String[] args) {
        int dia;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce el tipo de coche");
        dia = miScanner.nextInt();
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia laboral");
                break;
            case 1:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("La semana solo tiene 7 dias");
                break;
        }
    }

}
