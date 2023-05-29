package com.alura;

import com.alura.model.Alumno;
import com.alura.model.Curso;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Clase16 {

    // TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    // TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia",30) ;

        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Pepito los palotes","002");
        Alumno alumno3 = new Alumno("Juan Carlos","003");
        Alumno alumno4 = new Alumno("Pedro Pedrito","004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
        Alumno alumno6 = new Alumno("Marcia Maria","006");
        Alumno alumno7 = new Alumno("Claudia Patricia","007");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

       // curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

        // ITERATOR
        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
        // hasNext() -> para validar si existen valores para reccorrer
        while (alumnoIterator.hasNext()){
            //next() -> usado para recorrer los valores de un Iterator.
            System.out.println(alumnoIterator.next());
        }

         // alumnoIterator.next();
        // genera error porque excede el límite.
    }
}
