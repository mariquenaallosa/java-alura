package com.alura;

import com.alura.model.Clase;
import com.alura.model.Curso;

import java.util.ArrayList;

public class Clase6 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java",30);
        curso1.addClase(new Clase("ArrayList"));
        curso1.addClase(new Clase("List"));
        curso1.addClase(new Clase("LinkedList"));


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);


        System.out.println(cursos.get(0).getClaseList());

    }
}
