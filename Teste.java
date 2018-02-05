
public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3,2);
		AreaCalculavel b = new Circulo (2);
		System.out.println("Retangulo " + a.calculaArea());		
		System.out.println("Circulo " +b.calculaArea());
		
	}
}
