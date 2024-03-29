package aula1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras,comparador);
		palavras.sort(comparador);
		System.out.println(palavras);
		
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
		
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.forEach(consumidor);
		
	}
}

class ImprimeNaLinha implements Consumer<String>{
	
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		if(arg0.length() < arg1.length() )
			return -1;
		
		if(arg0.length() > arg1.length())
			return 1;
		
		return 0;
	}
	
}