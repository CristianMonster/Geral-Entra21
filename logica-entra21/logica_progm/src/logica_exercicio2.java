import java.util.Scanner;
public class logica_exercicio2 {
    //Escreva um algoritmo para ler um valor e escrever o seu antecessor
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Informe um valor inteiro: ");
        numero = ler.nextInt();
        System.out.println("Antecessor de " + numero + " é " + --numero);
    }
}
