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
public class Principal_simple {

    /**
     * Indica si estás en el primer tramo de IRPF
     * que está libre de IRPF
     */
    public static void main(String[] args) {
        Scanner miScanner=new Scanner(System.in);
        double ingresos;
        System.out.println("Introduce tus ingresos anuales");
        ingresos=miScanner.nextDouble();
        if (ingresos <12450){
            System.out.println("No tienes que pagar IRPF");
        }
    }
    
}
