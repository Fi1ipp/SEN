package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("zadaj číslo");
		int x = input.nextInt();
		System.out.println("tretia mocnina je "+x*x*x);
	}

}
