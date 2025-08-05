import java.util.Scanner;

public class MainExercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int numero;
        double nota;
        String senha;

//  *********************  Exercícios Fundamentais ****************************

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


//  ***************** Exercícios Intermediários *******************************
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

//        Boolean acompanhado;
//        String acompanhante = "N";
//
//        System.out.println("Digite sua idade:");
//        idade = sc.nextInt();
//        sc.nextLine();
//
//        if (idade == 16 || idade ==17) {
//            System.out.println("Você está com acompanhante ? S ou N");
//            acompanhante = sc.nextLine();
//        }
//
//        if (acompanhante.equals("S") || acompanhante.equals("s")){
//            acompanhado = true;
//        }else {
//            acompanhado = false;
//        }
//
//        if (idade >= 18){
//            System.out.println("Entrada Permitida");
//        } else if ((idade == 16 || idade == 17) && acompanhado == true) {
//            System.out.println("Entrada Permitida");
//        } else {
//            System.out.println("Entrada negada");
//        }
//
//  6. Aprovação de Empréstimo**
//     Para aprovar um empréstimo, um banco exige que o cliente tenha um salário mensal de pelo menos R$ 2.000,00 e não
//     possua restrições de crédito.
//     Crie um programa com as variáveis **`double salarioMensal`**; e **`boolean possuiRestricao`** . Use o operador lógico
//     "E" (**`&&`**) em uma estrutura **`if`** para determinar e imprimir "Empréstimo aprovado." ou "Empréstimo negado."

//        double salarioMensal;
//        boolean possuiRestricao = false;
//
//        System.out.println("Digite sua Renda Mensal:");
//        salarioMensal = sc.nextDouble();
//
//        if (salarioMensal >= 2000 && possuiRestricao == false) {
//            System.out.println("Empréstimo Aprovado");
//        } else {
//            System.out.println("Empréstimo Negado");
//        }


//  7. Classificação de Média Escolar Completa**
//     Crie um programa que solicita ao usuário que digite uma nota (um valor **`double`**).
//     Utilizando uma estrutura **`if/ else if /else`**, classifique a nota da seguinte forma:
//         - Se a nota for 7.0 ou maior, imprima "Aprovado!".
//         - Se a nota for maior ou igual a 5.0, mas menor que 7.0, imprima "Recuperação.".
//         - Se a nota for menor que 5.0, imprima "Reprovado.".

//        System.out.println("Digite sua nota:");
//        nota = sc.nextDouble();
//
//        if (nota >= 7.0) {
//            System.out.println("Aprovado");
//        } else if (nota >= 5.0 && nota < 7.0) {
//            System.out.println("Recuperação");
//        } else {
//            System.out.println("Reprovado");
//        }

//  *************** Exercícios Avançados *******************
//
//  8. Par ou Ímpar com Operador Ternário**
//     Declare uma variável **`numero`**; Utilizando o operador ternário (**`? :`**), crie uma variável String resultado que receba
//     o texto "Par" se o número for par, ou "Ímpar" se for ímpar. Ao final, imprima o resultado.
//     **Dica:** O operador de módulo **`%`** (resto da divisão), apresentado no material, é perfeito para isso.


//  9. Cálculo de Desconto Progressivo**
//     Uma loja oferece descontos baseados no valor da compra. Crie um programa que declare uma variável
//     `double valorCompra = 150.0;` e aplique as seguintes regras usando `if/else if/else`:
//     - Compras acima de R$ 200,00 têm 20% de desconto.
//     - Compras entre R$ 100,00 (inclusive) e R$ 200,00 (exclusive) têm 10% de desconto.
//     - Compras abaixo de R$ 100,00 não têm desconto.
//     O programa deve usar os operadores aritméticos para calcular e exibir o valor final a ser pago.
//

//  10. O Erro da Comparação de Textos**
//      Analise o código abaixo. Sem executá-lo, qual será a saída impressa no console? Explique por que o resultado ocorre e,
//      em seguida, corrija o código para que ele compare o conteúdo dos textos corretamente.
//      ```java
//      String senha1 = new String("admin123");
//      String senha2 = new String("admin123");
//      System.out.println("As senhas são iguais? " + (senha1 == senha2));
//      **Dica:** O material alerta que o operador **`==`** compara a referência de memória dos objetos, não o seu conteúdo textual.
//
//  11. Cálculo de Média Exata**
//      Crie um programa que peça ao usuário duas notas inteiras (int) e calcule a média exata entre elas. O desafio é que o
//      resultado deve ser um double e exibir a parte decimal corretamente (ex: a média entre 7 e 8 deve ser 7.5, e não 7).
//      **Dica:** Verifique no material o trecho referente a **Casting**

