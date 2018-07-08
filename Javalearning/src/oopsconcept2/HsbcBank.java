package oopsconcept2;

public class HsbcBank implements USbankinterface, BrazilBank {
	
	// if a class is implementing its compulsery to implement interface method

	// these 3 methods from USBANK interface
	public void credit() {
		
		System.out.println("Hsbc credit");
	}
	
public void debit() {
	System.out.println("Hsbc debit");
}
	
public void tranfermoney() {
	System.out.println("Hsbc moneytransfer");
}
// These 2 methods are hsbc bank
public void educationloan() {
	System.out.println("Hsbc educationloan");
}
public void carloan() {
	System.out.println("Hsbc carloan");
}
// this methode is from BrazilBank
public void mutualfund() {
	System.out.println("brazil Mutual fund");
}
}
