public class DoWhileApellidoP {

    public void DoWhileApellidoP() {
        int altura = 7;
        int anchura = 5;

        System.out.println("DOWHILE APELLIDO P: ");
        int fila = 0;
        do {
            int columna = 0;
            do {
                if ((fila == 0 || fila == altura / 2 || columna == 0) || (columna == anchura - 1 && fila <= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            } while (columna < anchura);
            System.out.println();
            fila++;
        } while (fila < altura);
    }
}
