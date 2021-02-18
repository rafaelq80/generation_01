package projeto01;

import javax.swing.JOptionPane;

public class TestaCarro {

        public static void main(String[] args) {

                Endereco endereco1 = new Endereco("Rua das Rosas 123", "Vila das Flores", "Roseira", "SP", "05214-000",
                                "-");
                endereco1.Imprime();

                Proprietario proprietario1 = new Proprietario("João da Silva", "789456321-11", "87965123-4",
                                "09/09/1985", endereco1);
                proprietario1.Imprime();

                Marca marca1 = new Marca("Nissan", 6, 2014, 1);
                marca1.Imprime();

                Carro carro1 = new Carro("March", "Preto", "9BWHE21JX24060831", 180, 0, 4, 5, 45, true, true, 0,
                                proprietario1, marca1);
                carro1.Imprime();

                // Testa Acelera
                for (int i = 1; i <= 5; i++) {

                        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + carro1.Acelera(), "ACELERA",
                                        JOptionPane.INFORMATION_MESSAGE);

                }

                // Testa Freia
                JOptionPane.showMessageDialog(null, "Velocidade Atual: " + carro1.Freia(), "FREIA",
                                JOptionPane.INFORMATION_MESSAGE);

                // Testa Marcha

                for (int i = 0; i <= 5; i++) {

                        JOptionPane.showMessageDialog(null, "Marcha Atual: " + carro1.TrocaMarcha(), "TROCA MARCHA +",
                                        JOptionPane.INFORMATION_MESSAGE);

                }

                JOptionPane.showMessageDialog(null, "Marcha Atual: " + carro1.ReduzMarcha(), "TROCA MARCHA -",
                                JOptionPane.INFORMATION_MESSAGE);

                // Testa Marcha Ré

                carro1.Acelera();
                JOptionPane.showMessageDialog(null, "Marcha Atual: " + carro1.MarchaRe(), "TROCA MARCHA RÉ",
                                JOptionPane.INFORMATION_MESSAGE);

                carro1.Freia();
                JOptionPane.showMessageDialog(null, "Marcha Atual: " + carro1.MarchaRe(), "TROCA MARCHA RÉ",
                                JOptionPane.INFORMATION_MESSAGE);

                // Testa Autonomia
                JOptionPane.showMessageDialog(null, "Autonomia: " + carro1.Autonomia(7.5) + " Km", "Autonomia",
                                JOptionPane.INFORMATION_MESSAGE);

                // Testa Volume do Combustível

                JOptionPane.showMessageDialog(null, "Volume do Combustível: " + carro1.getVolCombustivel() + " L",
                                "Combustível", JOptionPane.INFORMATION_MESSAGE);
        }
}
