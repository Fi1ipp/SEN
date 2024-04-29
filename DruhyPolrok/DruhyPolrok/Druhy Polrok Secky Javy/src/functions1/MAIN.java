package functions1;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Help helper = new Help();
		
		helper.pozdrav();
		
		helper.odsek();
		
		System.out.println("Zadaj stranu Stvorca");
		helper.obvodStvorca(5);
		
		helper.odsek();
		
		System.out.println("Zadaj polomer Kruhu");
		System.out.println("Obsah kruhu je "+helper.obsahKruhu(5));
	
		helper.odsek();
		
		System.out.println("Zadaj cislo");
		helper.zisziParneCisla(5);
		
		helper.odsek();
		
		System.out.println("Zadaj sumu");
		System.out.println(helper.vypocetDPH(5));
		
		helper.odsek();
		
		helper.overenieCisla();
	}

}
