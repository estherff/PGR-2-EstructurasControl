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
