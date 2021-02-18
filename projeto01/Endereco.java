package projeto01;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Endereco {
    private String Rua, Bairro, Cidade, Estado, Cep, Complemento;

    public Endereco(String Rua, String Bairro, String Cidade, String Estado, String Cep, String Complemento) {

        if ((Rua.isEmpty() == false) || (Bairro.isEmpty() == false) || (Cidade.isEmpty() == false)
                || (Estado.isEmpty() == false) || (Cep.isEmpty() == false)) {

            this.Rua = Rua;
            this.Bairro = Bairro;
            this.Cidade = Cidade;
            this.Estado = Estado;
            this.Cep = Cep;
            this.Complemento = Complemento;

        } else {

            JOptionPane.showMessageDialog(null, "Endereço Inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    public String getRua() {
        return this.Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return this.Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return this.Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCep() {
        return this.Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getComplemento() {
        return this.Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public void Imprime() {

        JTextArea saida = new JTextArea();

        saida.append("Rua: " + Rua);
        saida.append("\n");
        saida.append("Bairro: " + Bairro);
        saida.append("\n");
        saida.append("Cidade: " + Cidade);
        saida.append("\n");
        saida.append("Estado: " + Estado);
        saida.append("\n");
        saida.append("CEP: " + Cep);
        saida.append("\n");
        saida.append("Complemento: " + Complemento);
        saida.append("\n");

        JOptionPane.showMessageDialog(null, saida, "Endereço: ", JOptionPane.PLAIN_MESSAGE);
    }

}
