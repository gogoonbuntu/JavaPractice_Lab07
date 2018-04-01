package edu.handong.csee.java.lab07.prob1;

public class CenturyMath {
	int year;
	public void CentryMath()
	{
		year=0;
	}
	public void CentryRcv(int yeartime)
	{
		year = yeartime;
	}
	public void CentryRes()
	{
		int ctn = 0, ndn=0;
		String i = String.valueOf(year);
		String ct = i.substring(0, i.length()-2);
		String nd = i.substring(2,4);
		System.out.println(ct+"and"+nd);
		ctn = Integer.parseInt(ct);
		ndn = Integer.parseInt(nd);
		if(ndn==0){}
		else {ctn++;}
		System.out.println(year+" is "+ctn+"th century.");
	}
	
}
