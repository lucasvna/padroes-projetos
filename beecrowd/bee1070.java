package beecrowd;

import java.util.Scanner;

public class bee1070 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int cont = 0;
        while (cont < 6) {
            if (X % 2 == 1) {
                System.out.println(X);
                cont++;
            }
            X++;
        }
    }
}
