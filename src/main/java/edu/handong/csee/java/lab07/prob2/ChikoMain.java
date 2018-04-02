package edu.handong.csee.java.lab07.prob2;

public class ChikoMain {

	public static void main(String[] args) {
		Chicken CM = new Chicken();
		Chicken HM = new Chicken();
		Chicken SC = new Chicken();
		
		CM.Setter("Cheese_mustard", 18000, 0);
		HM.Setter("Honey_mustard", 17500, 0);
		SC.Setter("Sweet_chilly", 18500, 0);
		
		CM.Rating(3);
		HM.Rating(4);
		SC.Rating(1);
		
		System.out.println(CM.getN()+"'s rating is "+CM.getR());
		System.out.println(HM.getN()+"'s rating is "+HM.getR());
		System.out.println(SC.getN()+"'s rating is "+SC.getR());
		
	}

}
