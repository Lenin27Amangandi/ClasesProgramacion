public class WhileApellidoA {

    public void whileApellido(int tamañoInicial, char signo) {

        System.out.println("Inicial A con While");

        int fila = 1;
        while (fila <= tamañoInicial) {
            int columna = 1;
            while (columna <= tamañoInicial) {
                // Esta condición manejará la primera y la mitad de la línea
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
            }
            System.out.println();
            fila++;
        }
    }
}
