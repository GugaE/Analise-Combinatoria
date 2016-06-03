package br.com.grupo.teste;

import java.util.*;
import br.com.grupo.modelo.Combinatoria;

public class TesteFatorial {

	public static void main(String[] args) {
		Combinatoria comb = new Combinatoria();
		
		//List<Integer> lista = Arrays.asList(1,2,3,4,1);
		//List<Character> arr = Arrays.asList('A','M','O','R','A');
		List<String> arr2 = Arrays.asList("A","B","C","A","A","A","A");
		
		System.out.println(comb.arrangemntRepeticao(arr2, 3));
		
	}

}
