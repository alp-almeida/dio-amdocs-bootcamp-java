package fatorial;
import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {

        //complete o código com sua solução
        Scanner sc = new Scanner(System.in);
        int entrada = 4; // saida 24
        entrada = sc.nextInt();
        int cont = entrada;
        int valor = 1;
        while(cont>0){
            valor = valor * cont;
            cont--;
        }
        System.out.println(valor);

    }

}