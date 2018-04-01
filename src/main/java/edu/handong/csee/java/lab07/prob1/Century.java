package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class Century {
	public static void main(String [] args) {
		int whatyear;
		System.out.println("Input year :");
		Scanner kbd = new Scanner(System.in);
		whatyear = kbd.nextInt();
		kbd.close();
		CenturyMath ctm = new CenturyMath();
		ctm.CentryRcv(whatyear);
		ctm.CentryRes();
	}
	
}
