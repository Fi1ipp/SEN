package main;

import java.util.Random;
import java.util.Scanner;

public class PodmienkyRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Koľko krat sa zopakuje?");
		int cyklus = input.nextInt();
		
		int randomNum=0;
		
		for (int i = 0; i < cyklus; i++) {
			randomNum = random.nextInt(1000)+1;
			System.out.println(randomNum);
		}
		
		if (randomNum %2 == 0 && randomNum < 100) {
			System.out.println("Cislo je parne");
		}

	}

}
