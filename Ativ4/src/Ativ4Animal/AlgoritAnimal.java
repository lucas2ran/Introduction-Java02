package Ativ4Animal;

import java.util.Scanner;

public class AlgoritAnimal {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma águia");
				}else {
					System.out.println("\nÉ uma pomba");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um ser humano");
				}else {
					System.out.println("\nÉ uma vaca");
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma pulga");
				}else {
					System.out.println("\nÉ uma lagarta");
				}
			} else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma sanguessuga");
				}else {
					System.out.println("\nÉ uma minhoca");
				}
			}
		}

	}

}
