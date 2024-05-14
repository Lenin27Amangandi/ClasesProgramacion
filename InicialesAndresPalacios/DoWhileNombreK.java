public class DoWhileNombreK {

    public void DoWhileNombreK() {
        int altura = 7;
        int anchura = 5;

        System.out.println("DOWHILE NOMBRE K: ");
        int fila = 0;
        do {
            int columna = 0;
            do {
                if (columna == 0 || columna == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            } while (columna < anchura);
            System.out.println();
            fila++;
        } while (fila < altura / 2);

        fila = 0;
        do {
            System.out.print("*");
            fila++;
        } while (fila < altura / 2 + 1);

        int columna = 0;
        do {
            System.out.print(" ");
            columna++;
        } while (columna < anchura - 2);
        System.out.println();

        fila = 0;
        do {
            int columna2 = 0;
            do {
                if (columna2 == 0 || columna2 == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna2++;
            } while (columna2 < anchura);
            System.out.println();
            fila++;
        } while (fila < altura / 2);
    }
}
