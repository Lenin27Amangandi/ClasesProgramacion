public class ForNombreApellidoLA {

    public void metodoChat(int nivelDeseado, String signo) {

        System.out.println("Inicales dek nombre y apellido");
        // Imprimir la letra L y la letra A juntas
        for (int fila = 1; fila <= nivelDeseado; fila++) {
            // Imprimir la letra L
            for (int col = 1; col <= nivelDeseado; col++) {                
                if (col == 1 || fila == nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
            }

            // Espacio entre las letras L y A
            System.out.print("  ");

            // Imprimir la letra A
            for (int col = 1; col <= nivelDeseado; col++) {
                if ((fila == 1 || fila == nivelDeseado / 2 + 1) && col <= nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    if (fila != 1 && fila != nivelDeseado / 2 + 1 && (col == 1 || col == nivelDeseado)) {
                        System.out.print(signo + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        System.out.println();

    }

}
