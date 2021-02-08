/*
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
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
