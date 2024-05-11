public class ForNombreApellidoLA {
    public void metodoChat(int nivelDeseado, String signo) {
        System.out.println();
        System.out.println("Inicales L y A con un For");
        for (int fila = 1; fila <= nivelDeseado; fila++) {
            for (int col = 1; col <= nivelDeseado; col++) {
                if (col == 1 || fila == nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int col = 1; col <= nivelDeseado; col++) {
                if ((fila == 1 || fila == nivelDeseado / 2 + 1) && col <= nivelDeseado) {
                    System.out.print(signo + " ");
                } else {
                    if (fila != 1 && fila != nivelDeseado / 2 + 1 && (col == 1 || col == nivelDeseado)) {
                        System.out.print(signo + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
