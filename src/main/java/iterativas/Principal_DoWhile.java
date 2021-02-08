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
package iterativas;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_DoWhile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dowhile_basico();
    }
    
    /**Ejemplo básico del funcionamiento del bucle do while.
     * Muestra los número enteros del
     * Imprime por pantalla los números del 1 al 10*/
    static void dowhile_basico(){
        int i=0;
        
        do{
            System.out.println(i);
            i++;
        }while (i<=10);               
    }
    
}
