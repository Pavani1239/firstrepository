package javalearning;

public class twodimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][]=new String[3][4];
		System.out.println("no. of rows"+x.length);  //no of rows
		System.out.println("no. of column"+x[0].length);  //no of columns
		System.out.println("no. of column"+x[1].length);  //no of columns
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
										
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		
		System.out.println(x[1][1]);
		
		//print all values in a two dimentional array
		
		for(int row=0; row<x.length; row++) {
			
			for(int col=0; col<x[0].length; col++) {
				
				System.out.println(x[row][col]);
				
			}
		}
	}

}
