package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// Métodos adicionales 
public class Clase5 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("PHP", 30);
		Curso curso2 = new Curso("Ruby", 10);
		Curso curso3 = new Curso("JavaScript", 20);
		Curso curso4 = new Curso("Java", 50);
	
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		//Orden
		//Collections.sort(cursos, Collections.reverseOrder());
		//Orden reverso
		//Collections.sort(cursos, Collections.reverseOrder());
		
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
		System.out.println(cursoList);

	}
}
