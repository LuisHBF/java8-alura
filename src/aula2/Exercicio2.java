package aula2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort((palavra1, palavra2) -> Integer.compare(palavra1.length(), palavra2.length()));
		
		palavras.forEach(palavra -> System.out.println(palavra));
	}

}
