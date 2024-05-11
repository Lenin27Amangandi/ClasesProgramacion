public class DoWhileNombreL {
    public void doWhileNombre(int tamañoInicial, char signo) {
        System.out.println("Inicial L con el do-while");
        int filas = 1;
        do {
            if (filas == tamañoInicial) {
                int columnas = 1;
                do {
                    System.out.print(signo + " ");
                    columnas++;
                } while (columnas <= tamañoInicial);
                System.out.println();
            } else {
                System.out.println(signo);
            }
            filas++;
        } while (filas <= tamañoInicial);
    }
}
