//Juan Daniel Rubio Camacho A01633924
public class DeliveryDrone extends Robot implements Transporter {
	
	private float speed;

	public DeliveryDrone(String model, int year, String name, float speed) {
		super(model, year, name);
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public float calculateSpeed() {
		return this.speed;
	}

	@Override
	public String stateYourName() {
		return this.name;
	}
	

	

}
