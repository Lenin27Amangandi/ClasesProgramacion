public class ForNombreL {

    public void inicialNombre(int tamañoInicial, char simbolo_A_Imprimir) {
        System.out.println("Inicial L con for");
        for (int i = 1; i <= tamañoInicial; i++) {
            if (i == tamañoInicial) {
                for (int j = 1; j <= tamañoInicial - 2; j++) {
                    System.out.print(simbolo_A_Imprimir + " ");
                }
            }
            System.out.println(simbolo_A_Imprimir);
        }
    }

}
