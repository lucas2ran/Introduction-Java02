package AtivSomalist;

import java.util.Scanner;

public class Soma1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		float a,b,c;
		
		System.out.println("\n Digite o valor de A: ");
		a = leia.nextFloat();
		System.out.println("\n Digite o valor de B: ");
		b = leia.nextFloat();
		System.out.println("\n Digite o valor de C: ");
		c = leia.nextFloat();
		
		if(a+b > c) {
			System.out.println("\n A soma de A+B é maior que C!");
		}
		else if(a+b < c) {
			System.out.println("\n A soma de A+B é menor que C!");
		}
		else { System.out.println("\n A soma de A+B é igual a C!");
		
		}

	}

}
	