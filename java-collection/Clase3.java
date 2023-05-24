package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
	public static void main(String[] args) {
		String curso1 = "Geometría";
		String curso2 = "Física";
		String curso3 = "Química";
		String curso4 = "Historia";
		
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		// Ordenar utilizando collections
		System.out.println("Ordenar utilizando collections");
		
		//Ordenar de manera ascendente
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		//Ordenar de manera descendente
		Collections.sort(cursos, Collections.reverseOrder());
		
		System.out.println(cursos);
		
		// Ordenar utilizando métodos
		System.out.println("----------------");
		
		cursos.sort(Comparator.reverseOrder());
		System.out.println(cursos);
		
		// Ordenar utilizando stream()
		System.out.println("----------------");
				
		
		
		// collect me devuelve una lista nueva
		
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);
				
		
	}


}
