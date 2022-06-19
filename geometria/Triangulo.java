package geometria;

public class Triangulo {
	
	
	public double x;
	public double y;
	public double z;
	public String tipo;
	
	public boolean validar() {
		if(Math.abs(x-y) < z && z < (x + y)) {
			return true;			
		}else {
			return false;
		}
	}
	
	public String classificar() {
		if(x == y && y == z) {
			tipo = "equilátero";
		}else if(x == y || x == z || y == z){
			tipo = "isóceles";
		}else {
			tipo = "escaleno";
		}
		return tipo;
	}
	
	public double peri() {
		
		return (x+y+z)/2;
		
	}
	
	public double area() {
		return Math.sqrt(peri()*(peri() - x)*(peri()-y)*(peri()-z));
	}
	
	public String toString() {
		return "\nOs lados " + x +", " + y +", "+ z + " formam um triângulo " + classificar() + "." +
		"\nO perímetro do triângulo é "+ String.format("%.2f", peri()) + "." + 
		"\nA área desse triângulo é "+ String.format("%.2f", area()) + ".\n\n";
	}
	
}
