package javalearning;

public class wrapperclassconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		System.out.println(x+20);
		//data conversion from string to integer
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		String y="12.33";
		
		System.out.println(x+20);
		//data conversion from string to integer
		double d= Double.parseDouble(y);
		
		System.out.println(d+20);
		
		String a ="True";
		boolean b= Boolean.parseBoolean(a);
		

		System.out.println(b);
		
		int j=200;
		
		System.out.println(j+20);
	// data conversion from int to string	
		String k= String.valueOf(j);
		System.out.println(k+20);
		
		String w="100b";
				Integer.parseInt(w); // number format exception error will come
				
		
		
		

	}

}
