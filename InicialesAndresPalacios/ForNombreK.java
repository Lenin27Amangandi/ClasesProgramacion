public class ForNombreK {

        public void ForNombreK() {
            int altura = 7;
            int anchura = 5;
            
            System.out.println("FOR NOMBRE K: ");
            
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
    
            
            for (int fila = 0; fila <= altura / 2; fila++) {
                System.out.print("*");
            }
            for (int columna = 0; columna < anchura - 2; columna++) {
                System.out.print(" ");
            }
            System.out.println();
    
            
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
    }
    