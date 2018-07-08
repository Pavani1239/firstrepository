package javalearning;

public class static_and_nonstatic {
	String name="Tom"; //non static global variable
	static int age= 25; //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling static  methods
		//1-calling directly
		sum();
		//2- calling by classname
		static_and_nonstatic.sum();
		
		//calling static variables
		
		System.out.println(age);
		
		System.out.println(static_and_nonstatic.age);	
		
		//calling non-static method and variables
		//by creating objects
		static_and_nonstatic obj=new static_and_nonstatic();
		obj.sendmail();
		System.out.println(obj.name);
		//obj.sum(); // we can call static method through object reference but the warning will be given
		//System.out.println(obj.age);
		
		
		
		
	}
	
	public void sendmail() {
		System.out.println("sendmail-method");
		
	}
public static void sum() {
	
	System.out.println("sum method");
}
}
