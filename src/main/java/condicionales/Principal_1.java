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
