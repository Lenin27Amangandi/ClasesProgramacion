public class App {
    public static void main(String[] args) {

        // Inicial lenin = new Inicial();
        ForNombreL inicialNombbre = new ForNombreL();
        ForApellidoA inicalApellidoA = new ForApellidoA();
        ForNombreApellidoLA inicialNombreApellidoLA = new ForNombreApellidoLA();
        WhileNombreL whileInicialNombreL = new WhileNombreL();
        WhileApellidoA whileInicalApellidoA = new WhileApellidoA();
        WhileNombreApellidoLA while_Nombre_Apellido = new WhileNombreApellidoLA();

        // lenin.ingresodedatos();
        // lenin.imprimirInicialName();
        // lenin.imprimirInicialApellido();

        // Estos son los que funcan
        inicialNombbre.inicialNombre(9, '*');
        inicalApellidoA.inicialApellido(8, 'a');
        inicialNombreApellidoLA.metodoChat(9, "*");
        whileInicialNombreL.whileInicalNombre(7, 's');
        whileInicalApellidoA.whileApellido(6, '*');
        while_Nombre_Apellido.whileNombreApellidoLA(5, 'p');
    }

}
