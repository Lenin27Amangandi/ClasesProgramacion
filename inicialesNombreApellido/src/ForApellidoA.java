public class ForApellidoA {
    public void inicialApellido(int alturaInicial, char signo) {

        System.out.println();
        System.out.println(" Inicial A con un for");
        System.out.println();
        for (int nivel = 1; nivel <= alturaInicial; nivel++) {
            for (int columna = 1; columna <= alturaInicial; columna++) {
                // Esta condición manejará la primera y la mitad de la línea
                if ((nivel == 1 || nivel == alturaInicial / 2 + 1) && columna <= alturaInicial) {
                    System.out.print(" " + signo + " ");
                } else {
                    if (columna == 1 || columna == alturaInicial) {
                        System.out.print(" " + signo + " ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }

    }

}
