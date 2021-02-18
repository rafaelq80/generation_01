package projeto01;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Carro {

    private String Modelo, Cor, Chassi;
    private int Vmax, Vatual, NumPortas, NumMarchas, VolCombustivel, Matual;
    private boolean TetoSolar, CambioAutomatico;
    private Proprietario proprietario;
    public Marca marca;

    public Carro(String Modelo, String Cor, String Chassi, int Vmax, int Vatual, int NumPortas, int NumMarchas,
            int VolCombustivel, boolean TetoSolar, boolean CambioAutomatico, int Matual, Proprietario proprietario,
            Marca marca) {

        this.Modelo = Modelo;
        this.Cor = Cor;
        this.Chassi = Chassi;
        this.Vmax = Vmax;
        this.Vatual = Vatual;
        this.NumPortas = NumPortas;
        this.NumMarchas = NumMarchas;
        this.VolCombustivel = VolCombustivel;
        this.TetoSolar = TetoSolar;
        this.CambioAutomatico = CambioAutomatico;
        this.Matual = Matual;
        this.proprietario = proprietario;
        this.marca = marca;

    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return this.Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getChassi() {
        return this.Chassi;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public int getVmax() {
        return this.Vmax;
    }

    public void setVmax(int Vmax) {
        this.Vmax = Vmax;
    }

    public int getVatual() {
        return this.Vatual;
    }

    public void setVatual(int Vatual) {
        this.Vatual = Vatual;
    }

    public int getNumPortas() {
        return this.NumPortas;
    }

    public void setNumPortas(int NumPortas) {
        this.NumPortas = NumPortas;
    }

    public int getNumMarchas() {
        return this.NumMarchas;
    }

    public void setNumMarchas(int NumMarchas) {
        this.NumMarchas = NumMarchas;
    }

    public int getVolCombustivel() {
        return this.VolCombustivel;
    }

    public void setVolCombustivel(int VolCombustivel) {
        this.VolCombustivel = VolCombustivel;
    }

    public boolean isTetoSolar() {
        return this.TetoSolar;
    }

    public boolean getTetoSolar() {
        return this.TetoSolar;
    }

    public void setTetoSolar(boolean TetoSolar) {
        this.TetoSolar = TetoSolar;
    }

    public boolean isCambioAutomatico() {
        return this.CambioAutomatico;
    }

    public boolean getCambioAutomatico() {
        return this.CambioAutomatico;
    }

    public void setCambioAutomatico(boolean CambioAutomatico) {
        this.CambioAutomatico = CambioAutomatico;
    }

    public int Acelera() {

        this.Vatual++;
        return this.Vatual;

    }

    public int Freia() {

        return this.Vatual = 0;

    }

    public int TrocaMarcha() {

        if ((this.Matual >= 0) && (this.Matual < this.NumMarchas)) {

            this.Matual++;
            return this.Matual;

        } else {

            return this.Matual;

        }
    }

    public int ReduzMarcha() {

        if ((this.Matual > 0) && (this.Matual <= this.NumMarchas)) {

            this.Matual--;
            return this.Matual;

        } else {

            return this.Matual;

        }
    }

    public String MarchaRe() {

        String marcha;

        if (this.Vatual == 0) {
            marcha = "Ré";
        } else {

            marcha = "0";
        }

        return marcha;

    }

    public double Autonomia(double cmedio) {

        double autonomia;

        autonomia = this.VolCombustivel * cmedio;

        return autonomia;
    }

    public void Imprime() {

        JTextArea saida = new JTextArea();

        saida.append("Cor: " + Cor);
        saida.append("\n");
        saida.append("Chassi: " + Chassi);
        saida.append("\n");
        saida.append("Velocidade Máxima: " + Vmax);
        saida.append("\n");
        saida.append("Velocidade Atual: " + Vatual);
        saida.append("\n");
        saida.append("Número de Portas: " + NumPortas);
        saida.append("\n");
        saida.append("Número de Marchas: " + NumMarchas);
        saida.append("\n");
        saida.append("Volume do Combustível: " + Vmax);
        saida.append("\n");
        saida.append("Teto Solar?: " + TetoSolar);
        saida.append("\n");
        saida.append("Câmbio Automático? " + CambioAutomatico);
        saida.append("\n");
        saida.append("Marcha Atual: " + Matual);
        saida.append("\n");
        saida.append("Marca: " + marca.getMarca());
        saida.append("\n");
        saida.append("Numero de Modelos: " + marca.getNumModelos());
        saida.append("\n");
        saida.append("Ano: " + marca.getAno());
        saida.append("\n");
        saida.append("Código: " + marca.getId());
        saida.append("\n");
        saida.append("Código: " + proprietario.getNome());
        saida.append("\n");

        JOptionPane.showMessageDialog(null, saida, "Dados do Veículo: ", JOptionPane.PLAIN_MESSAGE);

    }

}
