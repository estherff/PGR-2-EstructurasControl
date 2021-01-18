/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_2 {

    /**
     * Estructura secuencial:
     * Lee dos números por pantalla y muestra su suma
     */
    public static void main(String[] args) {
        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
       
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
    
}
