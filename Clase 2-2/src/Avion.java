// para utilizar una interfaz hay que implementarla (no heredar)
// java hereda de 1 clase
// java implementa cualquier cantidad de interfaces
// contrato - firma de una clase - partes que la componen
//implements x implements Z, se puede implementar las veces que sea
public class Avion implements Flyer {

	
	public Avion() {
		// TODO Auto-generated constructor stub
	}

@Override
public void despegar() {
	System.out.println("Voy rapidísimo");
	
}

@Override
public void aterrizar() {
	System.out.println("Ya llegamos todos");
	
}

}
