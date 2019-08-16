package controllers;

import models.Entrada;

public class Verificar {
	public void verificar() {
		Entrada in = new Entrada();
		int num = in.getInput();
		
		if (num % 3 == 0 && num % 5 == 0) {
			in.setStatus("FizzBuzz");
			return;
		}
		else if (num % 5 == 0) {
			in.setStatus("buzz");
		}
		else if (num % 3 == 0) {
			in.setStatus("Fizz");
		}

		
		
		
	}
	
	
}
