package javalearning;

public class callByvalue_callByReference {
int p;
int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callByvalue_callByReference obj= new callByvalue_callByReference();
		int x=10;
		int y=20;
		obj.test(x,y); // call by value
		
		obj.p=200;
		obj.q=400;
		
				
	
	}
	public int test(int a, int b) {
		a=15;
				b=25;
				int c=a+b;
		return c;
		
		
	}

}
