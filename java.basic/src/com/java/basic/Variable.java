package com.java.basic;

public class Variable {

	public static void main(String[] args) {
		
		int kor = 98;
		int math = 71;
		int eng = 100;
		int scien = 32;
		int SUBNUM = 4;
		
		int total;
		double avg;
		
		total = kor + math + eng + scien;
		avg = total / (double) SUBNUM;
		
		System.out.println(avg);
		System.out.println(1/5); // (/)연산자는 몫을 구하는건디..
		
		

	}

}
