package Polaris.Java.core.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyFormatTest01 {
    static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        Locale localePT = new Locale("pt","BR");
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;
        Locale localeus = Locale.US;

        nfa[0] = NumberFormat.getCurrencyInstance(localeus);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 100_000_234.10;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valor_string = "￥100,000,234";

        try {
            System.out.println(nfa[3].parse(valor_string));
        } catch (ParseException e) {
            System.out.println("ih fudeu " + e.getMessage());
        }

    }
}
