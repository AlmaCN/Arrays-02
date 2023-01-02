package it.develhope.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        /*
        Ho definito 3 array di stringhe, una per Alice, una per Bob ed una per Tim, ed ho assegnato loro i task
        che devono fare.
         */
        String aliceToDos[] = new String[]{"Coding", "Reading", "Learning"};
        String bobToDos[] = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String timToDos[] = new String[]{"Reading", "Learning", "Coding"};

        /*
        Ho usato il metodo .equals() per vedere se gli array alice e bob, e alice e tim sono uguali
         */
        System.out.println("Is Alice's array equal to Bob array? " + aliceToDos.equals(bobToDos));

        System.out.println("Is Alice's array equal to Tim array? " + aliceToDos.equals(timToDos));

        /*
        Ho usato il metodo .length() per vedere se le lunghezze tra Alice e bob e tra alice e tim sono uguali o no
         */
        System.out.println("Is Alice's array having the same length of Bob's array? " + (aliceToDos.length == bobToDos.length));

        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));

        /*
        Ho usato prima il metodo sort su alice e bob e poi il metodo equals per vedere se effetivamente hanno
        gli stessi task, e poi ho fatto la stessa cosa per alice e per tim
         */
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos, bobToDos));

        Arrays.sort(aliceToDos);
        Arrays.sort(timToDos);
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.equals(aliceToDos, timToDos));
    }
}
