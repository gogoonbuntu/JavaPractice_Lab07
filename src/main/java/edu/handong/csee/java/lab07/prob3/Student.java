package edu.handong.csee.java.lab07.prob3;

import java.util.Random;

public class Student 
{
	String name;
	int grade;
	int id;
	int atd;
	public Student() {
		name="";
		grade=0;
		id=0;
		Random randomGen = new Random();
		atd=randomGen.nextInt(10);
	}
	
	public void setter(String i, int j, int k)
	{
		name=i;
		grade=j;
		id=k;
	}
	
	public String getN() 
	{
		return name;
	}
	
	public int getG()
	{
		return grade;
	}
	
	public int getI()
	{
		return id;
	}
	public int getA()
	{
		return atd;
	}
	
}
