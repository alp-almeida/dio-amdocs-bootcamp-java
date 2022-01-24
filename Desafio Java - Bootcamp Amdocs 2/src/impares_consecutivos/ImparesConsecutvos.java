package impares_consecutivos;

public class ImparesConsecutvos {

    public static boolean eImpar(int num){
        return (num % 2 != 0);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 12;

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
    // fim da classe
}
