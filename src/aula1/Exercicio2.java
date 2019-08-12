package aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		ClassificaPorTamanho comparator = new ClassificaPorTamanho();
		Collections.sort(palavras, comparator);
		
		palavras.forEach(palavra -> {
			System.out.println(palavra);
		});
	}
	
}

class ClassificaPorTamanho implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length())
			return -1;
		
		if(o1.length() > o2.length()) {
			return 1;
		}
		
		return 0;
	}
	
}