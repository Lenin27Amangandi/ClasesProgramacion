public class App {
    public static void main(String[] args) {
        // Inicial lenin = new Inicial();
        ForNombreL inicialNombreFor = new ForNombreL();
        ForApellidoA inicialApellidoFor = new ForApellidoA();
        ForNombreApellidoLA inicialNombreApellidoFor = new ForNombreApellidoLA();

        WhileNombreL inicialNombreWhile = new WhileNombreL();
        WhileApellidoA inicialApellidoWhile = new WhileApellidoA();
        WhileNombreApellidoLA inicialNombreApellidoWhile = new WhileNombreApellidoLA();

        DoWhileNombreL inicialNombreDoWhile = new DoWhileNombreL();
        DoWhileApellidoA inicialApellidoDoWhile = new DoWhileApellidoA();
        DoWhileNombreApellidoLA inicialNombreApellidoDoWhile = new DoWhileNombreApellidoLA();

        // Estos son los que funcan
        inicialNombreFor.inicialNombre(9, '*');
        inicialApellidoFor.inicialApellido(8, 'a');
        inicialNombreApellidoFor.metodoChat(9, "*");

        inicialNombreWhile.whileInicalNombre(7, 's');
        inicialApellidoWhile.whileApellido(6, '*');
        inicialNombreApellidoWhile.whileNombreApellidoLA(5, 'p');

        inicialNombreDoWhile.doWhileNombre(4, 'd');
        inicialApellidoDoWhile.doWhileApellido(10, 'v');
        inicialNombreApellidoDoWhile.doWhileNombreApellido(8, 'h');
    }

}
