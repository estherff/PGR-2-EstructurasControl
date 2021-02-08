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
import javax.print.attribute.standard.Sides;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_anidados1 {

    /**
     * Estructura if anidada: Pregunta por el nombre, si es Ana pregunta por la
     * edad y le dice si es mayor de edad o no
     */
    public static void main(String[] args) {
        int edad;
        String nombre;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = miScanner.nextLine();
        System.out.println("Introduce tu edad");
        edad = miScanner.nextInt();

        if (nombre.equals("Ana")) {
            System.out.println("Hola Ana");
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Aún no eres mayor de edad");
            }
        }
    }
}
