import java.util.Scanner;
public class logica_exercicio19 {
    /*
    Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa,
    calcule e mostre seu peso ideal, utilizando as seguintes fórmulas:
	- para sexo masculino: peso ideal = (72.7 * altura) - 58
	- para sexo feminino: peso ideal = (62.1 * altura) - 44.7

     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        double altura;
        String sexo;
        double pesoideal;

        System.out.print("Informe o seu nome: ");
        nome = ler.nextLine();
        System.out.print("Informe a sua altura: ");
        altura = ler.nextDouble();
        ler.nextLine();
        System.out.print("Informe o seu sexo usando M para masculino e F para feminino: ");
        sexo = ler.nextLine();

        if (sexo.equals("M")) {
            pesoideal = (72.7 * altura) - 58;
            System.out.println("Olá " + nome + ", o peso ideal para a sua altura é de: " + pesoideal);
            //System.out.printf("Olá", nome, " o peso ideal para a sua altura é de: %.2f quilos.\n", pesoideal);
        } else  {
            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("Olá " + nome + ", o peso ideal para a sua altura é de: " + pesoideal);
        }
    }
}
