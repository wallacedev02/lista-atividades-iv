package MediaESoma;
import java.util.Scanner;
public class MediaESoma {

	public static void main(String[] args) {
		float cont = 0, numero;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i <=5;i++){
			System.out.println("Digite um numero");
			numero = leia.nextFloat();
			cont += numero;
			}
		System.out.println("A soma dos valores é: "+ cont+" e a media é: "+ cont/5);
		
		leia.close();

	}

}
