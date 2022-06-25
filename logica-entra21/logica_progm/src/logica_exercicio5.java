import java.util.Scanner;
public class logica_exercicio5 {
    /*Escreva um algoritmo para ler o número total de eleitores de um município,
   o número de votos brancos e nulos. Calcular e escrever o total de votos válidos e o
   percentual que cada tipo de voto representa em relação ao total de eleitores.*/
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int totalEleitores;
        int votosBrancos;
        int votosNulos;
        System.out.print("Informe o numero total de eleitores: ");
        totalEleitores = ler.nextInt();
        System.out.print("Informe o numero total de votos em branco: ");
        votosBrancos = ler.nextInt();
        System.out.print("Informe o numero total de votos nulos: ");
        votosNulos = ler.nextInt();

        int votosValidos = totalEleitores - (votosBrancos + votosNulos);
        double percentualBrancos = (votosBrancos * 100) / totalEleitores;
        double percentualNulos = (votosNulos * 100) / totalEleitores;
        double percentualValidos = (votosValidos * 100) / totalEleitores;
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Votos brancos: " + votosBrancos);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos válidos: " + votosValidos);
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    }
}
