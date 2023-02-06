package xp;

public class Main {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1.distance(5, 6));
		
		Person person = new Person("John", "Wick", "john@wick.com", 55);
		System.out.println(person);

		Car myCar = new Car();
		myCar.getDetail("Range rover");
		
		Laptop c = new Laptop( "Dell", "Inspiron", 449.99, 16 );
		System.out.println(c);

		Smartphone tecno = new Smartphone("Tecno Camon 16","Phone",449.99, true );
		System.out.println(tecno);
		
	}

}
