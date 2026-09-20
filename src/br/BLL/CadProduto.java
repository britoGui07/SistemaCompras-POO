package br.BLL;

import java.util.List;

import br.DAL.DaoProduto;
import br.Model.Produto;

public class CadProduto {
    DaoProduto daoProduto;

    public void CadastrarProduto(Produto produto) {
        if (produto != null) {
            daoProduto = new DaoProduto();
            daoProduto.Create(produto);
        }
    }

    public Produto BuscarProduto(int id) {
        daoProduto = new DaoProduto();
        return daoProduto.Recover(id);
    }

    public void RemoverProduto(Produto produto) {
        daoProduto = new DaoProduto();
        daoProduto.Delete(produto);
    }

    public void UpdateProduto(Produto produto) {
        daoProduto = new DaoProduto();
        daoProduto.Update(produto);
    }

    public List<Produto> ListarProdutos() {
        daoProduto = new DaoProduto();
        return daoProduto.listar();
    }
}
