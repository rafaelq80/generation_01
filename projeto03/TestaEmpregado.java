package projeto03;

import javax.swing.JOptionPane;

public class TestaEmpregado {
    public static void main(String args[]) {

        Empregado empregado1 = new Empregado("Junior", "Lacerda", 2000.00);

        Empregado empregado2 = new Empregado("Luiz", "Souza", 4500.00);

        empregado1.setSalario(empregado1.getSalario() + (empregado1.getSalario() * .10));
        empregado2.setSalario(empregado2.getSalario() + (empregado2.getSalario() * .10));

        empregado1.Imprime();
        empregado2.Imprime();

        // Salário Anual

        JOptionPane.showMessageDialog(null, 12 * empregado1.getSalario(),
                "Salário anual do Funcionário: " + empregado1.getNome(), JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, 12 * empregado2.getSalario(),
                "Salário anual do Funcionário: " + empregado2.getNome(), JOptionPane.PLAIN_MESSAGE);

        // Aumento de Salário
        empregado1.setSalario(1.10 * empregado1.getSalario());
        empregado2.setSalario(1.10 * empregado2.getSalario());

        JOptionPane.showMessageDialog(null, "Salário Corrigido (10%)", "Salário", JOptionPane.PLAIN_MESSAGE);

        empregado1.Imprime();
        empregado2.Imprime();

        // Total de Funcionários

        JOptionPane.showMessageDialog(null, "Total de Empregados: " + Empregado.totalempregados, "Empregados",
                JOptionPane.PLAIN_MESSAGE);
    }

}
