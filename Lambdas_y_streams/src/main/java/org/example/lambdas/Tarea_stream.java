package org.example.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tarea_stream {

    static void main(String[] args) {
        List<String> nombres = Arrays.asList("Dante", "Gabriel", "Rodion", "Francisco", "Lamine", "Juan", "Alyssa");
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);

        List<String> nombresMinusculas = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(nombresMinusculas);

        long cantidad = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .count();

        System.out.println("Nombres que empiezan con 'A': " + cantidad);
    }


}
