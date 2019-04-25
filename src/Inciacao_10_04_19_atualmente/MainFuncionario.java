package Inciacao_10_04_19_atualmente;

/**
 *
 * @author Rômulo
 */
public class MainFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setSalarioBase(1000);
        System.out.println(f1.getSalario());
        Funcionario f2 = new Funcionario();
        System.out.println(f2.getMatricula());
        f1.setImposto(10);
        System.out.println(f1.getSalario());
        System.out.println(f2.getMatricula());
        
    }

}
