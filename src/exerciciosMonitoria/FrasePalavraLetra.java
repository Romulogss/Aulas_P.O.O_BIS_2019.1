package exerciciosMonitoria;

import java.util.Scanner;

/**
 *
 * @author Rômulo
 */
public class FrasePalavraLetra {
    public static boolean letraEspecial(char letra){
        if(letra == 'á' && letra == 'à' && letra == 'ã' && letra == 'â'){
            return true;
        } else if(letra == 'ó' && letra == 'ô' && letra == 'õ'){
            return true;
        } else if (letra == 'é' && letra == 'ê') {
            
        } else {
        }
        return false;
    }
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String frase;
    int palavras = 0, letras = 0, vogais = 0, concoantes = 0;

    System.out.print("Informe uma frase: ");
    frase = scanner.nextLine();

    for(int i = 0; frase.length() > i; i++){
      char letraAtual = frase.charAt(i);
      if(Character.isAlphabetic(letraAtual)){
        letras ++;
      } else if(letraAtual == ' '){
        palavras++;
      }
    }

    System.out.println(letras);
    System.out.println(palavras+1);
  }
}
