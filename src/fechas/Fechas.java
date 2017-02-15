/*
Programa Java que obtiene la fecha y hora actual del sistema y la muestra por pantalla.
El programa mostrará año, mes, día, hora, minutos y segundos.
 */
package fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author carlosjoseanguiano
 */
public class Fechas {

    public static void main(String[] args) {
        int año;
        int mes;
        int dia;
        int hora;
        int minuto;
        int segundo;

        Calendar calendar = new GregorianCalendar();

        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH);
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        hora = calendar.get(Calendar.HOUR_OF_DAY);
        minuto = calendar.get(Calendar.MINUTE);
        segundo = calendar.get(Calendar.SECOND);

        System.out.println("Fecha Actual :" + dia + "/" + mes + "/" + año);
        System.out.printf("Hora Actual : %02d:%02d:%02d %n", hora, minuto, segundo);

    }

}
