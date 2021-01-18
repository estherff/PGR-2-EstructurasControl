/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for_basico();
        //mostrarPares();
        mostrarTablaMultiplicar();
    }

    /**
     * Ejemplo básico del funcionamiento del bucle forMuestra los número enteros
     * del Imprime por pantalla los números del 1 al 10
     */
    static void for_basico() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * Estructura for: Muestra los nº pares entre 0 y un nº léido por teclado
     */
    static void mostrarPares() {
        int num_maximo;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce el nº máximo de "
                + "valores pares a mostrar");
        num_maximo = miScanner.nextInt();
        for (int i = 0; i <= num_maximo; i++) {
            System.out.println(i);
        }
    }

    /**
     * Ejemplos de bucles for infinitos
     */
    static void bucleInfinito() {
        //for valores de inicio, ni condición ni incremento
//        for( ; ; )
//        {
//            System.out.println("Este es un ciclo infinito");
//        }
//        
//        //for con condición de salida que nunca se cumple
//        for (int i=0; i<0; i++){
//            System.out.println("Nunca se cumple la condición");
//        }
    }

    /**
     * for anidados: Muestra la tabla de multiplicar de los números del 1 al 9
     */
    static void mostrarTablaMultiplicar() {
        for (int i = 1; i <= 9; i++) {
            //Para cada valor de i, se genera valores j de 1 a 9
            for (int j = 1; i <= 9; i++) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
        }
    }

    /*Muestra valores entre un´nº mayor y menor 
    Introducidos por pantalla*/
    static void mostrar_rango() {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce el numero mayor");
        int mayor = miScanner.nextInt();

        System.out.println("Introduce el numero menor");
        int menor = miScanner.nextInt();

        if (menor > mayor) {
            System.out.println("Datos incorrectos");

        } else {

            //Voy decrementando desde el numero grande al pequeno
            for (int i = mayor; i >= menor; i--) {
                System.out.println("Estoy en el bucle");
                System.out.println(i);
            }
        }

        miScanner.close();

    }
}
