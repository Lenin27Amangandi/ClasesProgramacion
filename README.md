# ClasesProgramacion
Anotar y subir clases de laboratorio
public class Inicial {

    public static void main(String[] args) {

        Inicial l = new Inicial();
        Inicial a = new Inicial();

        l.ImprimirInicialName();

        a.imprimirInicialApellido();

    }

    public void ImprimirInicialName() {

        int level = 7;
        for (int i = 1; i <= level; i++) {
            System.out.println("*");

            if (i == level) {
                for (int j = 0; j <= level - 2; j++) {
                    System.out.print(" * ");
                }
            }
        }
    }

    public void imprimirInicialApellido() {

        int level = 7;
        int anchura = 7;

        System.out.println();
        System.out.println("******** Desde aqui va el apellido *******");
        System.out.println();

        for (int i = 1; i <= level; i++) {

            System.out.println();
            for (int j = 1; j < anchura; j++) {


            }
        }
    }

}
