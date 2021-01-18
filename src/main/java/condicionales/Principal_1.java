/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_1 {

    /**
     * Muestra la hora y la fecha actual
     */
    public static void main(String[] args) {
        Date miDate = new Date();
        SimpleDateFormat miDateFormat1=new SimpleDateFormat ("dd-MM-yyyy");
        SimpleDateFormat miDateFormat2=new SimpleDateFormat ("kk:mm:ss");

        System.out.println("La fecha actual es "+miDateFormat1.format(miDate));
        System.out.println ("La hora actual es "+miDateFormat2.format(miDate));
    }

}
