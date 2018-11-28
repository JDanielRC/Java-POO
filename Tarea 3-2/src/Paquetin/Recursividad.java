package Paquetin;

public class Recursividad {
	
	//recursion - repeticion de codigo
	// iteracion (es la competencia) (loops)
	// - loops como for y while
	//recursividad - metodo que se invoca a si mismo
	
	// ejemplo 1, imprimir del 1 al 10, o del A al B
	
	//desventaja - abarca m�s memoria que iteraci�n
	
	public void contar(int a, int b) {
		
		//caso base - condicion que rompe la recursividad
		if (a>b) {
			return; //con esto se detiene la ejecuci�n
		}
		
		System.out.println(a + "");
		contar(a+1, b);
	}
	
	public void recorrerArreglo(String[] arreglo) {
		recorrerArreglo(arreglo, 0); //este metodo sirve para que el usuario no tenga que darnos tantos datos
	}
	
	public void recorrerArreglo(String[] arreglo, int indice) {
		
		// siempre es bueno que de primer paso escribamos el caso base
		if(indice == arreglo.length) {
			return;
		}
		// podemos tener m�s de un caso base
		System.out.println(arreglo[indice]);
		// al invocar el m�todo de vuelta, asegurarse que haya desplazamiento num�rico o de referencia (el +1)
		recorrerArreglo(arreglo, indice + 1);
	}
	
	public int sumatoria(int a, int b) {
		if (a == b) {
			return a;
		}
		return a + sumatoria(a + 1, b);
	}
	
	public double factorial(double n) {
		if(n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
