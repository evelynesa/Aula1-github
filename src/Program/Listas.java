package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		
		// adiciona elementos
		lista.add("Evelyn");
		lista.add("Jorge");
		lista.add("Lincon");
		lista.add("Stella");
		//adiciona elementos em uma determinada posição
		lista.add(2, "Mãe");
		
		//Remove um determinado elemento da lista de acordo com valor
		lista.remove("Lincon");
		
		//Remove um determinado elemento da lista de acordo com valor
		lista.remove(3);
		
		//Remove um determinado elemento da lista de acordo um predicado Lambda
		lista.removeIf(x -> x.charAt(0) == 'J');
		
		//percorre a lista
		for(String c: lista) {
			System.out.println(c);
		}
		//Encontra a posição de um determinado elemento de acordo com o valor
		System.out.println("Posição da Mãe: "+ lista.indexOf("Mãe"));
		
		// Filtrar elementos da Lista conforme uma expressão Lambda
		List <String> listaFiltrada = lista.stream().filter(x -> x.charAt(0)=='E').collect(Collectors.toList());
		System.out.println("Lista Filtrada : "+listaFiltrada);
		
	}

}
