package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public static void main(String[] args) {
        List <Producto> productos = new ArrayList<>();

        productos.add(new Producto("Smartphone", 150.0, "electrónica"));
        productos.add(new Producto("Laptop", 900.0, "electrónica"));
        productos.add(new Producto("Tablet", 200.0, "electrónica"));
        productos.add(new Producto("Ratón", 50.0, "electrónica"));

        String categoriaEspecifica = "electrónica";
        double precioMin = 100;

        FiltroProducto filtro = new FiltroProducto() {
            @Override
            public boolean filtrar(Producto producto) {
                return producto.getCategoria().equalsIgnoreCase(categoriaEspecifica)
                        && producto.getPrecio() > precioMin;
            }
        };

        List<Producto> filtrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (filtro.filtrar(producto)) {
                filtrados.add(producto);
            }
        }

        System.out.println("Productos filtrados (Electrónica y precio > 100)");
        for (Producto producto : filtrados) {
            System.out.println("Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
        }
    }
}
