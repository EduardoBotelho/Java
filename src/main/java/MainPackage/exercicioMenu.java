package MainPackage;

import java.util.Scanner;

public class exercicioMenu {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        final double VALOR_PI = 3.14;
        int menu = 0;
        System.out.println("Entre com uma opcao:");
        System.out.println("Digite 1 para calcular a area do quadrado ou 2 para calcular a area do" +
                "circulo");
        menu = leitura.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Calcular area Quadrado");
                System.out.println("informe o valor do lado do quadrado:");
                double lado = leitura.nextDouble();
                double area = 0;
                area = lado * lado;
                System.out.println(area);
                break;
            case 2:
                System.out.println("Calcular Area do Circulo");
                System.out.println("Entre com o valor do raio");
                double raio = leitura.nextDouble();
                double areaCirculo = 0;
                areaCirculo = VALOR_PI * (raio * raio);
                System.out.println(areaCirculo);
                break;
            default:
                System.out.println("Comece novamente");

        }
    }
}
