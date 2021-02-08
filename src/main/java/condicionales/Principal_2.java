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
