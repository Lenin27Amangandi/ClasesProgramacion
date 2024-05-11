public class WhileNombreL {

    public void whileInicalNombre(int tamañoInicial, char signo) {
        System.out.println(" Inicial L con While");
        int filas = 0;
        while (filas <= tamañoInicial) {
            if (filas == tamañoInicial) {
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
