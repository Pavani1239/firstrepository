package oopsconcept2;

public class testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// when same name method is present in parent class and child class, java will (override the parentmethode with child methode )give preference to child method.. this is called inheritence methode overriding
		
	// this is called static polymorhysm.. one to many	
		bmw b=new bmw();
		b.start();
		b.stop();
		b.refill();
		b.theftsafety();
		b.engine();
		
		car c=new car();
		c.start();
		c.stop();
		c.refill();
		c.engine();
		
		// child class object can be refered by parent class reference variable is called dynamic pollymorphysm or runtime pollymorphysm
		
		car c1=new bmw();
		
		c1.stop();
		c1.start();
		c1.refill();
		c.engine();
		
		// child class objects can be rfered by parent interface reference
		
		
		
		
		
	}

}
