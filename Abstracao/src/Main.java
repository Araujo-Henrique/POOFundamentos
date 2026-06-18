import java.util.*;

public class Main {
    public static void imprimir(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("Salário base: %.2f Salário com gratificação: %.2f%n",
                    funcionario.salarioBase, funcionario.getSalario());
        }
    }

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Concursado(4000, 5));
        funcionarios.add(new Temporario(2000, 12));
        funcionarios.add(new Concursado(2400, 34));
        funcionarios.add(new Temporario(1200, 10));
        imprimir(funcionarios);
    }
}