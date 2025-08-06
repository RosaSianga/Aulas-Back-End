import java.util.Scanner;

public class MainExerciciosRepeticoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int senha;

//  ****************** While **************************

//  Fundamentais
//
//  1 - Repetir Mensagem**
//      Pergunte uma senha para o usuário, enquanto ele não acertar a senha `123`
//      pergunte novamente.

//        System.out.println("Favor digitar a senha:");
//        senha = sc.nextInt();
//
//
        while (senha != 123) {
            System.out.println("Senha inválida. Digite novamente:");
            senha = sc.nextInt();
        }

        if (senha == 123){
            System.out.println("Senha validada");
        }


//  2 - Contador Crescente**
//      Crie um programa que use um laço while para imprimir os números de 1 a 10 no console.

        numero = 1;

        while (numero <= 10){
            System.out.println("Número: " + numero);

            numero = numero + 1;
        }


// ********************** Do-While **********************
//
//  Fundamentais
//
//  1 - Repetição de Processo**
//      Escreva um programa que imprime a mensagem "Executando o processo..." e, em seguida, pergunta
//      ao usuário se ele deseja executar o processo novamente. Se o usuário digitar 's' (ou 'S'), o processo
//      se repete. Caso contrário, o programa é encerrado. O do-while é ideal aqui, pois o processo sempre
//      executa pelo menos uma vez.
//
        String novamente = "";

        System.out.println("Executando o processo");

        do {
            System.out.println("Deseja executar novamente ?");
            novamente = sc.nextLine();
        } while (novamente.equals("S") || novamente.equals("s"));


//  2 - Somador de Números**
//      Faça um programa que peça ao usuário para inserir números inteiros. O programa deve somar todos os
//      números inseridos. O laço deve parar quando o usuário inserir o número 0. No final, mostre a soma
//      total dos números inseridos.
//
        int resultado = 0;

        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            resultado = resultado + numero;
            System.out.println("Resultado: " + resultado);
        } while (numero != 0);

    }
}
