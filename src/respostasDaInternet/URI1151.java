package respostasDaInternet;

import java.io.IOException;
import java.util.Scanner;

public class URI1151 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int i;
        int proximo, anterior = 0, atual = 1;
        for (i = 1; i <= N; i++) {
            if (i == N) {
                System.out.println(anterior);
            } else {
                System.out.print(anterior + " ");
            }
             proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
