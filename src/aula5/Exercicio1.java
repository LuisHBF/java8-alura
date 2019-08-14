package aula5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));
		
		cursos.stream().filter(c -> c.getAlunos() > 50)
		.findFirst().ifPresent(c -> System.out.println(c.getNome()));
	}
}
