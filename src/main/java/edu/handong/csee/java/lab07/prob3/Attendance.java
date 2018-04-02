package edu.handong.csee.java.lab07.prob3;

public class Attendance {

	public static void main(String[] args) {
		Student[] K = new Student[4];
		Student A = new Student(); K[0]=A;
		Student B = new Student(); K[1]=B;
		Student C = new Student(); K[2]=C;
		Student D = new Student(); K[3]=D;
		
		A.setter("Jess", 4, 21400999);
		B.setter("Kent", 2, 21700111);
		C.setter("Lucas", 1, 21800222);
		D.setter("Martha", 2, 21700333);
		
		for(int i=3;i>=0;i--)
		{
			if(K[i].getA()>6)
			{
				System.out.println("I'm sorry, "+K[i].getN()+", You failed this course because you had "+K[i].getA()+" times of absence.");
			}
			else
			{
				System.out.println("Good, "+K[i].getN()+", You Passed this course.");
			}
		}
	}

}
