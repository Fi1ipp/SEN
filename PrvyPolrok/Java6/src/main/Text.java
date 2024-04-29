package main;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int textLength;
		System.out.println("zadaj text");
		String text = input.nextLine();
		textLength = text.length();
		System.out.println("dlzka textu je "+textLength);
		

	}

}
