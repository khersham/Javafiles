
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sam = "Sam";
		Person p1 = new Person(sam, 28);
		Father p2 = new Father("Matt", 68);
		p1.sayHello();
		p2.sayHello();
		p1.sayNumber();
	
		Sumf num = new Sumf(12.5, 17.7);
		System.out.println(num.result());
		
	}

}
