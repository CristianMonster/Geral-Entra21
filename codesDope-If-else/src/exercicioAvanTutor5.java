import java.util.Scanner;
public class exercicioAvanTutor5 {
    public static void main(String[] args) {
       /* Suppose we have a database composed of two fields or columns (arrays),
       the first field is for the username (user[]) and the other one is for the password(pass[]) .
        This is how it looks like:
        user[0] = “Hassan” ;
        user[1] =”Idris”;
        user[2]=”Trevor” ;
        And their passwords correspond with their indexes.
                pass[0] = “homecomingking”;
        pass[1] = “turnupcharlie”;
        pass[2] = “afraidofthedark”;
        Then if one of them had successfully login, the output should be:
        Enter username: Hassan
        Enter password: homecomingking
        Hello Hassan!
                But if not, “Incorrect Login!”
        You can ignore case for the username but not for the password.
        */
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o seu usuário: ");
        String usuario = ler.nextLine();
        System.out.print("Informe a sua senha: ");
        String senha = ler.nextLine();

        String [] listaUsuario = {"Hassan", "Idris", "Trevor"};
        String [] listaSenha = {"homecomingking", "turnupcharlie", "afraidofthedark"};

        if (usuario.equals(listaUsuario[0])  && senha.equals(listaSenha[0])){
            System.out.println("Welcome Hassan!");
        } else if (usuario.equals(listaUsuario[1])  && senha.equals(listaSenha[1])) {
            System.out.println("Welcome Idris!");
        } else if (usuario.equals(listaUsuario[2])  && senha.equals(listaSenha[2])) {
            System.out.println("Welcome Trevor");
        } else {
            System.out.println("Incorrect Login");
        }
    }
}
