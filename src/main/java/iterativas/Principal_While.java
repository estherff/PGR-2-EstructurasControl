/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while_basico();
    }
    /**Ejemplo básico del funcionamiento del bucle while.
     * Muestra los número enteros del
     * Imprime por pantalla los números del 1 al 10*/
    static void while_basico(){
        int i=0;
        
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
    
}
