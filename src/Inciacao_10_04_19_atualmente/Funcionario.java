package Inciacao_10_04_19_atualmente;

public class Funcionario {

    private int matricula;
    private String nome;
    private double salarioBase;
    private static double imposto = 27.0;
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getSalario(){
        return salarioBase - salarioBase*(imposto/100);
    }

}
