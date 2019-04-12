package Inciacao_10_04_19_atualmente;

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
