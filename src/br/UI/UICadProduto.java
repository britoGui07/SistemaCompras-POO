package br.UI;

import java.util.List;
import java.util.Scanner;

import br.Model.Produto;

public class UICadProduto {
    Scanner leitor = new Scanner(System.in);

    public Produto cadastrarProduto() {
        System.out.println("====CADASTRO DE PRODUTO====");
        System.out.print("\n id: ");
        int id = leitor.nextInt();
        System.out.print(" nome: ");
        String nome = leitor.next();
        System.out.println(" quantidade: ");
        int qtd = leitor.nextInt();

        Produto produto = new Produto(id, nome, qtd);
        produto.setId(id);
        produto.setNome(nome);
        produto.setQtd(qtd);

        return produto;
    }

    public void mostrarProduto(Produto produto) {
        System.out.println("=====PRODUTO======");
        System.out.println(produto);
        System.out.println("------------------");
    }

    public Produto atualizarProduto(Produto produto) {
        System.out.println("====ATUALIZAR PRODUTO====");
        mostrarProduto(produto);
        System.out.print("\n id: ");
        int id = leitor.nextInt();
        System.out.print(" nome: ");
        String nome = leitor.next();
        System.out.println(" quantidade: ");
        int qtd = leitor.nextInt();

        produto.setId(id);
        produto.setNome(nome);
        produto.setQtd(qtd);

        return produto;
    }

    public boolean excluirProduto(Produto produto) {
        System.out.println("=====EXCLUIR PRODUTO====");
        mostrarProduto(produto);
        System.out.print("Deseja excluir o produto? (S)im - (N)ão: ");
        String resposta = leitor.next();
        return resposta.equalsIgnoreCase("S");
    }

    public void listarProdutos(List<Produto> lista) {
        System.out.println("===LISTA DE PRODUTOS====");
        for (Produto p : lista) {
            System.out.println(p);
        }
        System.out.println("------------------------");
    }
}
