package com.kodewala.stringPractice;

import java.util.Scanner;

public class NumberOfConsenent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String con=sc.nextLine();
		int count=0;
		
		for(int i=0;i<con.length();i++) {
			if(con.charAt(i)=='a'||con.charAt(i)=='e'||con.charAt(i)=='i'||con.charAt(i)=='o'||con.charAt(i)=='u') {
				continue;
			}
			count++;
		}
		System.out.println(count);
		
	}

}
