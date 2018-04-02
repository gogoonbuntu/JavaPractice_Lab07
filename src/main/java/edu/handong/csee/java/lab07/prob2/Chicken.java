package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	
	String name;
	int price;
	int rating;
	public Chicken() 
	{
		price=0;
		rating=0;
		name="";
	}
	public void Setter(String i, int j, int k) 
	{
		name=i;price=j;rating=k;
	}
	
	public String getN()
	{
		return name;
	}
	public int getR()
	{
		return rating;
	}
	public int getP()
	{
		return price;
	}
	public void Rating(int j)
	{
		rating=j;
	}
}
