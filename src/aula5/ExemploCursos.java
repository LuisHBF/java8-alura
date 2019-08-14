package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.alunos = alunos;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));

		// cursos.sort(Comparator.comparing(Curso::getAlunos));
		// cursos.forEach(c -> System.out.println(c.getNome()));

		Optional<Curso> cursoOptional = cursos.stream().filter(c -> c.getAlunos() > 100).findFirst();

		cursoOptional.ifPresent(c -> System.out.println(c.getNome()));

		cursos = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		cursos.forEach(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println("O curso " + nome + " tem " + alunos + " alunos!"));
	}
}