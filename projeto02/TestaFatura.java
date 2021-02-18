package projeto02;

public class TestaFatura {

    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("1", "Notebook", 10, 2000.00);

        fatura1.Imprime();

        fatura1.setNumero("2");
        fatura1.setDescricao("Impressora");
        fatura1.setQuantidade(5);
        fatura1.setPreco(800.00);

        fatura1.Imprime();

    }
}
