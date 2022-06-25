import java.util.Scanner;

public class exercicio_avantur_java4loop {
    public static void main(String[] args) {
        /* Pedir uma frase e retornar a quantidade de espaços*/
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = ler.nextLine();
        int contador = 0;
        char espaco = ' ';
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == espaco) {
                contador++;
            }
        }
        System.out.println("A quantidade de espaços é de: " + contador);
    }
}

