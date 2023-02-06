package xp;

public class Laptop extends Computer {
		
	private int ram;

	public Laptop()
	{
		super();
	}


	public Laptop(String _name, String _type, double price)
	{
		super(_name, _type, price);
		this.ram = 4;
	}
	
	public Laptop(String _name, String _type, double price, int _ram)
	{
		super(_name, _type, price);
		this.ram = _ram;
	}
	

	public String toString()
	{
		return super.toString() + "    memoire Ram: " + ram;	
	}
	
	

}
