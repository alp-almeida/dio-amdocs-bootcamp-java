package impares_consecutivos;

import java.util.Scanner;

public class ImparesConsecutvos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min ( a , b)+1;
        int max = Math.max ( a , b);
        int valor = 0;

        while(min != max){
            if(min % 2 != 0){
                valor += min;
            }
            min++;
        }
        System.out.println(valor);
    }
}
