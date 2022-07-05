package classes;

public enum EMenu {
    SAIR(0, "Sair"),
    ADICIONAR_ITEM(1, "Adicionar item a estante"),
    BUSCAR_ITEM(2, "Buscar Item"),
    REMOVER_ITEM(3, "Remover item da estante"),
    MOSTRAR_ITEM(4, "Mostrar itens na estante"),
    ADICIONAR_ESTANTE(5, "Adicionar uma esatnte");

    private int valorOpcao;
    private String descricao;

    EMenu(int valor, String descricao){
        this.valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenu getByValorOpcao(int escolha){
        for (EMenu e : EMenu.values()){
            if (e.getValorOpcao() == escolha){
                return e;
            }
        }
        return null;
    }

    //GETTER AND SETTER

    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
