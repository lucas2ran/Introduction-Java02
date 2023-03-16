package LaçoIf;

import java.util.Scanner;

public class PositivNegativ {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		
		System.out.println("\n Digite um número: ");
		num = leia.nextInt();
	
		if (num>=0 && num % 2 == 0){
			System.out.println("O número "+num+" É par e positivo!");
		}
		else if(num<0 && num % 2 == 0);
		{	
			System.out.println("O número "+num+" É ímpar e negativo!");
		}
		if (num<0 && num % 2 != 0);
		{	
			System.out.println("O número "+num+" É ímpar e negativo!");
		}
		if (num>=0 && num % 2 != 0);
		{	
			System.out.println("O número "+num+" É par e positivo!");
		}
	}

}
