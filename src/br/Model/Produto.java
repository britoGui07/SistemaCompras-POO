package br.Model;

public class Produto {
    private int id;
    private String nome;
    private int qtd;      

    public Produto(int id, String nome, int qtd) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
    }

    public int getQtd() { return qtd; }
    public void setQtd(int qtde) { this.qtd = qtde; }

    @Override
    public String toString() {
        return "id:" + id + " | nome:" + nome + " | estoque:" + qtd;
    }
}
