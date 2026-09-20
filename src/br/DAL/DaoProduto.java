package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Produto;

public class DaoProduto {
    List<Produto> tabelaProduto = new ArrayList<>();

    public void Create(Produto produto) {
        tabelaProduto.add(produto);
    }

    public void Delete(Produto produto) {
        tabelaProduto.remove(produto);
    }

    public void Update(Produto produto) {
        Produto busca = Recover(produto.getId());
        busca.setId(produto.getId());
        busca.setNome(produto.getNome());
        busca.setQtd(produto.getQtd());
    }

    public Produto Recover(int id) {
        for (Produto p : tabelaProduto) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public List<Produto> listar() {
        return tabelaProduto;
    }
}
