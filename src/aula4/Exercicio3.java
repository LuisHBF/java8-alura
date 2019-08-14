package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercicio3 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));
		
		Stream<String> nomes = cursos.stream().map(s -> s.getNome());
		
		nomes.forEach(System.out::println);
	}

}
