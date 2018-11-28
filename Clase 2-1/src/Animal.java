//clase abstracta
// - un tipo de clase 
// - PUEDE tener m�todos abstractos (por definir)
// - NO PUEDE inicializarse, no existe new, no se puede hacer
// - para ser utilizada debe heredarse
// - objetos solo por medio de polimorfismo

public abstract class Animal {

	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public void nacer() {
		System.out.println("hola vida");
	}
	
	//abstract
		
	//m�todo abstracto
	// - definicion de un metodo
	// - solamente tiene la firma
	// qu� pero no c�mo
	// - una actividad que todos los miembros del grupo pueden hacen PERO
	// cada subconjunto hace distintos
	
	public abstract void comer();
}
