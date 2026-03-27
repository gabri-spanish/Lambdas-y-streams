package org.example;

public class PuedeVotar {
    public static void main(String[] args) {
        VerificadorVoto verificador = new VerificadorVoto() {
            @Override
            public boolean puedeVotar(String nombre, int edad) {
                System.out.println("Probando " + nombre + " con " + edad + " años...");
                if (edad < 18) {
                    return false;
                } else {
                    return true;
                }
            }
        };

        System.out.println("Verificación de voto...");
        System.out.print(verificador.puedeVotar("Dante", 12));
        System.out.println();
        System.out.print(verificador.puedeVotar("Lady", 23));
    }
}
