public class WhileNombreL {
    public void whileInicalNombre(int tamañoInicial, char signo) {
        System.out.println();
        System.out.println(" Inicial L con un While");
        int filas = 0;
        while (filas < tamañoInicial) {
            if (filas == tamañoInicial-1) {
                int columnas = 1;
                while (columnas <= tamañoInicial) {
                    System.out.print(signo + " ");
                    columnas++;
                }
                System.out.println();
            } else {
                System.out.println(signo);
            }
            filas++;
        }
    }
}
