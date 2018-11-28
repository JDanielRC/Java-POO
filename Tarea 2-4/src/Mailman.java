//Juan Daniel Rubio Camacho A01633924
public class Mailman implements Transporter {
	
	private String name;

	public String getName() {
		return name;
	}

	public Mailman(String name) {
		super();
		this.name = name;
	}
	
	public void deliverMail() {
		System.out.println("Entregando el correo");
	}

	@Override
	public float calculateSpeed() {
		return 5;
	}

	@Override
	public String stateYourName() {
		return this.getName();
	}
	
}
