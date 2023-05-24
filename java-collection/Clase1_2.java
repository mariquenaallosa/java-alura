package br.com.alura;

import java.util.ArrayList;

public class Clase1_2 {
	public static void main(String[] args) {
		String variable1 = "Clase 1";
		String variable2 = "Clase 2";
		String variable3 = "Clase 3";
		String variable4 = "Clase 4";
		
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		
		//lista.remove(2);
		lista.set(2,"Ejemplo alterado");

		
		System.out.println(lista);
		
		
		System.out.println(lista.size());
		
		
		
		// Nuevo ejemplo
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		
		// maneras de recorrer un Array
		System.out.println("-------------------------------");
		System.out.println("Recorrer lista con FOR");
		for(int i = 0; i < listaString.size(); i++ ) {
			System.out.println(listaString.get(i));
		}
		
		System.out.println("-------------------------------");
		System.out.println("Recorrer lista con FOR tipo FOREACH");
		for (String clase : listaString) {
			System.out.println(clase);
		}
		
		System.out.println("-------------------------------");
		System.out.println("Recorrer lista con FOREACH");
		
		listaString.forEach(clase ->{
			System.out.println(clase);
		});
	}

}
