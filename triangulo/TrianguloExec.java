package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo a;
		Triangulo b;
		
		a = new Triangulo();
		b = new Triangulo();
		
		entrada(a);						
			if(a.validar()==true){
				
				System.out.println(a.toString());			
				
			}else {
				System.out.println("\nOs lados informados não são de um triângulo.\n\n");
			}
			
			entrada(b);
		
			if(b.validar() == true) {
				System.out.println(b);
				
				
			}else {
				System.out.println("\nOs lados informados não são de um triângulo.\n\n");
			}
				
			
	}
	
	public static void entrada(Triangulo lado) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor dos lados:");
		
		lado.x = sc.nextDouble();
		lado.y = sc.nextDouble();
		lado.z = sc.nextDouble();
		
	}

}
