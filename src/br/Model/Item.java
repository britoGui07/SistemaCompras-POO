package br.Model;

public class Item {
    private Produto produto;
    private int qtd;

    public Item(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() { return produto; }

    public int getQtde() { return qtd; }

    @Override
    public String toString() {
        return produto.getNome() + " | quantidade:" + qtd;
    }
}
