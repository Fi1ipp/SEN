package main;

import java.util.Scanner;

public class SwitchStart {

	public static void main(String[] args) {
		
		//green, yellow, cyan, blue, purple
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Zadaj farbu po anglicky");
		String farba = input.nextLine();
		
		switch (farba) {
		case "green":
			System.out.println("zelena");
			break;
			
		case "purple":
			System.out.println("fialova");
			break;
			
		case "yellow":
			System.out.println("zlta");
			break;
			
		case "cyan":
			System.out.println("taka modro zelena");
			break;
			
		case "blue":
			System.out.println("modra");
			break;

		default: System.out.println("spatnu farbu si dal");
			break;
		}

	}

}
