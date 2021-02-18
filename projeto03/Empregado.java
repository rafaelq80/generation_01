package projeto03;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Empregado {

    public static int totalempregados = 0;
    private String nome, sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        totalempregados++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
        }
    }

    public int getTotalEmpregados() {
        return totalempregados;
    }

    public void Imprime() {

        JTextArea saida = new JTextArea();

        saida.append("Nome: " + nome);
        saida.append("\n");
        saida.append("Sobrenome: " + sobrenome);
        saida.append("\n");
        saida.append("Salário: " + salario);
        saida.append("\n");

        JOptionPane.showMessageDialog(null, saida, "Dados do Funcionário: ", JOptionPane.PLAIN_MESSAGE);

    }
}
