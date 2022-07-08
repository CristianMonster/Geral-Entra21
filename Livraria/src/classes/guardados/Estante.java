package classes.guardados;

import classes.itens.Item;

import java.util.ArrayList;

public class Estante {
    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        return this.itens.size();
    }

    public Item buscarItem(String titulo) {
        return this.itens.stream().filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null); //o LIVRO esta iterando dentro do ITENS, como se fosse foreach
       /* for (Item i : this.itens) {
            if (i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;*/
    }


    public boolean adicionarItem(Item item) {
        if (!estanteCheia()){
            return this.itens.add(item);
        }
        return false;
    }

    public Item removerItem(int posicao) {
        return this.itens.remove(posicao);
    }

    // GETTERS & SETTERS

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public  ArrayList<Item> getItens(){
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }


}
