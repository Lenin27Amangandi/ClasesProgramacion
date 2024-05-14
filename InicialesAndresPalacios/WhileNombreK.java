public class WhileNombreK{

    public void WhileNombreK(){
        int altura = 7;
        int anchura = 5;

        System.out.println("WHILE NOMBRE K: ");
        int fila = 0;
        while (fila < altura / 2) {
            int columna = 0;
            while (columna < anchura) {
                if (columna == 0 || columna == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            }
            System.out.println();
            fila++;
        }

        
        fila = 0;
        while (fila < altura / 2 + 1) {
            System.out.print("*");
            fila++;
        }
        int columna = 0;
        while (columna < anchura - 2) {
            System.out.print(" ");
            columna++;
        }
        System.out.println();

        
        fila = 0;
        while (fila < altura / 2) {
            int columna2 = 0;
            while (columna2 < anchura) {
                if (columna2 == 0 || columna2 == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna2++;
            }
            System.out.println();
            fila++;
        }
    }
}
