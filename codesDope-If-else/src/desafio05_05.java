import java.util.Scanner;
public class desafio05_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean classe = true;
        while(classe) {
            System.out.print("Informe a abreviação da classe: ");
            String qualClas = ler.next();
            if (qualClas.length() == 3) {
                switch (qualClas.toUpperCase()) {
                    case "PLD", "WAR", "DKN", "GNB" :
                        System.out.println("É TANK"); break;
                    case "WHM", "SCH", "AST", "SAG" :
                        System.out.println("É HEALER"); break;
                    case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD","MCH", "DNC", "BLM", "SMN", "RDM", "BEM" :
                        System.out.println("É DPS"); break;
                    default:
                        System.err.println("NÃO É NENHUMA CLASSE");
                        classe = false;
                        break;
                }
            } else {
                System.out.println("Digite uma abreviação de 3 letras!");
            }

        }
    }
}
