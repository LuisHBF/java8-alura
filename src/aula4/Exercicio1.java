package aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio1 {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.forEach(c -> System.out.println(c.getNome()));
	}
}