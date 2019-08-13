package aula3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		//palavras.sort((palavra1, palavra2) -> Integer.compare(palavra1.length(), palavra2.length()));

		//palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		//palavras.forEach(s -> System.out.println(s));
		
		palavras.forEach(System.out::println);
	}
}
