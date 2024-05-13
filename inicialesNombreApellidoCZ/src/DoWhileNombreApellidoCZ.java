public class DoWhileNombreApellidoCZ {
    public void InicialNombreApellido(){
        
        int i= 0;
        do{
            System.out.print("*");
            i++;
        }while(i<4);
        System.out.print(" ");

        int j=0; 
        do{
            System.out.print("*");
            j++;
        }while(j<4);
        System.out.println();

        int f=0;
        int e=0;
        do{
            System.out.print("*");
            f++;
            do{
                System.out.print(" ");
                e++;
            }while(e<6);
            System.out.println("*");
        }while(f<1);

        int a=0;
        int b=0;
        do{
            System.out.print("*");
            a++;
            do{
                System.out.print(" ");
                b++;
            }while(b<5);
            System.out.println("*");
        }while(a<1);

        int k = 0;
        do{
            System.out.print("*");
            k++;
        }while(k<4);
        System.out.print(" ");
        
        int l=0; 
        do{
            System.out.print("*");
            l++;
        }while(l<4);
    }
}
