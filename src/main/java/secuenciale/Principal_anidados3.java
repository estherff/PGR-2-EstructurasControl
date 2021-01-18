/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciale;

import java.util.Random;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_anidados3 {

    /**
     * Estructura de contro: if anidados
     * Genera un nº que representa la temperatura
     * Muestra un mensaje según el rango del nº
     */
    public static void main(String[] args) {
        int temp;
        String mensaje;
        //Crear una objeto aleatorio
        Random elRandom = new Random();
        //Genera un nº entre 0 y 50
        temp = elRandom.nextInt(50);
 
        if(temp<10){
            mensaje = "Hace mucho frío.";
        }
        else{
            if(temp<15){
                mensaje = "Hace poco frío.";
            }
            else{
                if(temp<25){
                    mensaje = "Hace una temperatura agradable.";
                }
                else{
                    if(temp<30){
                        mensaje = "Hace poco calor.";
                    }
                    else{
                        mensaje = "Hace mucho calor.";
                    }
                }
            }
        }
        System.out.printf("La temperatura actual es de %d grados.", temp);
        System.out.println("\n" + mensaje);
    }
    
}
