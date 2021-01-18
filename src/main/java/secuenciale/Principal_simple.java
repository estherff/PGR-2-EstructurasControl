/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
