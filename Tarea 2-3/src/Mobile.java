//Juan Daniel Rubio Camacho A01633924
public class Mobile extends Computer {

	public Mobile(double velocidadProcesador, String modeloProcesador) {
		super(velocidadProcesador, modeloProcesador);
	}

	public void writeCode() {
		System.out.println("C�digo escrito desde dispositivo m�bil");
	}
	
	public void sendMail(double tiempoDeEnvio) {
		super.sendMail(tiempoDeEnvio);
		System.out.println("�Eh we, nos est�n hackeando! �Detengan todo!");
	}

}
