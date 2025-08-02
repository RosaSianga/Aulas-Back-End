import java.util.Scanner;

public class MainExercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int numero;
        double nota;

//  **Exercícios Fundamentais**

//  1. Verificador de Maioridade**
//     Crie um programa que declare uma variável **`idade`**.
//     Use uma estrutura **`if/else`** para verificar se a idade é **maior ou igual a 18**.
//     O programa deve imprimir "*Você é maior de idade*" se a condição for verdadeira, e "*Você é menor de idade*" caso contrário

//        System.out.println("Exercicio 1 - Fundamental");
//        System.out.println("Digite sua idade:");
//        idade = sc.nextInt();
//
//        if (idade >= 18){
//            System.out.println("Você é de maior");
//        } else {
//            System.out.println("Você é menor de idade");
//        }


//  2. Verificador de Número (Positivo, Negativo ou Zero)**
//     Crie um programa que declare uma variável **`numero`**;
//     Utilize uma estrutura **`if/else if/else`** para verificar e imprimir uma das seguintes mensagens:
//     "*O número é positivo.*", "*O número é negativo.*" ou "*O número é zero.*".

//        System.out.println("Exercicio 2 - Fundamental");
//        System.out.println("Digite um número:");
//        numero = sc.nextInt();
//
//        if (numero == 0){
//            System.out.println("Número é Zero");
//        } else if (numero > 0) {
//            System.out.println("Número é positivo");
//        } else {
//            System.out.println("Número é negativo");
//        }

//  3. Classificação de Aluno**
//     Crie um programa que use a classe **`Scanner`** para pedir ao usuário que digite a nota de um aluno (um valor **`double`**).
//     Em seguida, use uma estrutura **`if/else`** simples para imprimir "Aprovado" se a nota for maior ou igual a 7.0, e
//     "Reprovado" caso contrário

//        System.out.println("Exercicio 3 - Fundamental");
//        System.out.println("Digite uma nota:");
//        nota = sc.nextDouble();
//
//        if (nota >= 7.0){
//            System.out.println("Aprovado");
//        } else {
//            System.out.println("Reprovado");
//        }


//  **Exercícios Intermediários**
//
//  4. Status de Tarefa**
//     Declare uma variável **`boolean tarefaConcluida`**.
//     Usando uma estrutura **`if/else`**, exiba a mensagem "A tarefa está pendente!" se a variável for **`false`**, e
//     "A tarefa foi finalizada com sucesso!" se for **`true`**.

//        Boolean tarefaConcluida = true;
//
//        if (tarefaConcluida = true){
//            System.out.println("A tarefa foi finalizada com sucesso");
//        } else {
//            System.out.println("A tarefa está pendente");
//        }

//  5. Permissão para Entrar na Festa**
//     Um evento permite a entrada de pessoas com 18 anos ou mais. No entanto, pessoas com 16 ou 17 anos também podem
//     entrar se estiverem acompanhadas por um responsável.
//     Crie um programa que declare duas variáveis: **`idade`**; e **`boolean acompanhado`**;. Use uma estrutura **`if`**
//     com operadores lógicos (**`||`** e **`&&`**) para imprimir "Entrada permitida." ou "Entrada negada." com base nessas condições.

        Boolean acompanhado;
        String acompanhante;

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Você está com acompanhante ? S ou N");
        acompanhante = sc.nextLine();


        if (acompanhante.equals("S") || acompanhante.equals("s")){
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        if (idade >= 18){
            System.out.println("Entrada Permitida");
        } else if ((idade == 16 || idade == 17) && acompanhado == true) {
            System.out.println("Entrada Permitida");
        } else {
            System.out.println("Entrada negada");
        }
//
//  6. Aprovação de Empréstimo**
//     Para aprovar um empréstimo, um banco exige que o cliente tenha um salário mensal de pelo menos R$ 2.000,00 e não
//     possua restrições de crédito.
//     Crie um programa com as variáveis **`double salarioMensal`**; e **`boolean possuiRestricao`** . Use o operador lógico
//     "E" (**`&&`**) em uma estrutura **`if`** para determinar e imprimir "Empréstimo aprovado." ou "Empréstimo negado."


//  7. Classificação de Média Escolar Completa**
//     Crie um programa que solicita ao usuário que digite uma nota (um valor **`double`**).
//     Utilizando uma estrutura **`if/ else if /else`**, classifique a nota da seguinte forma:
//         - Se a nota for 7.0 ou maior, imprima "Aprovado!".
//         - Se a nota for maior ou igual a 5.0, mas menor que 7.0, imprima "Recuperação.".
//         - Se a nota for menor que 5.0, imprima "Reprovado.".


    }
}

