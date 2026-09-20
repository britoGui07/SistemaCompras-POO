package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Cliente;
import br.Model.Produto;
import br.Model.Venda;

public class DataBase {
    public List<Produto>  tabelaProduto  = new ArrayList<>();
    public List<Cliente>  tabelaCliente  = new ArrayList<>();
    public List<Venda>    tabelaVenda    = new ArrayList<>();
}
