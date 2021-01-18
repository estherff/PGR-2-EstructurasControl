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
public class Principal_Switch1 {

    /**
     * Estructura condicional switch
     * Pregunta por el tipo de coche
     * En función de valor introducido mustra información
     */
    public static void main(String[] args) {
        String tipoVehiculo;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce el tipo de coche");
        tipoVehiculo = miScanner.nextLine();
        
        switch (tipoVehiculo) {
            case "coche":
                System.out.println("Puedes pasar de 00:00 a 08:00");
                break;
            case "camion":
                System.out.println("Puedes pasar de 08:00 a 16:00");
                break;
            case "moto":
                System.out.println("Puedes pasar de 16:00 a 24:00");
                break;
            default:
                System.out.println("No se puede pasar con un " + tipoVehiculo);
        }
    }

}
