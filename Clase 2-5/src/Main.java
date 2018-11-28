
public class Main {

	public static void main(String[] args) {

		// arreglos
		// estructura de datos lineal
		// tamaño definido
		
		int[] arreglito = {24, 25, 26, 27}; //si modificase el tamaño de este todos los datos se mueren
		int[] arr2 = new int[5];
		
		arr2 = new int[10]; //esto hace que la otra referencia se "muera", osea ya no hace ni es nada
		
		// el indice empieza en 0
		// motivo: referencia del arreglo + (tamaño * indice)
		// arreglos son referencias
		
		for(int i=0; i < arreglito.length; i++) {
			System.out.println(arreglito[i]);
		}
		
		
		
		//tipos genéricos
		
		Contenedor<String, String, Integer> c1 = new Contenedor<String, String, Integer>("a", "b", 5); //el constructor tenia parametros T, U, V
		//pero se conviertieron a strings con la asignación adentro de los <> 
		
		System.out.println(c1.getCarga());
		
		// Contenedor<int, float, double> c2; no se puede realizar con datos primitivos, pero para eso Java tiene...
		
		//autoboxin - cambio transparente entre un primitivo y su clase correspondiente
		Contenedor<Integer, Float, Double> c2;
		c2 = new Contenedor<Integer, Float, Double>(5, 2.0f, 3.1); // se puede hacer new Integer(5);, pero es lo mismo que el 5 solo, porque Java lo convierte de manera automatica
		System.out.println(c2.getCarga());
	}

}
