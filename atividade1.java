package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        int nota;
    String exit="" ;
    Scanner Read = new Scanner(System.in);
    do
    {
        System.out.println("Digite uma nota entre 0 e 10");
        nota = Read.nextInt();
        while(nota < 0 || nota >10)
        {
            System.out.println("Digite a nota corretamente");
            nota = Read.nextInt();
        }
        System.out.println("Digite q para sair");
        exit = Read.next();
              
}
while(exit.equals("q"));
    }
    
}
