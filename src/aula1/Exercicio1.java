package aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio1 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		ExibeNaLinha consumidor = new ExibeNaLinha();
		palavras.forEach(consumidor);
		
	}
	
}

class ExibeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}


