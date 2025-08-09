import java.util.Scanner;

public class MainArrays {
    public static void main(String[] args) {

        int[] idades = new int[5];

        String[] nomes = new String[10];

        idades[0] = 15;
        idades[1] = 18;
        idades[2] = 25;
        idades[3] = 33;
        idades[4] = 48;

        //System.out.println(idades[1]);

//        for (int i = 0; i < 5; i++) {  //tamanho fixo
//            System.out.println(idades[i]);
//
//        }
//
//        for (int i = 0; i < idades.length; i++) { //tamanho dinamico
//            System.out.println(idades[i]);
//
//        }

        //Preencha o vetor de nomes e liste todos os nomes com o FOR

//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println("Digite um nome");
//            nomes[i] = sc.nextLine();
//        }
//
//        for (int i = 0; i < nomes.length; i++) { //tamanho dinamico
//            System.out.println(nomes[i]);
//
//        }
//
//  1. Crie e imprima um vetor**
//     Crie um vetor de 5 posições do tipo `int`, preencha com valores fixos (por exemplo, 10, 20, 30, 40, 50) e
//     imprima todos os valores usando um laço `for`.
//
//        int[] valor = new int[5];
//
//        for (int i = 0; i < valor.length ; i++) {
//            if (i == 0){
//                valor[i] = 10;
//            } else {
//                valor[i] = valor[i-1] + 10;
//            }
//
//            System.out.println("Valor = " + valor[i]);
//        }


//  2. Preencher e listar 10 elementos**
//     Crie um vetor de 10 posições do tipo `int`. Solicite ao usuário que informe os 10 valores e, ao final,
//     **exiba todos os números digitados** usando um laço `for`.

//        int[] valores = new int[10];
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite 10 valores");
//
//        for (int i = 0; i < valores.length ; i++) {
//            valores[i] = sc.nextInt();
//        }
//
//        System.out.println("Seguem os valores digitados");
//
//        for (int i = 0; i < valores.length; i++) {
//            int seq = i + 1;
//            System.out.println(seq + "° valor : " + valores[i]);
//        }

//  3. Soma dos elementos do vetor**
//     Crie um vetor de 4 posições com valores definidos pelo usuário e calcule a **soma de todos os elementos**.
//
//        int[] valoresDigitados = new int[4];
//        int resultado = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite 4 valores para serem somados!");
//
//        for (int i = 0; i < valoresDigitados.length; i++) {
//            valoresDigitados[i] = sc.nextInt();
//            resultado = resultado + valoresDigitados[i];
//        }
//
//        System.out.println("Resultado da soma: " + resultado);

//  4. Encontre o maior valor**
//     Preencha um vetor com 6 números inteiros definidos pelo usuário. Em seguida, mostre **qual é o maior
//     valor** presente no vetor.

        Scanner sc = new Scanner(System.in);

        int[] numero = new int[6];
        int numMaior = 0;

        System.out.println("Digite 6 número para identificar o maior!");

        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
            if (numero[i] > numMaior) {
                numMaior = numero[i];
            }
        }

        System.out.println("O maior número é: " + numMaior);
    }
}
