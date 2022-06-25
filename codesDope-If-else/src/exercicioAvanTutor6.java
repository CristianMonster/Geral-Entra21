import java.util.Scanner;
public class exercicioAvanTutor6 {
    public static void main(String[] args) {
        /*
ESCREVER UM ALGORITMO QUE CHEQUE SE O PIN INFORMADO PELO USUÁRIO É VÁLIDO PARA ELE EXECUTAR UMA AÇÃO IMAGINARIA.
         */
        int pin = 91352;
        Scanner ler = new Scanner(System.in);
        int tentativas = 3;
        //boolean resposta = true;
        while (tentativas > 0) {
            System.out.print("Informe o Pin, você tem apenas 3 tentativas: ");
            int pinInformado = ler.nextInt();
            if (pinInformado == pin) {
                System.out.println("Acesso Liberado!");
                break;
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("ACESSO BLOQUEADO!");
            } else {
                System.out.println("PIN incorre, tente novamente!");
            }

            }
        }

    }

