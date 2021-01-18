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
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio7();
    }

    static void ejercicio7() {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Elige el número de la operación: ");
        System.out.println("1: Ingresar ");
        System.out.println("2: Retirar ");
        System.out.println("3: Salir ");

        byte opcion = miScanner.nextByte();
        double cantidad, saldoActual, saldoInicial = 400;
        switch (opcion) {
            case 1:
                System.out.println("Introduzca la cantidad que desea ingresar en cuenta: ");
                cantidad = miScanner.nextDouble();
                saldoActual = saldoInicial + cantidad;
                System.out.println("El saldo Actual es: " + saldoActual);
                break;
            case 2:
                System.out.print("Digite la cantidad que desea retirar: ");
                cantidad = miScanner.nextDouble();
                if (cantidad <= saldoInicial) {
                    saldoActual = saldoInicial - cantidad;
                    System.out.println("El saldo actual es: " + saldoActual);
                } else {
                    System.out.println("No cuenta con el saldo suficiente");
                }
                break;
            case 3:
                break;
        }
    }

}
