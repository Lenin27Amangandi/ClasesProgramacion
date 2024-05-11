import java.util.Scanner;

public class Inicial {

    // Atributo
    int longitud;
    String caracterAImprimir;

    // Metodo para el ingreso de longitud y caractaer a imprimir
    public void ingresodedatos() {
        // Cramos un escaner para poder pedir los valores por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese el tamaño de la palabra mayor a 2: ");
        longitud = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese por favor el caracter con el que se formara la palabra: ");
        caracterAImprimir = sc.nextLine();
    }

    // Metodo para imprimir la inicial del nombre
    public void imprimirInicialName() {
        for (int i = 1; i <= longitud; i++) {
            if (i == longitud) {
                for (int j = 1; j <= longitud - 2; j++) {
                    System.out.print(caracterAImprimir + " ");
                }
            }
            System.out.println(caracterAImprimir);
        }
    }

    // Metodo para imprimir inicial Apellido
    public void imprimirInicialApellido() {
        System.out.println();
        System.out.println(" Inicial Apellido ");
        System.out.println();

        for (int nivel = 1; nivel <= longitud; nivel++) {
            for (int columna = 1; columna <= longitud; columna++) {
                // Esta condición manejará la primera y la mitad de la línea
                if ((nivel == 1 || nivel == longitud / 2 + 1) && columna <= longitud) {
                    System.out.print(" * ");
                } else {
                    // nivel == 1 || columna == 1 || columna == longitud
                    if (columna == 1 || columna == longitud) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   "); // Tres espacios para mantener la alineación
                    }
                }
            }
            System.out.println();
        }
    }

    // Posible metodod para mandar a imprimir las 2 iniciales
    public void imprimirInicialesCompletos() {
        System.out.println();
        System.out.println("Imprimir junto");

        for (int fila = 1; fila <= longitud; fila++) {
            for (int columna = 1; columna <= longitud; columna++) {
                if (columna == 1 || fila == longitud) {
                    System.out.print(caracterAImprimir + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("  "); // Espacio entre las letras L y A

            // Imprimir la letra A
            for (int columna = 1; columna <= longitud; columna++) {
                if (fila == 1 || fila == longitud / 2 + 1 || columna == 1 || columna == longitud) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // for (int nivel = 1; nivel <= longitud; nivel++) {
        // // Imprimir la letra L
        // for (int columna = 1; columna <= longitud; columna++) {
        // if (columna == 1 || (nivel == longitud && columna <= longitud+4)) {
        // System.out.print(caracterAImprimir + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // // Espacio entre las letras L y A
        // System.out.print(" ");

        // // Imprimir la letra A
        // for (int columna = 1; columna <= longitud; columna++) {

        // if ((nivel == 1 || nivel == longitud / 2 + 1) && columna <= longitud) {
        // System.out.print(" * ");
        // } else {
        // if (columna == 1 || columna == longitud) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // // Salto de línea al final de cada nivel
        // System.out.println();
        // }

    }
}