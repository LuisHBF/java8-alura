package aula6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Exercicio3 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);

		Period periodo = Period.between(hoje, data);
		
		System.out.println(periodo.getYears());
		
	}
	
}
