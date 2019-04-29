package aula_25_04_2019;

import java.util.Scanner;

/**
 *
 * @author Rômulo
 */
public class MainMatematica {
    public static void main(String[] args) {
        double valor, valor2;
        int operacao;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um valor: ");
        valor = scanner.nextDouble();
        
        System.out.print("Informe outro valor: ");
        valor2 = scanner.nextDouble();
        
        System.out.println("Qual operação deseja fazer com " + valor + " e " + valor2);
        System.out.println("1 - somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        operacao = scanner.nextInt();
        switch (operacao) {
            case 1:
                Matematica.somar(valor, valor2);
                break;
            case 2:
                Matematica.subtrair(valor, valor2);
                break;
            case 3:
                Matematica.multiplicar(valor, valor2);
                break;
            case 4:
                Matematica.multiplicar(valor, valor2);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
