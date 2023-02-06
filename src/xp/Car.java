package xp;

public class Car extends Vehicule{
	
	private String carName;

	public Car(String _model, String _name, int _speed) {
		
		super(_model, _name, _speed);

	}
		
	public Car() {
		
	   super();
	
	}

	public void setDetails(String name) { 
		
		this.carName = name;
	  }
	
	public void getDetail(String carName) {
		
		System.out.println(this.toString() + "carName id" + carName);
		 
		
	}

}
