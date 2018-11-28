//Juan Daniel Rubio Camacho A01633924
public class Main {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(2.5, "i3");
		Computer c1 = m1;
		
		c1.writeCode();
		c1.sendMail();
		c1.sendMail(1200);
		c1.sendMail("Javier");
		System.out.println(c1.getVelocidadProcesador());
		System.out.println(c1.getModeloProcesador());
		System.out.println(m1.getVelocidadProcesador());
		System.out.println(m1.getModeloProcesador());
	}

}
