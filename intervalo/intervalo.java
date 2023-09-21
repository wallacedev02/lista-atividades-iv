package intervalo;

import java.util.Scanner;

public class intervalo {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int num, num2, cont = 0;
	
	System.out.println("Digite o numero menor");
	num = leia.nextInt();
	System.out.println("Digite o numero maior");
	num2 = leia.nextInt();
	
	for(int i = num; i < num2;i++) 
	{
		if(i> num && i < num2) {
			cont = i;
			System.out.println("Intervalo: "+cont);
		}
	}
	
	leia.close();
	

}
	}
