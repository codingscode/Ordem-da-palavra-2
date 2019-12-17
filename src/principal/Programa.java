package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
       metodo1();
       
	   System.out.println("Fim do Programa");
	}
	
	public static void metodo1() {
	   System.out.println("In�cio M�todo 1");
		
	   metodo2();	
		
	   System.out.println("Fim M�todo 1");
	}
	
	public static void metodo2() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("In�cio M�todo 2 : ");
	   System.out.println("Digite uma frase : ");
	   
	   try {
	     String[] vetor = sc.nextLine().split(" ");
		 System.out.println("Digite uma posi��o: ");
		 int posicao = sc.nextInt();
		 System.out.println(vetor[posicao]);
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
	     System.out.println("Posi��o Inv�lida");
	     e.printStackTrace();
	     sc.next();
	   }
	   catch(InputMismatchException e) {
	     System.out.println("Erro de entrada");
	   }	
	   
	   System.out.println("Fim M�todo 2");
	   sc.close();
	}

}
