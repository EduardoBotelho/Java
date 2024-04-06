package MainPackage;

import java.util.Scanner;

public class Exercicios {


    public static void main(String[] args) {


       //1
        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("Entre com um numero:");
        int compara = leitura.nextInt();

        if (compara > 0){
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero negativo");
        }

       //2
        System.out.println("Entre com o primeiro numero:");
        int num1 = leitura.nextInt();
        System.out.println("Entre com o segundo numero:");
        int num2 = leitura.nextInt();

        if(num1 == num2){
            System.out.println("Os numeros sao iguais!");
        } else if(num1 != num2){
            System.out.println("Os numeros informados sao diferentes!");
        } else if( num1 > num2){
            System.out.println("O primeiro eh maior que o segundo!");
        } else {
            System.out.println("O segundo eh maior que o primeiro!");
        }
        //3

    }
}
