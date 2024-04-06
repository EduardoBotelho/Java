package MainPackage;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um numero para vefificacao:");
        int numero = scanner.nextInt();

        if(numero %2 ==0){
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }
}
