package ParesEImpares;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float inteiros;
		
		for(int i =1; i<= 10;i++) {
			System.out.println("Digite um numero: ");
			inteiros = leia.nextFloat();
			if(inteiros % 2 == 0)
			{
				System.out.println("Numeros pares: "+ inteiros);
			}else
			{
				System.out.println("numeros impares: "+ inteiros);
			}
		}
		leia.close();
	}

}
