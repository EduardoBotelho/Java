package MainPackage;

public class Calculos {
    public static void main(String[] args) {
        double numero1 = 2.5;
        double numero2 = 9.6;
        double media = 0;

        media = (numero1 + numero2)/2;

        System.out.println(media);


        double exe = 1.5;
        int exe2;
        int convert = (int) exe;
        System.out.println(convert);

        double precoProduto = 520.95;
        int qtd = 600;
        double total;

        total = precoProduto*qtd;
        System.out.println((int)total);

        char letra = 'A';
        String palavra = "zul";
        System.out.println(letra +  palavra);


        double valorEmDolares = 5000;
        double fatorConversao = 4.94;
        double valorConvertido = 0;

        valorConvertido = valorEmDolares * fatorConversao;
        System.out.println((int)valorConvertido);

        double precoOriginal = 800;
        double percentualDesconto = 25.0;
        double valorDesconto = (percentualDesconto/100) * precoOriginal;
        double precoFinal;
        precoFinal = precoOriginal - valorDesconto;
        System.out.println("Preco Original:" + precoOriginal);
        System.out.println("Valor Desconto:" + valorDesconto);
        System.out.println("O preco final sera : " + " " + precoFinal+" " + "Reais");


    }
}
