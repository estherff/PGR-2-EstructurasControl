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
