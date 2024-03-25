package MainPackage;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoplano = "normal";

        if(anoDeLancamento >= 2022){
            System.out.println("Lancamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena Assistir!");
        }

        if(incluidoNoPlano == true && tipoplano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locacao");
        }
    }
}
