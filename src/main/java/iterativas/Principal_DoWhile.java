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
