package controllers;

import models.Entrada;

public class Verificar {
	public void verificar(int n) {
		
		Entrada in = new Entrada();
//		int n = in.getInput();
		System.out.println(n);
		
		for (int num = 0; num <= n; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				in.setStatus("FizzBuzz");
				System.out.println(in.getStatus());
				
			}
			else if (num % 5 == 0) {
				in.setStatus("buzz");
				System.out.println(in.getStatus());
				
			}
			else if (num % 3 == 0) {
				in.setStatus("Fizz");
				System.out.println(in.getStatus());
				
			}
			else{
				String number = Integer.toString ( num ); 
				in.setStatus(number);
				System.out.println(in.getStatus());
			}
			
			
		}
		
		

		
		
		
	}
	
	
}
