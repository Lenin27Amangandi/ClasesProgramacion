public class DoWhileNombreApellidoLA {
    public void doWhileNombreApellido(int tamañoInicial, char signo) {
        System.out.println();
        System.out.println("Iniciales L y A con un do-while");
        int fila = 1;
        do {
            int columna = 1;
            do {
                if (columna == 1 || fila == tamañoInicial) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
                columna++;
            } while (columna <= tamañoInicial);
            System.out.print("  ");
            columna = 1;
            do {
                if ((fila == 1 || fila == tamañoInicial / 2 + 1) && columna <= tamañoInicial) {
                    System.out.print(signo + " ");
                } else {
                    if (fila != 1 && fila != tamañoInicial / 2 + 1 && (columna == 1 || columna == tamañoInicial)) {
                        System.out.print(signo + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                columna++;
            } while (columna <= tamañoInicial);
            System.out.println();
            fila++;
        } while (fila <= tamañoInicial);
        System.out.println();
    }
}
