package sidney.capgemini;

import java.util.*;

public class Questao3 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a Palavra: ");
        String texto = teclado.nextLine();
        int contador = subString(texto);

        System.out.println("Quant Anagramas Pares: "+ contador );
        teclado.close();
    }


    public static int subString(String texto){
        HashMap<String, Integer> map= new HashMap<>();
        int contador = 0, n = 0;

        for(int i = 0; i < texto.length(); i++){
            for(int j = i; j < texto.length(); j++){

                char[] textoCaracter = texto.substring(i, j+1).toCharArray();
                Arrays.sort(textoCaracter);

                String caracter = new String(textoCaracter);

                if (map.containsKey(caracter)){
                    map.put(caracter, map.get(caracter)+1);
                } else {
                    map.put(caracter, 1);
                }

            }
        }

        for(String key: map.keySet()){
             n = map.get(key);
            contador += (n * (n-1))/2;
        }

        return contador;
    }
}


