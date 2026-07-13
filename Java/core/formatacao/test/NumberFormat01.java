package Polaris.Java.core.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat01 {
     public static void main(String[] args) {
         NumberFormat[] nfa = new NumberFormat[4];
         Locale localePT = new Locale("pt","BR");
         Locale localeIT = Locale.ITALY;
         Locale localeJP = Locale.JAPAN;

         nfa[0] = NumberFormat.getInstance();
         nfa[1] = NumberFormat.getInstance(localeJP);
         nfa[2] = NumberFormat.getInstance(localePT);
         nfa[3] = NumberFormat.getInstance(localeIT);

         String balor = "1234";
         NumberFormat formatador = NumberFormat.getInstance(localePT);
         try {
             System.out.println(formatador.parse(balor));
         } catch (ParseException e) {
             throw new RuntimeException(e);
         }

         double valor = 1000.2341;

for (NumberFormat numberFormat : nfa){
    numberFormat.setMaximumFractionDigits(2);
    System.out.println(numberFormat.format(valor));
}
    String valor_string = "1000.12355";

         try {
             System.out.println(nfa[0].parse(valor_string));
         } catch (ParseException e) {
             throw new RuntimeException(e);
         }

     }
}
