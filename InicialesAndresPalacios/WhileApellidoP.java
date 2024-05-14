public class WhileApellidoP{

    public void  WhileApellidoP(){
        int altura = 7;
        int anchura = 5;

        System.out.println("WHILE APELLIDO P: ");
        int fila = 0;
        while (fila < altura) {
            int columna = 0;
            while (columna < anchura) {
                if ((fila == 0 || fila == altura / 2 || columna == 0) || (columna == anchura - 1 && fila <= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            }
            System.out.println();
            fila++;
        }
    }
}
