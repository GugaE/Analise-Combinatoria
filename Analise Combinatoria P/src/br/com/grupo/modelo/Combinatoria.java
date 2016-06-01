package br.com.grupo.modelo;
import java.util.*;

public class Combinatoria {
	
	public void printCombinacoes(List<Integer> list, int r){
		
	}
	public int combination(List<?> lista, int r){
		int nFatorial = lista.size();	
		return fatorial(nFatorial) / (fatorial(r) * (nFatorial - r));
	}
	public int arrangement(List<?> lista, int r){
		int nFatorial = lista.size();
		return fatorial(nFatorial) /(nFatorial - r);
	}
	public int permutation(List<?> lista){
		return fatorial(lista.size());
	}
	private int fatorial(int fat){
		
		if(fat > 1 ){
			return  fat * fatorial(fat - 1);
			
		}
		else if(fat == 1 || fat == 0){
			return 1;
		}
		
		
		return 0;
	}
}
