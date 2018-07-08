package oopsconcept2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HsbcBank hs=new HsbcBank();
		hs.credit();
		hs.debit();
		hs.tranfermoney();
		hs.educationloan();
		hs.carloan();
		
		// child class object can be refered by parent interface variable- Dynamic pollymorphysm
		USbankinterface ushs=new HsbcBank();
		ushs.credit();
		ushs.debit();
		ushs.tranfermoney();
		
		
		

	}

}
