package minhasRespostas;

import java.util.Scanner;

public class URI1151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int seq = 0;
        int penultimo = 0;
        int ultimo = 0;
        int cont1 = 1;
        int cont2 = 2;

        for (int i = 0; i < num; i++) {
            if(i > 0){
                if (i > 2 && i % 2 != 0) {
                    cont1++;
                }
                ultimo = i - cont1;
            }
            if (i > 1) {
                if (i > 3 && i % 2 == 0) {
                    cont2++;
                }
                penultimo = i - cont2;
                seq = penultimo + ultimo;
            }
            System.out.print(seq + "\t");
            seq++;
        }
    }
}
