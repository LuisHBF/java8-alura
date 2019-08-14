package aula6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate meuProximoAniversario = LocalDate.of(2020, Month.FEBRUARY, 19);
		System.out.println(meuProximoAniversario);
		
		int anos = meuProximoAniversario.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, meuProximoAniversario);
		System.out.println(periodo.getMonths());
		
		LocalDate meuAniversarioDaqui5Anos = meuProximoAniversario.plusYears(4);
		System.out.println(meuAniversarioDaqui5Anos.getYear());
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(meuProximoAniversario.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}
	
}
