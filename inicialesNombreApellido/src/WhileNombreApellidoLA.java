public class WhileNombreApellidoLA {
    public void whileNombreApellidoLA(int nivelDeseado, char signo) {
        System.out.println("Iniciales L y A con while");
        int fila = 1;
        while (fila <= nivelDeseado) {
            int col = 1;
            while (col <= nivelDeseado) {
                if (col == 1 || fila == nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.print("  ");
            col = 1;
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
            System.out.println();
            fila++;
        }
        System.out.println();
    }
}
