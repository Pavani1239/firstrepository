package oopsconcept2;

import java.util.ArrayList;

public class ArraylistConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arl=new ArrayList();
		
		arl.add(100); //0 index
		arl.add(200); //1 index
		arl.add(300); //2 index
				arl.add("aaa");
		arl.add(29.78);
		System.out.println(arl.get(2));
		System.out.println(arl.size());
arl.remove(2);
		System.out.println(arl.size());
		System.out.println(arl.get(2));
		
		for(int i=0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
			
		}
		ArrayList <Integer> ar2= new ArrayList<Integer>();
		
		ar2.add(1);

		System.out.println(ar2.size());	
		
		
	}

}
