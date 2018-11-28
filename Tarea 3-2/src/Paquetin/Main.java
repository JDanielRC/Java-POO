package Paquetin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursividad r1 = new Recursividad();
		
		r1.contar(1, 10);
		
		String[] arreglo = {"A", "B", "C", "D"};
		
		r1.recorrerArreglo(arreglo);
		
		System.out.println(r1.sumatoria(1, 5));
		System.out.println(r1.factorial(150));
	}
}
