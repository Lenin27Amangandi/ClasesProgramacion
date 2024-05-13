public class nombreApellido {

    public static void main(String[] args)throws Exception{


        inicialNombre iN;
        inicialApellido iA;
        inicialNombreApellido iAN;
        

        iN = new inicialNombre();
        iA= new inicialApellido();
        iAN = new inicialNombreApellido();
        
        
        iN.nombreFor();
        iN.nombreWhile();
        iN.nombreDoWhile();
        iA.apellidoFor();
        iA.apellidoWhile(); 
        iA.apellidoDoWhile();
        iAN.nombreApellidoFor();
        iAN.nombreApellidoWhile();
        iAN.nombreApellidoDoWhile();
    }
}