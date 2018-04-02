package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

/**
 * @author SeungYoung Jung.
 * I tried to use different method from doing Math, but using String.
 */
public class Century {
	public static void main(String [] args) {
		int whatyear;
		System.out.println("Input year :");
		Scanner kbd = new Scanner(System.in); //Receive input.
		whatyear = kbd.nextInt();
		kbd.close();
		CenturyMath ctm = new CenturyMath(); //Initiating constructor.
		ctm.CentryRcv(whatyear); //give the input to the constructor.
		ctm.CentryRes(); //Prints out the result.
	}
	
}
