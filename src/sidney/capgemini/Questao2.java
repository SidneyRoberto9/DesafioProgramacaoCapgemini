package sidney.capgemini;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva Sua Senha: ");
        String texto = teclado.nextLine();
        System.out.print("\n");
        validarSenha(texto);

        teclado.close();
    }

    public static String validarTamanho(String senha){
        int tam = senha.length();

        if(tam < 6){
            return "Sua senha possui apenas "+tam+" Caracteres, Por favor" +
                    " adicione mais "+(6 - tam)+" Caracteres para atender ao requisito minimo.";
        }
        return "Sua senha é Segura!!";
    }

    public static void validarSenha(String senha) {
        System.out.println(validarTamanho(senha));
        //Fiz dessa forma para poder adicionar mais validações futuramente
    }
}


