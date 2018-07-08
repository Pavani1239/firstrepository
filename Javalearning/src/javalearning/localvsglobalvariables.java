package javalearning;

public class localvsglobalvariables {
	// these are global variables
	String name="Tom";
	int age= 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// i is local variable in main method
		int i=10;
	System.out.println(i);
	localvsglobalvariables obj=new localvsglobalvariables();
	
	System.out.println(obj.age);
	
	}
	
	public void sum() {
		//i,bare local variables in sum method
		int i=15;
		int b=20;
		System.out.println(i+b);
	}

}
