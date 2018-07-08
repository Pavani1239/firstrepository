package javalearning;

public class functionsinJava {

	//starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//functions and methods both are same
		
		//discuss about non static method
		
		//there are 3 types of methods- 1.no input,no output, 2-no input some output
		//3- input, and output method
		
		functionsinJava obj = new functionsinJava();
		obj.noio();
		int l=obj.outputmethod();
		System.out.println(l);
		int m=obj.iomethod(16, 8);
		
		System.out.println(m);
		
	}
		public void noio() {
			
			System.out.println("method1-no inputout");
		}
		
		public int outputmethod() {
			
			int p=10;
			int q=20;
			int r=p+q;
			System.out.println("output method");
				
			return r;
			
		}
		
		public int iomethod(int x, int y) {
			
			int d= x/y;
			
			
			System.out.println("input and out put method");
			return d;
			
				
		}
		
		

	}


