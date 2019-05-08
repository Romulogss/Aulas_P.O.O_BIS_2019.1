package exerciciosMonitoria;

import java.util.Scanner;

/**
 *
 * @author Rômulo
 */
public class FrasePalavraLetra {

    public static boolean isVoagal(char letra) {
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int palavras = 0, letras = 0, vogais = 0, concoantes = 0;

        System.out.print("Informe uma frase: ");
        frase = scanner.nextLine();

        for (int i = 0; frase.length() > i; i++) {
            char letraAtual = frase.charAt(i);
            if (Character.isAlphabetic(letraAtual)) {
                letras++;
            } else if (letraAtual == ' ') {
                palavras++;
            }
            if (isVoagal(letraAtual)) {
                vogais++;
            }
        }
        concoantes = letras - vogais;
        System.out.println("A frase: \"" + frase + "\", tem:");
        System.out.println(letras + " letras.");
        System.out.println((palavras + 1) + " palavras.");
        System.out.println(concoantes + "conçoantes.");
        System.out.println(vogais + "vogais.");
    }
}
