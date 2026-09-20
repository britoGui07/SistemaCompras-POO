package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Venda;

public class DaoVenda {
    List<Venda> tabelaVenda = new ArrayList<>();

    public void Create(Venda venda) {
        tabelaVenda.add(venda);
    }

}
