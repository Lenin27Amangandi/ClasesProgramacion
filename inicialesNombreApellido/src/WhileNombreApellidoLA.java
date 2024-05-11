public class WhileNombreApellidoLA {

    public void whileNombreApellidoLA(int nivelDeseado, char signo) {
        System.out.println("Iniciales L y A con while");
        int fila = 1;
        while (fila <= nivelDeseado) {
            int col = 1;
            // Imprimir la letra L
            while (col <= nivelDeseado) {
                if (col == 1 || fila == nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            // Espacio entre las letras L y A
            System.out.print("  ");
            col = 1;
            // Imprimir la letra A
            while (col <= nivelDeseado) {
                if ((fila == 1 || fila == nivelDeseado / 2 + 1) && col <= nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    if (fila != 1 && fila != nivelDeseado / 2 + 1 && (col == 1 || col == nivelDeseado)) {
                        System.out.print(signo + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                col++;
            }
            System.out.println(); // Salto de línea al final de cada fila
            fila++;
        }
        System.out.println();
    }
}
