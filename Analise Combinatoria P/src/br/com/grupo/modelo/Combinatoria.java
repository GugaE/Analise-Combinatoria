package br.com.grupo.modelo;

import java.util.*;

public class Combinatoria {

	public void printCombinacoes(List<Integer> list, int r) {

	}

	public int combinationSimples(List<?> lista, int r) {
		int nFatorial = lista.size();
		return fatorial(nFatorial) / (fatorial(r) * (nFatorial - r));
	}

	public int arrangementSimples(List<?> lista, int r) {
		int nFatorial = lista.size();
		return fatorial(nFatorial) / (nFatorial - r);
	}

	public int permutationSimples(List<?> lista) {
		return fatorial(lista.size());
	}
	
	public int permutationRepeticao(List<String> lista){
		List<Integer> x = elementsRepetidos(lista);
		int[] vetRepetidos = new int[x.size()];
		
		int valorDaMutElementosRepetidos= 1;
		int nfat =  fatorial(lista.size());
		
		for (int i = 0; i < vetRepetidos.length; i++) {
			vetRepetidos[i] = x.get(i);
			vetRepetidos[i] = fatorial(vetRepetidos[i]);
			valorDaMutElementosRepetidos = vetRepetidos[i] * valorDaMutElementosRepetidos;
		}
		return nfat / valorDaMutElementosRepetidos;
	}
	
	private int fatorial(int fat) {

		if (fat > 1) {
			return fat * fatorial(fat - 1);
		} else if (fat == 1 || fat == 0) {
			return 1;
		}
		return 0;
	}

	private List<Integer> elementsRepetidos(List<String> lista) {
		List<Integer> listaNumeros = new ArrayList<>();
		int contador = 0;
		boolean saida = true;
		Collections.sort(lista);
		do {
			int intervaloAtual = lista.lastIndexOf(lista.get(contador)) - lista.indexOf(lista.get(contador)) + 1;
			if(intervaloAtual > 1){
				listaNumeros.add(intervaloAtual);
				contador = lista.lastIndexOf(lista.get(contador)) + 1;
			}
			if(intervaloAtual <= 1 ){
				contador += 1;
			}
			if(contador >= lista.size()){
				saida = false;
			}
			
		} while (saida);
			
			
			
		
				
		return listaNumeros;

	}
}
