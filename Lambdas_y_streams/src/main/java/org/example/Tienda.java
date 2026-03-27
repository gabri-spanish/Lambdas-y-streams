package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public static void main(String[] args) {
        List <Producto> productos = new ArrayList<>();

        productos.add(new Producto("Smartphone", 150.0, "electrónica"));
        productos.add(new Producto("Laptop", 900.0, "electrónica"));
        productos.add(new Producto("Tablet", 200.0, "electrónica"));
        productos.add(new Producto("Ratón", 50.0, "electrónica"));
    }
}
