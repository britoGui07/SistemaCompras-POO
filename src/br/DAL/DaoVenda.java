package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Venda;

public class DaoVenda {
    List<Venda> tabelaVenda = new ArrayList<>();

    public void Create(Venda venda) {
        tabelaVenda.add(venda);
    }

    public void Delete(Venda venda) {
        tabelaVenda.remove(venda);
    }

    public Venda Recover(int id) {
        for (Venda v : tabelaVenda) {
            if (v.getId() == id) return v;
        }
        return null;
    }

    public List<Venda> listar() {
        return tabelaVenda;
    }
}
