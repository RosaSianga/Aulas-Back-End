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

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome");
            nomes[i] = sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) { //tamanho dinamico
            System.out.println(nomes[i]);

        }


    }
}
