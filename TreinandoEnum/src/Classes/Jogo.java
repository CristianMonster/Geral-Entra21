package Classes;

import java.util.ArrayList;

public class Jogo {
    private ArrayList<Carta> handPlayer = new ArrayList<>();
    private ArrayList<Carta> handCPU = new ArrayList<>();
    private Baralho deck;
    private int playerWins;

    //Metodos
    public void firstRound(){
        //TODO
    }

    public void handlePlayerOption(PlayerOption opcao){
        //TODO
    }

    public void playerWin(){
        //TODO
    }

    public void oneMore(){
        //TODO
    }

    public void stop(){
        //TODO
    }
    public void doubleCard(){
        //TODO
    }

    //----------------------------Gatters and setters----------------------------

    public ArrayList<Carta> getHandPlayer() {
        return handPlayer;
    }

    public void setHandPlayer(ArrayList<Carta> handPlayer) {
        this.handPlayer = handPlayer;
    }

    public ArrayList<Carta> getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(ArrayList<Carta> handCPU) {
        this.handCPU = handCPU;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }
}