//  ******************************** Lista 3 ********************************************

//  ******************** Fundamentais ****************
//
//  1. Par ou Ímpar**
//     Peça ao usuário que digite um número inteiro e diga se ele é par ou ímpar.
//     Usa: `if` e operador `%`.
//
//        System.out.println("Digite um número inteiro:");
//        numero = sc.nextInt();
//
//        if (numero < 0) {
//            System.out.println("Favor digitar um Número maior que 0");
//            numero = sc.nextInt();
//        }
//        int resultado = numero % 2;
//
//        if (resultado == 1) {
//            System.out.println("Número é Impar");
//        } else {
//            System.out.println("Número é Par");
//        }

//
//  2. **Senha simples**
//     Peça ao usuário uma senha. Se for igual a "1234", exiba "Acesso concedido", senão, "Acesso negado".
//
//
//        System.out.println("Digite a senha");
//        senha = sc.nextLine();
//
//        if (senha.equals("1234")) {
//            System.out.println("Acesso concedido");
//        } else {
//            System.out.println("Acesso negado");
//        }


//  3. **Número dentro de intervalo**
//     Pergunte um número e diga se ele está entre 10 e 20 (inclusive).
//
//        System.out.println("Digite um número");
//        numero = sc.nextInt();
//
//        if (numero > 10 && numero < 20){
//            System.out.println("O número digitado está entre 10 e 20");
//        }

//  ******************** Intermediário ********************
//
//  4. **Maior entre dois números**
//     Peça dois números e diga qual é o maior (ou se são iguais).
//
//        int num1;
//        int num2;
//
//        System.out.println("Digite 1° número");
//        num1 = sc.nextInt();
//
//        System.out.println("Digite 2° número");
//        num2 = sc.nextInt();
//
//        if (num1 == num2){
//            System.out.println("Os números são iguais. 1° número é " + num1 + " e o 2° número é " + num2);
//        } else if (num1 > num2) {
//            System.out.println("O 1° número é o maior. " + num1 + " é maior que " + num2);
//        } else {
//            System.out.println("O 2° número é o maior. " + num2 + " é maior que " + num1);
//        }

//  5. **Notas e conceito**
//     Peça ao usuário uma nota de 0 a 10. Classifique como:
//     - A (nota ≥ 9)
//     - B (nota ≥ 7)
//     - C (nota ≥ 5)
//     - D (nota < 5)

//        System.out.println("Digite uma nota:");
//        nota = sc.nextInt();
//
//        if (nota >= 9) {
//            System.out.println("Nota A");
//        } else if (nota >= 7 && nota < 9){
//            System.out.println("Nota B");
//        } else if (nota >= 5 && nota < 7){
//            System.out.println("Nota C");
//        } else {
//            System.out.println("Nota D");
//        }

//
//  6. **Verificador de ano bissexto**
//     O usuário digita um ano, e o programa informa se ele é bissexto (dica: divisível por 4, mas com regras para 100 e 400).

//        int ano;
//
//        System.out.println("Digite o Ano:");
//        ano = sc.nextInt();
//
//        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
//            System.out.println("Ano " + ano + " é bissexto");
//
//        } else {
//            System.out.println("Ano " + ano + " não é bissexto");
//        }


//  ****************** While **************************
//
//  9. **Contador até 10**
//     Use while para contar de 1 até 10, mostrando cada número.

//        numero = 1;
//
//        while (numero <= 10){
//            System.out.println("Número: " + numero);
//
//            numero = numero + 1;
//        }
//
//  10. **Validador de senha com tentativas**
//      O usuário tem até 3 tentativas para digitar a senha correta.

        int tentativa = 1;

        System.out.println("Digite a senha");
        senha = sc.nextLine();

        sc.nextLine();

        if (senha.equals("1234")) {
            System.out.println("Acesso concedido");
        } else {
            while (tentativa <= 3 ) {
                System.out.println("Digite a senha");
                senha = sc.nextLine();
                if (senha.equals("1234")) {
                    System.out.println("Acesso concedido");
                }
                tentativa = tentativa + 1;
            }
        }

    }
}

