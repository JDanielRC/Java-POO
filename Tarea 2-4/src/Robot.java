//Juan Daniel Rubio Camacho A01633924
public class Robot {
	
	protected String model;
	protected int year;
	protected String name;
	
	public String getModel() {
		
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getName() {
		return name;
	}
	
	public Robot(String model, int year, String name) {
		super();
		this.model = model;
		this.year = year;
		this.name = name;
	}
	
}
