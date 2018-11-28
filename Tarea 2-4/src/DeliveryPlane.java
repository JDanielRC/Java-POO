//Juan Daniel Rubio Camacho A01633924
public class DeliveryPlane implements Transporter {

	private String model;
	private int year;
	private float maximumSpeed;
	
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public float getMaximumSpeed() {
		return maximumSpeed;
	}
	public DeliveryPlane(String model, int year, float maximumSpeed) {
		super();
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	@Override
	public float calculateSpeed() {
		return this.maximumSpeed*.8f;
	}
	@Override
	public String stateYourName() {
		return this.model;
	}
	
	

}
