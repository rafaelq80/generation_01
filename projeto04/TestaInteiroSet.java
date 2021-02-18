package projeto04;

import javax.swing.JOptionPane;

public class TestaInteiroSet {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Digite o valor do Set A");
        InteiroSet set1 = inputSet();

        JOptionPane.showMessageDialog(null, "Digite o valor do Set B");
        InteiroSet set2 = inputSet();

        InteiroSet union = set1.union(set2);
        InteiroSet interseccao = set1.interseccao(set2);

        JOptionPane.showMessageDialog(null, "Elementos do Set A:" + set1.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Elementos do Set B:" + set2.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "União do Set A com o Set B:" + union.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Intersecção do Set A com o Set B:" + interseccao.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

        if (set1.ehIgualTo(set2)) {

            JOptionPane.showMessageDialog(null, "Set A é igual ao Set B", "InteiroSet",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "Set A não é igual ao Set B", "InteiroSet",
                    JOptionPane.INFORMATION_MESSAGE);

        }

        set1.insereElemento(77);
        JOptionPane.showMessageDialog(null, "Elemento 77 inserido no Set A", "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Elementos do Set A:" + set1.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

        set1.deleteElemento(77);
        JOptionPane.showMessageDialog(null, "Elemento 77 deletado do Set A", "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Elementos do Set A:" + set1.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

        int[] intArray = { 25, 67, 2, 9, 99, 105, 45, -5, 100, 1 };
        InteiroSet set5 = new InteiroSet(intArray);

        JOptionPane.showMessageDialog(null, "Um novo Set foi criado", "InteiroSet", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Elementos do Set C:" + set5.toString(), "InteiroSet",
                JOptionPane.INFORMATION_MESSAGE);

    }

    private static InteiroSet inputSet() {

        InteiroSet temporario = new InteiroSet();
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (-1 finaliza)"));

        while (numero != -1) {

            temporario.insereElemento(numero);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro (-1 finaliza)"));

        }

        return temporario;

    }

}
