package br.Model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private String data;
    private Cliente cliente;
    private List<Item> itens;

    public Venda(int id, String data) {
        this.id = id;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<Item> getItens() { return itens; }

    public void addItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    @Override
    public String toString() {
        String nomeCliente = (cliente != null) ? cliente.getNome() : "sem cliente";
        return "Venda #" + id + " | data:" + data +
               " | cliente:" + nomeCliente +
               " | itens:" + itens.size();
    }
}
