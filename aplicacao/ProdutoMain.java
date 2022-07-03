package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class ProdutoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informar os dados do produto:");
		System.out.print("Nome:");
		String nome = sc.next();
		System.out.print("Quantidade");
		int quantidade = sc.nextInt();
		System.out.print("Preço:");
		double valor = sc.nextDouble();
		
		Produto celular = new Produto(nome, valor, quantidade);
		System.out.println(celular.nome);
		System.out.println(celular.quantidade);
		System.out.printf("R$ %.2f\n",celular.valorUnitario);
		
		
		System.out.printf("Imposto:R$ %.2f\n", celular.valorImposto());
		System.out.printf("Totalm em estoque:R$ %.2f\n", celular.valorEstoque());
		
		sc.close();
	}

}
 