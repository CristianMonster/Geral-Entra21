public class edabit_ex01 {
    public static void main(String[] args) {
        String[] palavras = {"pbc", "def", "ghi"};
        char letraProibida = 'a';
        boolean achou = false;
        for (String palavra:palavras) { // percore todos os itens da array
            for (int i = 0; i < palavra.length(); i++) { //percorre letra por letra
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }
        }
        if (achou) {
            System.out.println("Encontrou a letra proibida");
        } else {
            System.out.println("Nao encontrou a letra proibida");
        }
    }
}
  /*  public static void main(String[] args) {
        System.out.println(
                forbidenLetter(new String[]{"abc", "def", "ghi"}, 'a')
        );
    }
}
        boolean achou = false;
        for(String palavra : palavras) { //procura toda as palavras na lista
            for (int i = 0; i <= palavra.length(); i++) { // percorre letra por letra na lista
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }
        }
        return achou;
    }
}
*/