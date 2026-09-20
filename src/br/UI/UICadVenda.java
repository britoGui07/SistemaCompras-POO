package br.UI;

import java.util.List;
import java.util.Scanner;

import br.Model.Item;
import br.Model.Venda;

public class UICadVenda {
    Scanner leitor = new Scanner(System.in);

    public int pedirId(String label) {
        System.out.print(label);
        return leitor.nextInt();
    }

    public int pedirQtd() {
        System.out.print(" quantidade: ");
        return leitor.nextInt();
    }

    public void mostrarVenda(Venda venda) {
        System.out.println("=====VENDA #" + venda.getId() + "=====");
        for (Item i : venda.getItens()) {
            System.out.println("  " + i);
        }
    }

    public void listarVendas(List<Venda> lista) {
        System.out.println("===LISTA DE VENDAS====");
        for (Venda v : lista) {
            System.out.println(v);
        }
        System.out.println("----------------------");
    }
}
