package exerciciosMonitoria;

/**
 *
 * @author Rômulo
 */
public class Conta {

    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;

    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Saldo insuficiente!");
            return 0.0;
        } else {
            saldo -= saque;
            return saldo;
        }
    }

    public double depositar(double deposito) {
        saldo += deposito;
        return saldo;
    }
}
