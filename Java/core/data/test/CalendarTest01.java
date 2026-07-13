package Polaris.Java.core.data.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main() {
        Calendar c = Calendar.getInstance();
        //System.out.println(c);
        Date data = c.getTime();
        System.out.println(data);
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("primeiro dia da semana aqui é domingo");
        } else {
            System.out.println("não é o primeiro dia");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH ));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        Calendar cal = c;
        cal.roll(Calendar.HOUR, 23);// vai adicionar essa quantidade de dias ao calendario se passar ele começa de novo
        System.out.println(c.getTime());

        c.add(Calendar.HOUR, 24); // vai adicionar essa quantidade.
        System.out.println(c.getTime());




    }
}
