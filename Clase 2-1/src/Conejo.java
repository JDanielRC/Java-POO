
public class Conejo extends Animal {

	public Conejo(String nombre, int edad) {
		super(nombre, edad);
		
	}

	//sobreescribiendo O implementando metodo abstracto
	public void comer() {
		System.out.println("m�chm m�chm m�chm");
	}

}
