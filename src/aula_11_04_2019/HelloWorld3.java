package aula_11_04_2019;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Rômulo
 */
public class HelloWorld3 {

    public static void main(String[] args) { //assinatura própria
        SimpleDateFormat formato = new SimpleDateFormat();
        System.out.println("Olá mundo, " + formato.format(new Date()));

    }
}
