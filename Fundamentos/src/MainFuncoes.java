import java.util.Scanner;

public class MainFuncoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // função tem palavras obrigatórias
        // public static RETORNO (se devolver algum resultado) Nome da função (PARAMETROS caso tenha entrada de dados) {
        // código da função
        // }

        //obs: não pode criar um metódo dentro de outro

        //Função sem retorno é obrigatório ter o VOID

        //darBomDia();
        //saudar("Rosa");
        //subtrair(5,2);

        int resultado = somar(5,15);
        System.out.println(resultado);

//  1. Exibir uma mensagem de boas-vindas**
        mostrarMensagem();


//  2. Mostrar o dobro de um número
        int numinteiro;
        System.out.println("Digite um número:");
        numinteiro = sc.nextInt();
        mostrarDobro(numinteiro);

//  3. Retornar a divisão de dois números inteiros

        System.out.println("Digite 2 numeros para a divisão");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resultadoDivisao = dividirNumero(num1,num2);
        System.out.println("O valor da divisão é : " + resultadoDivisao);

//  4. Verificar se um número é par

        System.out.println("Digite um número para identificar se é par ou ímpar");
        int numero = sc.nextInt();

        boolean verdade = ehpar(numero);

        System.out.println("O número é par ? " + verdade);

//  5. Calcular média de três notas
        System.out.println("Digite 3 notas para saber a média");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();

        double mediaNota = calcularMedia(nota1, nota2, nota3);

        System.out.println("A média é : " + mediaNota);



    }


    //Função sem retorno
    public static void darBomDia() {
        System.out.println("Bom dia");
    }

    // Função sem retorno com Parâmetro
    public static void saudar(String nome) {
        System.out.println("Bom dia !! " + nome);
    }

    // Função sem retorno com vários Parâmetros
    public static void subtrair (int num1, int num2){
        int resultado = num1 - num2;
        System.out.println(resultado);
    }

    //Função com retorno e Parâmetro
    public static int somar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

//  Fundamentais
//
//  1. Exibir uma mensagem de boas-vindas**
//     Crie uma função chamada `mostrarMensagem` que imprima no console a seguinte frase:
//     "Bem-vindo(a) ao programa!"`
//
//  Dicas:**
//      - A função **não deve ter parâmetros**.
//      - A função **não precisa retornar nenhum valor** (tipo `void`).
//
//  Exemplo esperado ao chamar a função:**
//      mostrarMensagem(); // Saída: Bem-vindo(a) ao programa!


    public static void mostrarMensagem(){
        System.out.println("Bem-vindo(a) ao Programa! ");
    }

//  2. Mostrar o dobro de um número
//     Crie uma função chamada mostrarDobro que receba um número inteiro como parâmetro e imprima o dobro desse número.
//     Dicas:
//          A função deve ter um parâmetro inteiro.
//          A função não precisa retornar valor (só imprime).
//     Exemplo de uso:
//            mostrarDobro(5); // Saída: O dobro é 10

    public static void mostrarDobro(int numInteiro){
        int resultado = numInteiro * 2;
        System.out.println(resultado);
    }

//  3. Retornar a divisão de dois números inteiros
//     Objetivo: Praticar parâmetros + retorno.
//     Descrição:
//          Crie uma função chamada dividir que receba dois números inteiros e retorne a divisão entre eles.
//     Dicas:
//          A função deve ter dois parâmetros inteiros.
//          A função deve retornar um número.
//     Exemplo de uso:
//          int resultado = somar(4, 7); // resultado = 11


    public static int dividirNumero(int num1, int num2){

        int divisao = 0;
        divisao = num1 / num2;

        return divisao;
    }

// Intermediários
//  4. Verificar se um número é par
//     Crie uma função chamada ehPar que receba um número inteiro e retorne true se o número for par e false se for ímpar.
//     Dica:
//          A função deve retornar um valor booleano.
//     Exemplo de uso:
//          boolean resultado = ehPar(8); // true

    public static boolean ehpar (int num){
        int resultado = num % 2;
        boolean verdade = false;

        if (resultado == 0) {
            verdade = true;
        }

        return verdade;
    }

//  5. Calcular média de três notas
//     Crie uma função chamada calcularMedia que receba três notas (valores decimais) como parâmetros e retorne a média aritmética delas.
//     Dica:
//          A função deve retornar um valor decimal (double ou float).
//     Exemplo de uso:
//          double media = calcularMedia(7.5, 8.0, 9.0); // 8.1666...

    public static double calcularMedia(int nota1, int nota2, int nota3){
        double media = (double) (nota1 + nota2 + nota3) / 3;

        return media;

    }

//  6. Mostrar uma linha decorativa
//     Crie uma função chamada linha que imprima no console uma linha com 30 hífens (ou outro símbolo de sua escolha), como:
//     Dica:
//        A função não precisa receber parâmetros.
//        A função não retorna nada.
//     Exemplo de uso:
//        linha(); // Saída: ------------------------------


}
