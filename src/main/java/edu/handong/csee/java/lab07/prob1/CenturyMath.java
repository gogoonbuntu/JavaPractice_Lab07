package edu.handong.csee.java.lab07.prob1;

public class CenturyMath {
	int year;
	public void CentryMath() // initialize the "year"
	{
		year=0;
	}
	public void CentryRcv(int yeartime) //Rcv stands for Receive.
	{
		year = yeartime;
	}
	public void CentryRes() //Res stands for Result.
	{
		int ctn = 0, ndn=0;
		String i = String.valueOf(year); //Change the "year" into String.
		String ct = i.substring(0, i.length()-2); //Read First two number from the string.
		String nd = i.substring(2,4); //Read last two number from the string.
		ctn = Integer.parseInt(ct); //then Integerize the substrings.
		ndn = Integer.parseInt(nd); //the second one too.
		if(ndn==0){} //if last two number of the year is 00, century stays as it is.
		else {ctn++;} //if not, century should be plused one.
		System.out.println(year+" is "+ctn+"th century."); //give out the result!
	}
	
}
