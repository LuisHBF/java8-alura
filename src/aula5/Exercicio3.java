package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio3 {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));
		
		cursos = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		cursos.forEach(c -> System.out.println(c.getNome()));
	}
}
