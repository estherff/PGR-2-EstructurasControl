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
public class Principal_doble {

    /**
     * Alternativa doble: Pregunta por la nota y si es >=5=> aprobado sino ==>
     * suspenso
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del examen: ");
        int nota = sc.nextInt();
        if (nota >= 5) {
            System.out.println("Enorabuena!! Has aprobado");
        } else {
            System.out.println("Lo Siento, has suspendido");
        }
    }
}
