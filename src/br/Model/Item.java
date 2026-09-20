package br.Model;

public class Item {
    private Produto produto;
    private int qtd;

    public Item(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public int getQtde() { return qtd; }
    public void setQtde(int qtd) { this.qtd = qtd; }

    @Override
    public String toString() {
        return produto.getNome() + " | quantidade:" + qtd;
    }
}
