package Polaris.Java.core.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    static void main() {
        System.out.println(Locale.getDefault());
        String[] isoCountry = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String Isocountry : isoCountry) {
            System.out.print(Isocountry+" ");
        }
        System.out.println();
        for (String Isolanguages : isoLanguages) {
            System.out.print(Isolanguages+" ");
        }

    }
}
