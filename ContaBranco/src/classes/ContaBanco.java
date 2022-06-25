package classes;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println(this.getNumConta());
        System.out.println(this.getDono());
        System.out.println(this.getTipo());
        System.out.println(this.getSaldo());
        System.out.println(this.isStatus());

    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equalsIgnoreCase("CC")){
            this.setTipo("Conta Corrente");
            this.setSaldo(50);
        } else if(t.equalsIgnoreCase("CP")){
            this.setTipo("Conta Poupança");
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Ainda resta saldo");
        } else if (this.getSaldo()<0) {
            System.out.println("Débito em conta");
        } else if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Conta indisponivel");
        }
    }

    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar em conta não ativa");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (getTipo().equalsIgnoreCase("CC")){
            v = 12;
        } else if (getTipo().equalsIgnoreCase("CP")){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Pagamento mensal efeituado com sucesso");
        }
    }

    //Metodos especiais
    public void ContaBanco(){//método construtor sempre tem que ter o mesmo nome da classe
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Getters and setters
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
