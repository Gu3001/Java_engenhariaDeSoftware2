package principal;
import java.util.Scanner;

import models.Valores;

public class AnoBissexto {
    private static Scanner ent;

	public static void main(String[] args){
		int x = 0;
        ent = new Scanner(System.in);
        int valorAno;
        int proxBissexto;
        int resultadoObtido = 0;
        
        while(x == 0) {
        	System.out.println("\n\nDigite um ano para saber se é bissexto\n\n");
            valorAno = ent.nextInt();
            Valores val = new Valores();
            val.setAno(valorAno);
            int ano = val.getAno();
            
            proxBissexto = ano + 4;
            
            
            // se o ano for maior que 400
            if(ano % 400 == 0){
                System.out.println("O ano "+ano + " é bissexto. O próximo bissexto será "+ proxBissexto);
                
            // se o ano for menor que 400
            } else if((ano % 4 == 0) && (ano % 100 != 0)){
                System.out.println("O ano "+ano + " é bissexto. O próximo bissexto será "+ proxBissexto);
                val.setResultadoObtido(0);
            } else{
                System.out.println("O ano "+ano + " não é bissexto.");
                val.setResultadoObtido(1);
            }
        }
        
    }
}