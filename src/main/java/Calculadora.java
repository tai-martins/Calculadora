import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        float num1 = 15;
        float num2 = 20;
        int operacao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem vindo a caluladora! Os numeros sao 15 e 20");
        System.out.println("1- Para Somar, 2- Para Subtrair, 3- Para Multiplicar, 4- Para Dividir");
        System.out.println("Digite a opção desejada:");
        operacao = teclado.nextInt();

        if(operacao == 1) {
            System.out.println(num1 + num2);
        }

        else if(operacao == 2) {
            System.out.println(num1 - num2);
        }

        if(operacao == 3) {
            System.out.println(num1 * num2);
        }
        if(operacao == 4) {
            System.out.println(num1 / num2);
        }
    }
}
