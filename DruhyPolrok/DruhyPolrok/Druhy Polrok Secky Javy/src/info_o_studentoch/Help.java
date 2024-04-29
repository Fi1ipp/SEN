package info_o_studentoch;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Help {
	Scanner input = new Scanner(System.in);
	Random rng = new Random();
	double D,Ch;
	int vek=0;
	
	public void pocetDCh() {
		System.out.println("Kolko je Dievcat?");
		D = input.nextInt();
		System.out.println("Kolko je Chlapcov?");
		Ch = input.nextInt();
	}
	
	public double pocetZiakov() {
		return D+Ch;
	}
	
	public void rozdielPercenta() {
		double percentD,percentCh;
		
		System.out.println("");
		
		System.out.println(D+" = Pocet Dievcat");
		System.out.println(Ch+" = Pocet Chlapcov");
		System.out.println(pocetZiakov()+"= Pocet Ziakov");
		
		System.out.println("");
		
		
		percentD = D/pocetZiakov()*100;
		System.out.println(percentD+"% Dievcat");
		
		percentCh = Ch/pocetZiakov()*100;
		System.out.println(percentCh+"% Chlapcov");
		
	}
	
	public void vekZiakov() {
		for (int i = 0; i < pocetZiakov() ; i++) {
			vek += rng.nextInt(15,18);
		}
	}
	
	public double priemernyVek() {
		pocetDCh();
		vekZiakov();
		return vek/pocetZiakov();
	}

}
