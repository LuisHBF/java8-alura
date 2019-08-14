package aula6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio4 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formatador));
		
	}
	
}
