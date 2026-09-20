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

    public Venda BuscarVenda(int id) {
        daoVenda = new DaoVenda();
        return daoVenda.Recover(id);
    }

    public void RemoverVenda(Venda venda) {
        daoVenda = new DaoVenda();
        daoVenda.Delete(venda);
    }

    public List<Venda> ListarVendas() {
        daoVenda = new DaoVenda();
        return daoVenda.listar();
    }

    public void adicionarItemComMovimento(Venda venda, Item item) {
        Produto produto = item.getProduto();
        produto.setQtd(produto.getQtd() - item.getQtde());
        venda.addItem(item);
    }
}
