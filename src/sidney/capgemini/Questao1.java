package sidney.capgemini;

public class Questao1 {

   public static void main(String[] args){
        escada(5);
   }

   public static void escada(int n) {
       String texto = "";

       for(int i = 0; i < n; i++) {
           texto += " ";
       }

       char[] saida = texto.toCharArray();

       for(int j = n - 1; j >= 0; j--) {
           saida[j] = '*';
           System.out.println(saida);
       }

   }
}
