public class Prueba {

    public static void main(String[] args) {

        int numeroFilas = 10; // Cambia este valor según tus necesidades

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroFilas; j++) {
                // Imprime asteriscos en las posiciones adecuadas para formar la letra A
                if ((j == 0 || j == numeroFilas - 1) && i != 0 ||
                        i == numeroFilas / 2 ||
                        i == 0 && j > 0 && j < numeroFilas - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
