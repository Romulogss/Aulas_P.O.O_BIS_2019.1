package Inciacao_10_04_19_atualmente;

import java.util.Scanner;

/**
 *
 * @author Rômulo
 */
public class HelloWorld2Plus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Hello World " + nome);
    }
}
