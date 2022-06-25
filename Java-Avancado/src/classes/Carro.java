package classes;

public class Carro {
    private String modelo;
    private double ValorVenda;


    //------------Gatters And Setters----------------
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setValorVenda(double valorVenda) {
        ValorVenda = valorVenda;
    }
    public double getValorVenda() {
        return ValorVenda;
    }
}
