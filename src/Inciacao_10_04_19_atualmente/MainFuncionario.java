package Inciacao_10_04_19_atualmente;

/**
 *
 * @author Rômulo
 */
public class MainFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setMatricula(1502);
        f1.setNome("Rômulo");
        f1.setSalarioBase(1000);
        System.out.println(f1.getSalario());
        
        Funcionario f2 = new Funcionario();
        f2.setMatricula(1502);
        f2.setNome("Gabriel");
        f2.setSalarioBase(2000);
        System.out.println(f2.getSalario());

        Funcionario.imposto = 10.0;
        
        System.out.println("Após o reajusto do imposto");
        System.out.println(f1.getSalario());
        System.out.println(f2.getSalario());
    }

}
