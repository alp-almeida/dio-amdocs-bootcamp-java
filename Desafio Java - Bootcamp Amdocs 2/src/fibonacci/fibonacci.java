package fibonacci;
import java.util.Locale;
import java.util.Scanner;


public class fibonacci {


    public static double fibo(double n) {
        double primeiroTermo = Math.pow((1 + Math.pow(5, 0.5)) / 2, n);
        double segundoTermo = Math.pow((1 - Math.pow(5, 0.5)) / 2, n);
        double dividendo = primeiroTermo - segundoTermo;
        double divisor = Math.pow(5, 0.5);
        double retorno = dividendo / divisor;
        return retorno;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 19;
        System.out.println(fibo((double) entrada));
    }
}