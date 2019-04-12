package controle;

import java.util.Arrays;
import java.util.List;

public class MyException {
	
	private static final List<String> badFoods 
	= Arrays.asList("pizza", "batata frita");

	public static void main(String[] args) {
		try {
			checkFood("ma�a");
		} catch (BadFoodException e) {
			System.out.println("O alimento informado "
					+ "� inadequado");
		}

	}
	
	private static void checkFood(String nomeAlimento) 
			throws BadFoodException {
		if (badFoods.contains(nomeAlimento))
			throw new BadFoodException();
		
		System.out.println("O alimento " + nomeAlimento +
				" � adequado!");
	}

}
