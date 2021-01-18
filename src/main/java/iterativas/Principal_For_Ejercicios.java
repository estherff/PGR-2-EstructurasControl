/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_For_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             

    }
   

    static void ejer1_Factorial() {
        int num = 3;
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("El factorial de " + num + " es " + fact);
    }

    static void ejer2_Sumatorio() {
        int num = 3;
        int sumatorio = 0;
        for (int i = 1; i <= num; i++) {
            sumatorio *= i;
        }
        System.out.println("El sumatorio de " + num + " es " + sumatorio);
    }

    static void ejer3_Divisores() {
        int num = 10;
        System.out.println("Los divisores de " + num + "son:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void ejer5_MediasVarias() {
        int media_negativos = 0, cantidad_ceros = 0;
        for (int i = 1; i >= 10; i++) {
            System.out.println("Introduce el número " + i);
            if (i < 0) {
                media_negativos += 1;
            } else if (i == 0) {
                cantidad_ceros += 1;
            }
        }
    }

    static void ejer5_Primos() {
        int num = 10;
        boolean primo = true;
        //Se optimizará usando while
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
    }

    static void ejer6_Escalera() {
        int tope = 10;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
