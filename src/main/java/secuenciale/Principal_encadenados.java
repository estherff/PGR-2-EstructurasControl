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
public class Principal_encadenados {

    /**
     * Estructura de control: else if
     * Muestra la clasificación de la nota
     * en función de la nota numérica
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Nota(0 - 10): ");
        double nota = in.nextDouble();
        
        if (nota == 10) {
            System.out.println("Matricula de Honor");
        } else if ((nota >= 9) && (nota < 10)) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}

