//Juan Daniel Rubio Camacho A01633924
public abstract class Computer {
	
	private double velocidadProcesador;
	private String modeloProcesador;
	
	
	public double getVelocidadProcesador() {
		return velocidadProcesador;
	}


	public String getModeloProcesador() {
		return modeloProcesador;
	}


	public Computer(double velocidadProcesador, String modeloProcesador) {
		super();
		this.velocidadProcesador = velocidadProcesador;
		this.modeloProcesador = modeloProcesador;
	}

	public void sendMail() {
		System.out.println("Correo enviado!");
	}
	
	public void sendMail(String destinatario) {
		System.out.println("Correo enviado para " + destinatario);
	}
	
	public void sendMail(double tiempoDeEnvio) {
		System.out.println("El correo envió en un plazo de " + tiempoDeEnvio + " milisegundos");
	}
	
	public abstract void writeCode();

	
}
