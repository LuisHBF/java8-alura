package aula3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.forEach(System.out::println);
	}
}
