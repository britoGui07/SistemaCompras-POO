package br.BLL;

import java.util.List;

import br.DAL.DaoVenda;
import br.Model.Cliente;
import br.Model.Item;
import br.Model.Produto;
import br.Model.Venda;

public class CadVenda {
    DaoVenda daoVenda;

    public void CadastrarVenda(Venda venda) {
        if (venda != null) {
            daoVenda = new DaoVenda();
            daoVenda.Create(venda);
        }
    }

    public void adicionarItemComMovimento(Venda venda, Item item) {
        Produto produto = item.getProduto();
        produto.setQtd(produto.getQtd() - item.getQtde());
        venda.addItem(item);
    }
}
