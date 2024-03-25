package MainPackage;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lancamento:");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Informe sua avaliacao sobre o filme:");
        double avaliacao = leitura.nextDouble();//O Escaner lê com virgula e mostra com ponto

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
