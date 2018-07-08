package javalearning;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading obj= new methodoverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20,30);

	}
	//method over loading means creating same name methods with different input parameters
	
	public void sum() { // sum method with no input parameters
		System.out.println("sum method");
	}
	
	
		
		public void sum(int i) { // sum method with one input parameters
			System.out.println("sum method with"+i);
		}
		
		public void sum(int i, int j) { // sum method with two input parameters
			System.out.println("sum method with-"+(i+j));
		}
			
	}

//Notes: we can overload main method with different datatypes and input parameters

//Ex: public static void main(String[] args) {

////Ex: public static void main(int[] args) { 

