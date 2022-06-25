import java.util.Scanner;

public class codescope_ex05 {
    public static void main(String[] args) {
        //Uma escola tem as seguintes regras para o sistema de classificação:
        //a. Abaixo de 25 - F
        //b. 25 a 45 - Ec
        //. 45 a 50 - D
        //d. 50 a 60 - C
        //e. 60 a 80 - B
        //f. Acima de 80 - A
        //Peça ao usuário para inserir notas e imprimir a nota correspondente.
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a sua nota: ");
        int nota = ler.nextInt();
        if (nota < 25) {
            System.out.println("A sua classificação é de: F");
        } else if (nota < 45) {
            System.out.println("A sua classificação é de: Ec");
        } else if (nota < 50) {
            System.out.println("A sua classificação é de: D");
        } else if (nota < 60) {
            System.out.println("A sua classificação é de: C");
        } else if (nota < 80) {
            System.out.println("A sua classificação é de: B");
        } else {
            System.out.println("A sua classificação é de: A");
        }
    }
}
