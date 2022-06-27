package classes;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxos, int linhasCadeirasEconomicas) {

        String[] listaLuxo = {"A", "B", "C", "D"};
        for (int i = 1; i <= linhasCadeirasLuxos; i++) {
            for (int j = 0; j < 4; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setClasse("Luxo");
                a.setCodigo(listaLuxo[j] + i);
                assentos.add(a);
            }
        }

        String[] listaEconomica = {"A", "B", "C", "D", "E", "F"};
        for (int i = 1; i <= linhasCadeirasEconomicas; i++) {
            for (int j = 0; j < listaEconomica.length; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setClasse("Economico");
                a.setCodigo(listaEconomica[j] + i);
                assentos.add(a);
            }
        }
    }

    //Gatters  and Setters
    public ArrayList<AssentoVoo> getAssento() {
        return assentos;
    }

    public void setAssento(ArrayList<AssentoVoo> assento) {
        this.assentos = assento;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int contador = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public void mostrarAssentos() {

        int contadorLuxo = 0;
        int contadorEconomica = 0;
        for (AssentoVoo a : assentos) {
            if (a.getClasse().equalsIgnoreCase("luxo")) {
                contadorLuxo++;
                if (a.getCodigo().contains("A")){
                    System.out.print("     ");
                }
                if ((contadorLuxo % 4 == 0)) {
                    System.out.print("[" + a.getCodigo() + "]\n");
                } else {
                    System.out.print("[" + a.getCodigo() + "] ");
                }
            }

            if (a.getClasse().equalsIgnoreCase("economico")) {
                contadorEconomica++;
                if ((contadorEconomica % 6 == 0)) {
                    System.out.print("[" + a.getCodigo() + "]\n");
                } else {
                    System.out.print("[" + a.getCodigo() + "] ");
                }
            }
        }
    }


    @Override
    public Assento getAssento(String assento) {
        //se o código do assento for igual o que ele esta procurando retorna o assento
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a; // retorna a lista de assentos
            }
        }
        return null;
    }

    public Assento getAssento(String assento, String classe) {
        //se o código do assento for igual o que ele esta procurando retorna o assento
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equalsIgnoreCase(classe)) {
                return a; // retorna a lista de assentos
            }
        }
        return null;
    }
}
