public class App {
    public static void main(String[] args) {
        // Declaramos e instanciamos las varibles en el orden de tipo for,while y do
        // while.
        ForNombreL inicialNombreFor = new ForNombreL();
        ForApellidoA inicialApellidoFor = new ForApellidoA();
        ForNombreApellidoLA inicialNombreApellidoFor = new ForNombreApellidoLA();
        WhileNombreL inicialNombreWhile = new WhileNombreL();
        WhileApellidoA inicialApellidoWhile = new WhileApellidoA();
        WhileNombreApellidoLA inicialNombreApellidoWhile = new WhileNombreApellidoLA();
        DoWhileNombreL inicialNombreDoWhile = new DoWhileNombreL();
        DoWhileApellidoA inicialApellidoDoWhile = new DoWhileApellidoA();
        DoWhileNombreApellidoLA inicialNombreApellidoDoWhile = new DoWhileNombreApellidoLA();

        // Invocamos cada metodo creado en la srespectivas clases en el orden for,while
        // y do-While
        inicialNombreFor.inicialNombre(5, '*');
        inicialApellidoFor.inicialApellido(5, '*');
        inicialNombreApellidoFor.metodoChat(5, "*");
        inicialNombreWhile.whileInicalNombre(5, '*');
        inicialApellidoWhile.whileApellido(5, '*');
        inicialNombreApellidoWhile.whileNombreApellidoLA(5, '*');
        inicialNombreDoWhile.doWhileNombre(5, '*');
        inicialApellidoDoWhile.doWhileApellido(5, '*');
        inicialNombreApellidoDoWhile.doWhileNombreApellido(5, '*');
    }
}
