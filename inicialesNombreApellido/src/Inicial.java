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



    
    // public void imprimirInicialApellido() {
    //     Scanner sc = new Scanner(System.in);
    //     longitud = Integer.parseInt(sc.nextLine());

    //     for (int i = 1; i < longitud; i++) {

    //         System.out.println();

    //         for (int j = 0; j < longitud; j++) {

    //             if (condition) {
                    
    //             } else {
                    
    //             }

                
    //         }

    //     }

    // }

}