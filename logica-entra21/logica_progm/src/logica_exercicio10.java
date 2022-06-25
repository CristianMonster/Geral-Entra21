import java.util.Scanner;
public class logica_exercicio10 {
   /* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final
   deste aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.
   Fórmula para o cálculo da média final é:
   mediaFinal = n1 * 2 + n2 * 3 + n3 * 5/ 10*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        System.out.print("Informe o valor da primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.print("Informe o valor da segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.print("Informe o valor da terceira nota: ");
        nota3 = ler.nextDouble();
        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
        System.out.println("A média final desse aluno é de: " + mediaFinal);
    }
}
