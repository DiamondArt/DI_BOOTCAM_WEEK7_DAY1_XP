package xp;

public class Vehicule {
	private String model;
	private String name;
	private  double speed;
	
	
	public Vehicule() {
		super();
		this.model = "Roadster";
		this.speed = 54.000;
		this.name = "Mercedes";
		// TODO Auto-generated constructor stub
	}
	

	public Vehicule(String model, String name, double speed) {
		super();
		this.model = model;
		this.name = name;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicule [model=" + model + ", name=" + name + ", speed=" + speed + "]";
	}
	
	
	
	 
	

}
