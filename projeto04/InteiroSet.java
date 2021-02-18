package projeto04;

public class InteiroSet {

   private final int SETTAMANHO = 101;
   private boolean[] set;

   public InteiroSet() {

      set = new boolean[SETTAMANHO];

   }

   public InteiroSet(int[] array) {

      set = new boolean[SETTAMANHO];

      for (int i = 0; i < array.length; i++) {

         insereElemento(array[i]);

      }

   }

   public String toString() {

      boolean empty = true;
      String setString = "{";

      for (int contador = 0; contador < SETTAMANHO; contador++) {

         if (set[contador]) {
            setString += contador + " ";
            empty = false;
         }
      }

      if (empty)
         setString += "---";

      setString += "}";

      return setString;

   }

   public InteiroSet union(InteiroSet InteiroSet) {

      InteiroSet temporaria = new InteiroSet();

      for (int contador = 0; contador < 101; contador++) {

         temporaria.set[contador] = (set[contador] || InteiroSet.set[contador]);

      }

      return temporaria;

   }

   public InteiroSet interseccao(InteiroSet InteiroSet) {

      InteiroSet temporaria = new InteiroSet();

      for (int contador = 0; contador < 101; contador++) {

         temporaria.set[contador] = (set[contador] && InteiroSet.set[contador]);

      }

      return temporaria;
   }

   public void insereElemento(int insereInteiro) {

      if (validaEntrada(insereInteiro)) {

         set[insereInteiro] = true;

      }

   }

   public void deleteElemento(int deleteInteiro) {

      if (validaEntrada(deleteInteiro)) {

         set[deleteInteiro] = false;

      }

   }

   public boolean ehIgualTo(InteiroSet InteiroSet) {

      for (int contador = 0; contador < 101; contador++) {

         if (set[contador] != InteiroSet.set[contador]) {

            return false;

         }

      }

      return true;

   }

   public boolean validaEntrada(int entrada) {

      return entrada >= 0 && entrada <= 100;

   }

}