public class DoWhileApellidoZ {
    public void InicialApellido(){
        int i=0;
        do{
            System.out.print("*");
            i++;
        }while(i<7);
        System.out.println();

        int j = 5;
        do{
            int k = 0;
            do{
                System.out.print(" ");
                k++;
            }while(k<j);
            System.out.println("*");
            j--;
        }while(j>0);
        
        int l=0;
        do{
            System.out.print("*");
            l++;
        }while(l<7);
    }
}
