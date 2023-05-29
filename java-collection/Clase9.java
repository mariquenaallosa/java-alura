package com.alura;

import com.alura.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Clase9 {
    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());

        }
    };
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia",30) ;
        Curso curso2 = new Curso("Algebra",10) ;
        Curso curso3 = new Curso("Aritmetica",20) ;
        Curso curso4 = new Curso("Geometria",50) ;


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());

        // Obtener la suma de las horas
        int tiempo = 0;
        for(Curso curso: cursos){
            tiempo+= curso.getTiempo();
        }

        System.out.println(cursos);
        System.out.println(tiempo);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        // Obtener la suma de las horas con stream()
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        // Obtener el número máximo con stream()
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());

        // Obtener la suma de las horas con stream()
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
    }
}
