import java.util.Scanner;
public class logica_exercicio3 {
    //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área e o perímetro do retângulo
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double base;
        double altura;
        System.out.print("informe a base em metros: ");
        base = ler.nextDouble();
        System.out.print("Informe a altura em metros: ");
        altura = ler.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.printf("Área = %.2f metros quadrados.\n", area);
        System.out.printf("Perímetro = %.2f metros", perimetro);
    }
}
