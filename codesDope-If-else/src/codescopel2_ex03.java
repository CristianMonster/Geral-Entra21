import java.util.Scanner;
public class codescopel2_ex03 {
    /*Um número de 4 dígitos é inserido através do teclado.
    Escreva um programa para imprimir um novo número com dígitos invertidos a partir do original. Ex
    ENTRADA: 1234 SAÍDA: 4321
    ENTRADA: 5982 SAÍDA: 2895*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe uma sequência de 4 números: ");
        int numeros = ler.nextInt();
        int primeiroDigito = numeros % 10;
        int segundoDigito = (numeros/10) % 10;
        int terceiroDigito = (numeros/100) % 10;
        int quartoDigito = (numeros/1000) % 10;
        int numeroInvertido = (primeiroDigito * 1000) + (segundoDigito * 100) + (terceiroDigito * 10) + quartoDigito;
        //System.out.println("O número informado invertido é: " + numeroInvertido);
        System.out.printf("O número informado invertido é: %d", numeroInvertido);
    }
}