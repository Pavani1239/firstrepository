package javalearning;

public class car {
	// class variables
	int year;
	int cylinder;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new car is an object
		// a is reference of  the object
car a= new car();
car b=new car();
car c= new car();

a.year=2018;
a.cylinder=6;

b.year=2017;
b.cylinder=4;

c.year=2016;
c.cylinder=2;
System.out.println("before references");
System.out.println(a.year);
System.out.println(a.cylinder);

System.out.println(b.year);
System.out.println(b.cylinder);

System.out.println(c.year);
System.out.println(c.cylinder);

a=b;
b=c;
c=a;
System.out.println("After references");
System.out.println(a.year);
System.out.println(a.cylinder);

System.out.println(b.year);
System.out.println(b.cylinder);

System.out.println(c.year);
System.out.println(c.cylinder);




		
	}

}
