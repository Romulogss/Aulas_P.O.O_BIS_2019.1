package exerciciosMonitoria;

import java.util.Scanner;

/**
 *
 * @author Rômulo
 */
public class MainConta {

    public static void main(String[] args) {
        double saque, deposito, saldo;
        Conta conta1 = new Conta("Rômulo Gabriel Sousa Sá", 1000);
        Scanner ler = new Scanner(System.in);
        System.out.println(conta1.getNome());
        //saque
        System.out.print("Informe uma quantia para o saque: ");
        saque = ler.nextDouble();
        saldo = conta1.sacar(saque);
        System.out.println("Você sacou " + saque);
        System.out.println("Seu novo saldo é: " + saldo);
        //deposito
        System.out.print("Informe uma quantia para depositar: ");
        deposito = ler.nextDouble();
        saldo = conta1.depositar(deposito);
        System.out.println("Você depositou " + deposito);
        System.out.println("Seu novo saldo é: " + saldo);
    }
}
