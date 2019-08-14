package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));
		
		OptionalDouble media = cursos.stream().mapToDouble(Curso::getAlunos).average();
		System.out.println("Média de alunos de todos os cursos: " + media.getAsDouble());
	}
	
}
