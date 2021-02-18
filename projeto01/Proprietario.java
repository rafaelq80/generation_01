package projeto01;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Proprietario {

    private String Nome, CPF, RG, DTNasc;
    public Endereco end;

    public Proprietario(String Nome, String CPF, String RG, String DTNasc, Endereco end) {

        if (Nome.isEmpty() == false) {
            this.Nome = Nome;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um Nome válido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        if (CPF.isEmpty() == false) {
            this.CPF = CPF;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um CPF válido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        if (RG.isEmpty() == false) {
            this.RG = RG;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um RG válido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        this.DTNasc = DTNasc;
        this.end = end;

    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return this.RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDTNasc() {
        return this.DTNasc;
    }

    public void setDTNasc(String DTNasc) {
        this.DTNasc = DTNasc;
    }

    public void Imprime() {

        JTextArea saida = new JTextArea();

        saida.append("Proprietário: " + Nome);
        saida.append("\n");
        saida.append("CPF do Proprietário: " + CPF);
        saida.append("\n");
        saida.append("RG do Proprietário: " + RG);
        saida.append("\n");
        saida.append("Data de Nascimento do Proprietário: " + DTNasc);
        saida.append("\n");
        saida.append("Rua: " + end.getRua());
        saida.append("\n");
        saida.append("Bairro: " + end.getBairro());
        saida.append("\n");
        saida.append("Cidade: " + end.getCidade());
        saida.append("\n");
        saida.append("Estado: " + end.getEstado());
        saida.append("\n");
        saida.append("CEP: " + end.getCep());
        saida.append("\n");
        saida.append("Complemento: " + end.getComplemento());
        saida.append("\n");
        JOptionPane.showMessageDialog(null, saida, "Dados do Proprietário: ", JOptionPane.PLAIN_MESSAGE);

    }

}