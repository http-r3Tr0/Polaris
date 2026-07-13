package Polaris.Java.core.exception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
    static void main() {
        try {
        throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do Multicatch");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceExeception();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
         }

    }
    private static void talvezLanceExeception() throws SQLException, FileNotFoundException {

    }
}
