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

//        int resultado = somar(5,15);
//        System.out.println(resultado);

//  1. Exibir uma mensagem de boas-vindas**
        //mostrarMensagem();


//  2. Mostrar o dobro de um número
//        int numinteiro;
//        System.out.println("Digite um número:");
//        numinteiro = sc.nextInt();
        //mostrarDobro(numinteiro);

//  3. Retornar a divisão de dois números inteiros

//        System.out.println("Digite 2 numeros para a divisão");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

        //int resultadoDivisao = dividirNumero(num1,num2);
        //System.out.println("O valor da divisão é : " + resultadoDivisao);

//  4. Verificar se um número é par

//        System.out.println("Digite um número para identificar se é par ou ímpar");
//        int numero = sc.nextInt();

        //boolean verdade = ehpar(numero);

        //System.out.println("O número é par ? " + verdade);

//  5. Calcular média de três notas
//        System.out.println("Digite 3 notas para saber a média");
//        int nota1 = sc.nextInt();
//        int nota2 = sc.nextInt();
//        int nota3 = sc.nextInt();

        //double mediaNota = calcularMedia(nota1, nota2, nota3);

        //System.out.println("A média é : " + mediaNota);

//  6. Mostrar uma linha decorativa

        //linha();

//Extra 1 - Converter Celsius para Fahrenheit
        celsiusParaFahrenheit(30);

//  Extra 1 - Verificar se um número é múltiplo de 3
//        System.out.println("Digite um número inteiro: ");
//        int numero = sc.nextInt();
//        boolean multiplo = ehMultiploDeTres(numero);
//
//        System.out.println("O número " + numero + "é multiplo de 3 ? " + multiplo);

//Extra 2 - Somar elementos de um array

//        int[] meuArray = {1,2,3,4,5,6,7,8,9,10};
//        int soma = somarArray(meuArray); // 10
//        System.out.println("A soma do Array é : " + soma);

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
    public static void subtrair(int num1, int num2) {
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


    public static void mostrarMensagem() {
        System.out.println("Bem-vindo(a) ao Programa! ");
    }

//  2. Mostrar o dobro de um número
//     Crie uma função chamada mostrarDobro que receba um número inteiro como parâmetro e imprima o dobro desse número.
//     Dicas:
//          A função deve ter um parâmetro inteiro.
//          A função não precisa retornar valor (só imprime).
//     Exemplo de uso:
//            mostrarDobro(5); // Saída: O dobro é 10

    public static void mostrarDobro(int numInteiro) {
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


    public static int dividirNumero(int num1, int num2) {

        int divisao = 0;
        divisao = num1 / num2;

        return divisao;
    }

//Extra 1 - Converter Celsius para Fahrenheit
//    Crie a função celsiusParaFahrenheit que receba uma temperatura em Celsius e exiba no
//    console o valor convertido para Fahrenheit.
//            Fórmula: F = C * 1,8 + 32
//    Parâmetro: decimal (double ou float)
//    Retorno: nenhum (void)
//    Exemplo:
//      celsiusParaFahrenheit(0);   // Saída: 32.0°F
//      celsiusParaFahrenheit(25);  // Saída: 77.0°F

    public static void celsiusParaFahrenheit(double celsius){
        double temperatura = celsius * 1.8 + 32;

        System.out.println("Temperatura celsius " + celsius + " é igual a " + temperatura + " Fahrenheit");

    }

// Intermediários
//  4. Verificar se um número é par
//     Crie uma função chamada ehPar que receba um número inteiro e retorne true se o número for par e false se for ímpar.
//     Dica:
//          A função deve retornar um valor booleano.
//     Exemplo de uso:
//          boolean resultado = ehPar(8); // true

    public static boolean ehpar(int num) {
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

    public static double calcularMedia(int nota1, int nota2, int nota3) {
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

    public static void linha() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um simbolo");
        String simbolo = "";
        String simboloDigitado = sc.nextLine();

        for (int i = 0; i <= 30; i++) {
            simbolo = simbolo + simboloDigitado;
        }

        System.out.println(simbolo);

        //ou

//        for (int i = 0; i <= 30; i++) {
//            simbolo = simboloDigitado;
//            System.out.print(simbolo);
//        }

    }

//  Extra 1 - Verificar se um número é múltiplo de 3
//        Crie a função ehMultiploDeTres que receba um número inteiro e retorne true se for múltiplo de 3,
//        ou false caso contrário.
//        Exemplo:
//            boolean resultado = ehMultiploDeTres(9); // true
//            boolean outro = ehMultiploDeTres(10);    // false


    public static boolean ehMultiploDeTres(int numero) {

        int resto = numero % 3;
        boolean multiplo = false;

        if (resto == 0) {
            multiplo = true;
        }

        return multiplo;

    }

//Extra 2 - Somar elementos de um array
//    Crie a função somarArray que receba um array de números inteiros e retorne a soma de todos os elementos.
//            Parâmetro: int[]
//    Retorno: inteiro
//    Exemplo:
//          int[] meuArray = {1， 2， 3， 4}；
//          int soma = somarArray(meuArray); // 10

    public static int somarArray(int[] numero){
        int soma = 0;

        for (int i = 0; i < numero.length; i++) {
            soma = soma + numero[i];
        }
        return soma;
    }

}
