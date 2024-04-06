package MainPackage;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Entre com um numero de 1 a 10");
        int num = leitura.nextInt();
        int result = 0;
        int resultado;

        while(result <= 10){
            resultado = num * result;
            System.out.println(+   num   + " multiplicado: " +  result  + "  =  " +  resultado);
            result++;
        }

        }
    }

