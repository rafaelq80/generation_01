package projeto01;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Marca {

    private String Marca;
    private int NumModelos, Ano, Id;

    public Marca(String Marca, int NumModelos, int Ano, int Id) {
        this.Marca = Marca;
        this.NumModelos = NumModelos;
        this.Ano = Ano;
        this.Id = Id;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getNumModelos() {
        return this.NumModelos;
    }

    public void setNumModelos(int NumModelos) {
        this.NumModelos = NumModelos;
    }

    public int getAno() {
        return this.Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void Imprime() {

        JTextArea saida = new JTextArea();

        saida.append("Marca: " + Marca);
        saida.append("\n");
        saida.append("Numero de Modelos: " + NumModelos);
        saida.append("\n");
        saida.append("Ano: " + Ano);
        saida.append("\n");
        saida.append("Código: " + Id);
        saida.append("\n");

        JOptionPane.showMessageDialog(null, saida, "Marca: ", JOptionPane.PLAIN_MESSAGE);
    }
}
