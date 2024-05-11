public class DoWhileApellidoA {
    public void doWhileApellido(int tamañoInicial, char signo) {
        System.out.println();
        System.out.println("Inicial A con un do-while");
        int fila = 1;
        do {
            int columna = 1;
            do {
                if ((fila == 1 || fila == tamañoInicial / 2 + 1) && columna <= tamañoInicial) {
                    System.out.print(" " + signo + " ");
                } else {
                    if (columna == 1 || columna == tamañoInicial) {
                        System.out.print(" " + signo + " ");
                    } else {
                        System.out.print("   ");
                    }
                }
                columna++;
            } while (columna <= tamañoInicial);
            System.out.println();
            fila++;
        } while (fila <= tamañoInicial);
    }
}
