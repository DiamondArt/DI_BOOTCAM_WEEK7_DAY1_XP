package xp;

public class Person {
	private String name;
	private String lastname;
	private String email;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String lastname, String email, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person {name=" + name + ", lastname=" + lastname + ", email=" + email + ", age=" + age + "}";
	}
	
	
}
