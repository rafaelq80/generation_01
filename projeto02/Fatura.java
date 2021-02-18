package projeto02;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Fatura {

    private String numero, descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;

        if (quantidade > 0) {
            this.quantidade = quantidade;
        }

        if (preco > 0.0) {
            this.preco = preco;
        }
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {

            this.quantidade = 0;

        }

    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    public double getTotalFatura() {
        return getQuantidade() * getPreco();
    }

    public void Imprime() {

        JTextArea saida = new JTextArea();

        saida.append("Código: " + numero);
        saida.append("\n");
        saida.append("Descrição: " + descricao);
        saida.append("\n");
        saida.append("Quantidade: " + quantidade);
        saida.append("\n");
        saida.append("Preço Unitário: " + preco);
        saida.append("\n");
        saida.append("Preço Total: " + this.getTotalFatura());
        saida.append("\n");

        JOptionPane.showMessageDialog(null, saida, "Fatura: ", JOptionPane.PLAIN_MESSAGE);

    }

}
