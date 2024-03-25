package MainPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento :" +  anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura";
        System.out.println(sinopse);

        int classificacao;
    classificacao = (int) (media/2);
        System.out.println(classificacao);

        int x = 10;
        double y = x; // casting implícito
        System.out.println(y);

        double x1 = 10.5;
        int y1 = (int) x1; // casting explícito
        System.out.println(y1);

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
    }
}
