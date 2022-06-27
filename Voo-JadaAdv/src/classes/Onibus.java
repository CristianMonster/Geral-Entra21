package classes;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();
    private boolean leito;

    public Onibus(int linhasCadeiras) {
        int quantidadeCadeiras = linhasCadeiras * 4;
        for (int i = 1; i <= quantidadeCadeiras; i++) { // toda vez cria um assento novo
            AssentoOnibus a = new AssentoOnibus();
            if (i < 10) {
                a.setLugar(String.valueOf("0" + i));
            } else {
                a.setLugar(String.valueOf(+i));
            }

            assentos.add(a); //to adicionando na lista esse assento
        }
    }

    //Gatters  and Setters
    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int contador = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public void mostrarAssentos() {
        int contador = 0;
        for (AssentoOnibus a : assentos) {
            contador++;
            if (contador % 4 == 0){
                if (a.isOcupado()){
                    System.out.print("[XX] \n");
                } else {
                    System.out.print("[" + a.getLugar() + "] \n");
                }
            } else {
                if (a.isOcupado()){
                    System.out.println("[XX] ");
                } else {
                    System.out.print("[" + a.getLugar() + "] " );
                }
            }
            if ((contador % 2) == 0 && (contador%4) != 0){
                System.out.print("|| " );
            }

           /* if (a.isOcupado() && (contador % 4 == 0)){
                System.out.print("[XX] \n");
            } else if (a.isOcupado()) {
                System.out.print("[XX] ");
            } else if ((contador % 4 == 0)) {
                System.out.print("[" + a.getLugar() + "]\n");
            } else if (contador% 2 == 0){
                System.out.print("[" + a.getLugar() + "] ");
                System.out.print("|| ");
            } else {
                System.out.print("[" + a.getLugar() + "] ");
            }*/
        }

    }

    @Override
    public Assento getAssento(String assento, String classe) {
        return null;
    }

    @Override
    public Assento getAssento(String assento) {
        //se o código do assento for igual o que ele esta procurando retorna o assento
        for (AssentoOnibus a : assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a; // retorna a lista de assentos
            }
        }
        return null;
    }
}
