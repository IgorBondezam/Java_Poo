package aplicacao;

import java.util.Scanner;

import entidade.Veiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int pas;
		double tanque, consumo, km, valor;
		
		System.out.println("\nQuantidade de passageiros:");
		pas = sc.nextInt();
		System.out.println("Capacidade de tanque:");
		tanque = sc.nextDouble();
		System.out.println("Consumo por litro:");
		consumo = sc.nextDouble();
		System.out.println("Distância em km:");
		km = sc.nextDouble();
		System.out.println("Valor do combustível:");
		valor = sc.nextDouble();
		
		
		Veiculo gurgel = new Veiculo(pas, tanque, consumo);
		System.out.println(gurgel.ToString());
		
		double tanques = gurgel.tanqueViagem(km);
		double rateiro = gurgel.dividirDispesas(km, valor);
		System.out.printf("Para a viagem vamos precisar de %.1f tanque(s) e cada passageiro contribuirá com R$ %.2f", tanques, rateiro);
		
		
		sc.close();
	}

}
