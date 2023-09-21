package AtividadeIV;
import java.util.Scanner;
public class Validador {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome = "";
		int idade=0;
		int salario;
		String sexo;
		String estadoCivil;
		
		System.out.println("Digite seu nome:");
		nome = read.next();
		System.out.println("Digite sua idade:");
		idade = read.nextInt();
		System.out.println("Digite seu salario:");
		salario = read.nextInt();
		System.out.println("Qual o seu sexo "+ "'masculino' ou 'feminino':");
		sexo = read.next();
		System.out.println("Qual seu estado civil ? digite C, S, D ou V");
		estadoCivil = read.next();
		for(int i=0; i<1;i++)
		{
			while(nome.length()<3){
				if(nome.length()<=3)
				{
					System.out.println("Digite um nome maior ou igual a 3 caracteres:");
					nome = read.next();
				}
			}
			while(idade>=0 && idade<=150) {
				if(idade>=0 && idade<=150)
				{
					System.out.println("Digite uma idade valida entre 0 e 150");
					idade = read.nextInt();
				}
			}
			while(salario <= 0) {
				if(salario <= 0 )
				{
					System.out.println("Digite um salario maior que 0");
					salario = read.nextInt();
				}
			}
			while(sexo.equals("m")|| sexo.equals("f"))
			{
				if(sexo.toLowerCase().equals("m")|| sexo.toLowerCase().equals("f")) {
					System.out.println("Digite m ou f para masculino e feminino:");
				}
			}
			while(estadoCivil.equals("C")|| estadoCivil.equals("S")|| estadoCivil.equals("D")|| estadoCivil.equals("V"))
			{
				if(estadoCivil.toLowerCase().equals("C")|| estadoCivil.toLowerCase().equals("S")|| estadoCivil.toLowerCase().equals("D")|| estadoCivil.toLowerCase().equals("V")) {
					System.out.println("Caracterer errado: digite C, S, D ou V ");
				}
			}	
			
		}
		
		
		read.close();

	}

}
