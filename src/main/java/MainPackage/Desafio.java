package MainPackage;

import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tentativas=0;
        double aleatorio = new Random().nextInt(100);
        tentativas++;

        for (int i = 0; i < 5; i++) {
            System.out.println("entre com um numero :");
            double numero = leitura.nextDouble();
            if(numero == aleatorio){
                System.out.println("Voce adivinhou o numero secreto");
                break;
            } else if(numero < aleatorio) {
                System.out.println("Numero digitado e menor que o numero gerado");

                } else {
                       System.out.println("Numero digitado e maior que o numero gerado");

            }

           if( tentativas == 5) {
               System.out.println("Voce nao conseguiu adivinhar o numero secreto!");
           }

         }

        System.out.println("Numero que foi gerado:" + aleatorio);
    }
}
