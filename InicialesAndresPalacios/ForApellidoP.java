public class ForApellidoP {

    public void ForApellidoP() {
        int altura = 7;
        int anchura = 5;

        System.out.println("FOR APELLIDO K: ");
        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < anchura; columna++) {
                if ((fila == 0 || fila == altura / 2 || columna == 0) || (columna == anchura - 1 && fila <= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
