
public class ClaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola");
		Conejo c = new Conejo("Adolfo", 2);
		Tigre t = new Tigre("Juan Carlos", 3);
		
		Animal a = c;
		Animal a2 = t;
		
		a.comer();
		a2.comer();
	}

}
