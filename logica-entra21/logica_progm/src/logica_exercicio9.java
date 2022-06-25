import java.util.Scanner;
public class logica_exercicio9 {
    /*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever
    o valor correspondente em graus Celsius (baseado na fórmula abaixo):

    C/5 = F - 32/9

    Observação: Para testar se a sua resposta está correta saiba que 100 ºC = 212F.*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double temperaturaF;
        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        temperaturaF = ler.nextDouble();

        double temperaturaC = (((temperaturaF - 32)/9)*5);

        System.out.println("A conversão da temperatura de " + temperaturaF +"F para Celcius resulta em: " + temperaturaC + "C");
    }
}
