package Polaris.Java.core.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main() {


        Locale localeItaly = new Locale("it", "IT");
        Locale localech = new Locale("it", "CH");
        Locale localIndia = new Locale("hi","IN");
        Locale localJapao = new Locale("ja","JP");
        Locale hlocalHolanda = new Locale("nl","NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localech);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, hlocalHolanda);

        System.out.println("italia "+df1.format(calendar.getTime()));
        System.out.println("suiça "+df2.format(calendar.getTime()));
        System.out.println("india "+df3.format(calendar.getTime()));
        System.out.println("japao "+df4.format(calendar.getTime()));
        System.out.println("holanda "+df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localJapao));
        System.out.println(localech.getDisplayCountry());

    }
}
