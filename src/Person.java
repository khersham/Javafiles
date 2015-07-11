
public class Person {
	String name;
	int age;
	
	public static int number = 0;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		number +=1;
	}
	
	public Person(){
		this("",0);
	}
	
	public void sayHello(){
		System.out.println("Hello, my name is " + this.name);
	}
	
	public void sayNumber(){
		System.out.println(number + " persons exist in this world");
	}
}
