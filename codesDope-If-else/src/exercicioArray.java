import java.util.Scanner;

public class exercicioArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a quantidade de palavras: ");
        int numPalavras = ler.nextInt();
        String[] palavras = new String[numPalavras];

        for (int i = 0; i < numPalavras; i++) {
            System.out.print("Informe as palavras desejadas: ");
            palavras[i] = ler.next();
        }

        String todasPalavras = "";
        for (int i = 0; i < palavras.length; i++) {
           if (i == 0) {
               todasPalavras += palavras[i];
           } else {
               todasPalavras += ", " + palavras[i];
           }
        }
        System.out.println(todasPalavras);
    }
}
