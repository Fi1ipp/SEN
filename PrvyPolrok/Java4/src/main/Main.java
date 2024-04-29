package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean bool	 = true;
		int 	num		 = 25;
		String 	str		 = "String";
		double 	dec 	 = 58.5;
		char	pismenko = 'S';
		
		System.out.println("Zadaj cislo");
		int inputNum = input.nextInt();
		
		for (int i = 0; i < inputNum; i++) {
			System.out.println(i);
		}
		/*
		if( num > 10 ) {
			System.out.println(str);
		}
		else {
			System.out.println(pismenko);
		}
		*/
	}

}
