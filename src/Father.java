public class Father extends Person{
	public Father(String name, int age){
		super(name, age);
	}
	
	public void sayHello(){
		System.out.println("Hi, I am the old " + this.name);
	}

}