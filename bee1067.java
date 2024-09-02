import java.io.IOException;

import java.util.Iterator;
import java.util.Scanner;
public class bee1067 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int valorX = leitor.nextInt();
        for (int i = 0; i <= valorX; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}