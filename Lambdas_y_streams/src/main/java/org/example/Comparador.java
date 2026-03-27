package org.example;

public class Comparador {
    public static void main(String[] args) {
        Ejecutor ejecutor = new Ejecutor() {
            @Override
            public boolean ejecutar(int numero) {
                System.out.println("Comparando números...");
                if (numero <= 10) {
                    return false;
                } else {
                    return true;
                }
            }
        };

        System.out.println("Comparación con 15 en el primero y 5 en el segundo");
        System.out.println(ejecutor.ejecutar(15));
        System.out.println(ejecutor.ejecutar(5));
    }
}
