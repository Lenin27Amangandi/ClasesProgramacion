public class Prueba {

    public static void main(String[] args) {

        int numeroFilas = 8; // Cambia este valor según tus necesidades

        for (int columna = 1; columna <= numeroFilas; columna++) {

            for (int fila = 1; fila <= numeroFilas; fila++) {
                // Imprime asteriscos en las posiciones adecuadas para formar la letra A

                if (
                // Si el contador fila es igual a 0 o igual al numero de filas -1

                // y la columna es diferente de 0 o columna es igual al numero de filas/2 o
                // columnas es 0

                // y fila es mayor a 0 y un numero menor a al numero de filas se va a imprimir
                // el asterisco

                (fila == 1 || fila == numeroFilas - 1) &&

                        (columna != 1 || columna == numeroFilas / 2 || columna == 1) &&

                        fila > 1 && fila < numeroFilas - 1

                )

                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

}
