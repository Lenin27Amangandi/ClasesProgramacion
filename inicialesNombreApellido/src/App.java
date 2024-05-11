public class App {
    public static void main(String[] args) {

        // Inicial lenin = new Inicial();
        ForNombreL inicialNombbre = new ForNombreL();
        ForApellidoA inicalApellidoA = new ForApellidoA();
        ForNombreApellidoLA inicialNombreApellidoLA = new ForNombreApellidoLA();

        // lenin.ingresodedatos();
        // lenin.imprimirInicialName();
        // lenin.imprimirInicialApellido();

        inicialNombbre.inicialNombre(9, '*');
        inicalApellidoA.inicialApellido(8, '*');
        inicialNombreApellidoLA.metodoChat(9, "*");

    }

}
