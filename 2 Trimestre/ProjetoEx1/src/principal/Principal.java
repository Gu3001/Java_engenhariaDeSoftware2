package principal;

import java.util.Scanner;

import controllers.Verificar;
import models.Entrada;



public class Principal {
	
	public static void main(String [] args) {
		Verificar verif = new Verificar();
		Entrada in = new Entrada();
		
		System.out.println("Insira o número");
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		in.setInput(x);
		
		//Se numero for divisível por 3, imprimir Fizz
		
		//Se numero for divisível por 3, imprimir Buzz
		
		//Se numero for divisível por 3, imprimir FizzBuzz
		System.out.println(in.getInput());
		verif.verificar(in.getInput());
	}
}
