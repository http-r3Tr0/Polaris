package Polaris.Java.core.data.test;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    static void main() {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());//representa o nano segundo do segundo valor maximo é 999.999.999
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1000000000));
        System.out.println(Instant.ofEpochSecond(3,-1000000000));
        System.out.println(Instant.ofEpochSecond(3));
        //comentario
    }
}
