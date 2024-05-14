public class App {
    public static void main(String[] args) 
    throws Exception {

        ForNombreK fnk;
        ForApellidoP fap;
        ForNombreApellidoKP fnakp;
        
        WhileNombreK wnk;
        WhileApellidoP wap;
        WhileNombreApellidoKP wnakp;
        
        DoWhileNombreK dwnk;
        DoWhileApellidoP dwap;
        DoWhileNombreApellidoKP dwnakp;
       

        fnk = new ForNombreK();
        fap = new ForApellidoP();
        fnakp = new ForNombreApellidoKP();

        wnk = new WhileNombreK();
        wap = new WhileApellidoP();
        wnakp = new WhileNombreApellidoKP();

        dwnk = new DoWhileNombreK();
        dwap = new DoWhileApellidoP();
        dwnakp = new DoWhileNombreApellidoKP();
        
    
      
        fnk.ForNombreK();
        fap.ForApellidoP();
        
        
        wnk.WhileNombreK();
        wap.WhileApellidoP();
        

        dwnk.DoWhileNombreK();
        dwap.DoWhileApellidoP();
        
    }
}