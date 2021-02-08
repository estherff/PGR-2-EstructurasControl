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

import javax.swing.JOptionPane;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_anidados2 {

    /**
     * Estructuras de control condicionales dobles
     * Uso de cuadrodros de diálogo de la librería swing
     * Cálcula la nota media de 3 notas dadas e informa al usuario
     */
    public static void main(String[] args) {
        int notaMatematicas;
        int notaHistoria;
        int notaInformatica;
        double media;

        //Uso de cuadros de diálogo de swing
        notaMatematicas = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota de Matematicas (1..10)"));
        notaHistoria = Integer.parseInt(JOptionPane.showInputDialog("Itroduce tu nota de Historia (1..10)"));
        notaInformatica = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota de Informática (1..10)"));

        // Cálculo de la nota media
        media = (notaMatematicas + notaHistoria + notaInformatica) / 3;

        //Control de la nota media y uso de ventanas de swing
        if (media >= 5) {
            JOptionPane.showMessageDialog(null, "Enhorabuena! Tu media es " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Necesitas mejorar! Tu media es " + media);
        }
    }

}
