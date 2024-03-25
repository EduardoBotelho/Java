package MainPackage;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("informe sua avaliacao do filme");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }
        System.out.println("Media das Avaliacoes:" + mediaAvaliacao/3);
    }
}
