package xp;

public class Smartphone extends Computer {
	
	private boolean isAndroid;

	public Smartphone(String name, String type) {
		super();
		this.isAndroid = true;
	}

	public Smartphone(String name, String type, double price,boolean _isAndroid) {
		super(name, type, price);
		this.isAndroid = _isAndroid;
	}
	
	public String toString()
	{
		return super.toString() + "This phone is android: " + isAndroid;	
	}
	
	
}
