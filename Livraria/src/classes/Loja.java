package classes;

import classes.guardados.Estante;
import java.util.HashMap;

public class Loja {
    private HashMap<String, Estante> estantes = new HashMap<>();

    //GETTER AND SETTER
    public HashMap<String, Estante> getEstantes() {
        return estantes;
    }

    public void setEstante(HashMap<String, Estante> estante) {
        this.estantes = estante;
    }
}
//
//ADICIONAR ITEM DO MENU VAI MUDAR - aonde tratamos ele - , tem que pedir em qual estante o usuario quer adicionar o item, quando quiser adicionar a estante tenho que pedir a capacidade
//maxima para aquela estante, vulgo a chave. Se ja existir aquele genero (key), você tem que trocar o genero.
//DA MAIN VAI SAIR A ESTANTE UNICA DE 5 posições.