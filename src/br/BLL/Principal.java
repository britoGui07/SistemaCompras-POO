package br.BLL;

import br.Model.Cliente;
import br.Model.Item;
import br.Model.Produto;
import br.Model.Venda;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "João");
        Cliente cliente2 = new Cliente(2, "Claudião");

        Produto produto1 = new Produto(1, "Tomate",  30);
        Produto produto2 = new Produto(4, "Cenoura", 50);
        Produto produto3 = new Produto(2, "Beterraba", 44);

        System.out.println("=== ESTOQUE INICIAL ===");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);

        Item a1 = new Item(produto1, 10);
        Item a2 = new Item(produto2, 5);
        Item a3 = new Item(produto3, 9);
        Item a4 = new Item(produto3, 5);

        Venda venda1 = new Venda(1, "16/09/2026");
        venda1.setCliente(cliente1);
        
        Venda venda2 = new Venda(2, "17/09/2026");
        venda2.setCliente(cliente2);

        CadVenda cadVenda = new CadVenda();
        cadVenda.adicionarItemComMovimento(venda1, a1);
        cadVenda.adicionarItemComMovimento(venda1, a2);
        cadVenda.adicionarItemComMovimento(venda1, a3);
        cadVenda.CadastrarVenda(venda1);

        System.out.println("\n=== VENDA REGISTRADA ===");
        System.out.println(venda1);
        System.out.println("\n  Itens da venda:");
        for (Item i : venda1.getItens()) {
            System.out.println("    " + i);
        }

        System.out.println("\n=== ESTOQUE APÓS VENDA ===");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        
        cadVenda.adicionarItemComMovimento(venda2, a4);
        cadVenda.CadastrarVenda(venda2);
        
        System.out.println("\n=== VENDA REGISTRADA ===");
        System.out.println(venda2);
        System.out.println("\n  Itens da venda:");
        for (Item i : venda2.getItens()) {
            System.out.println("    " + i);
        }

        System.out.println("\n=== ESTOQUE APÓS VENDA ===");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}
