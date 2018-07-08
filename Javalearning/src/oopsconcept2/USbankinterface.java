package oopsconcept2;

public interface USbankinterface {

	int min_bal = 3000;
	//only method declaration in interface
	// value of variable will not be changed in interface- staic in nature
	//no static method in interface
	//no main method in interface
	// we can not create the object of interface
	// interface is abstract in nature.
	public void credit();
	public void debit();	
	public void tranfermoney();
	
	
}
