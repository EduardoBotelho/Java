package MainPackage;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um numero para o calculo do Fatorial :");
        int fat = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= fat;i++) resultado *= i;

        System.out.println("Fatorial do numero " + fat + " =  " + resultado);
    }

}
