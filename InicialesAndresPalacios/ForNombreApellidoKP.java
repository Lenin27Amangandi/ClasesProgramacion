public class ForNombreApellidoKP {

    public void ForNombreK() {
        int altura = 7;
        int anchura = 5;

        System.out.println(" ForNombreApellidoKP: ");
        for (int fila = 0; fila < altura / 2; fila++) {
            for (int columna = 0; columna < anchura; columna++) {
                if (columna == 0 || columna == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Middle part of the letter "K"
        for (int fila = 0; fila <= altura / 2; fila++) {
            System.out.print("*");
        }
        for (int columna = 0; columna < anchura - 2; columna++) {
            System.out.print(" ");
        }
        System.out.println();

        // Bottom half of the letter "K"
        for (int fila = 0; fila < altura / 2; fila++) {
            for (int columna = 0; columna < anchura; columna++) {
                if (columna == 0 || columna == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
    
    public void ForApellidoP() {
        int altura = 7;
        int anchura = 5;

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
