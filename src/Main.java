import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================== Bem-vindo(a) ao Verificador de Números Primos ======================");
        System.out.println("\nNeste programa vamos analisar um número que você digitar, e vamos dizer se ele é um número\nprimo ou não.\n");
        System.out.println("Números primos: São números maiores que 1 que possuem apenas dois divisores:\nO número 1 e ele mesmo.\nPor exemplo, 2, 5, 7, 11 são números primos.\n");
        System.out.println("Números compostos: São números maiores que 1 que possuem mais de dois divisores.\nPor exemplo, 6 é um número composto, pois é divisível por 1, 2 e 3.");

        int escolha = 0;
        while (escolha != 2) {
            System.out.println("\n===========================================================================================");
            System.out.print("1. Verificar número\n2. Finalizar\nEscolha uma opção: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("\nDigite um número para iniciar: ");
                    int numero = scanner.nextInt();
                    String r = verificadorDeNumeroPrimo(numero);
                    System.out.println(r);
                    break;

                case 2:
                    System.out.println("\nEncerrando programa... Até mais!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Selecione outra opção...");
            }
        }


        System.out.println("\n===========================================================================================");


        scanner.close();
    }

    public static String verificadorDeNumeroPrimo(int numero) {
        if (numero < 2) {
            return "O número " + numero + " não é primo e nem composto, pois possuem menos de 2 divisores.";
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "O número " + numero + " não é primo. Ele é um número composto.";
            }
        }

        return "O número " + numero + " é um número primo.";
    }
}
