import java.util.Scanner;

public class ForApellidoC {
    public void ForMetodoApellidoC(){
        System.out.println("Ingrese el Caracter con el que quiere formar la letra C: ");
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        int s = 0;
        
        for(int i=0; i < 5;){
            System.out.print("Ingrese el tamaño con que quiere imprimir la letra C (Debe ser de minimo 5):");
            s = sc.nextInt();
            i = s;
        }
        
        sc.close();
        char x ='-';
        char matriz[][] = new char [s][s];
        
        for(int i = 0; i <= s-1; i++ ){
            for(int j = 0; j <= s-1; j++){
                matriz[i][j]=x;
            }
        }
        
        for(int i = 0; i <= s-1; i++){
            matriz[0][i]= c;
        }
        
        for(int i = 1; i <= s-1; i++){
            matriz[i][0]=c;
        }

        for(int i = 1; i <= s-1; i++){
            matriz[s-1][i] = c;
        }
        
        for(int i=0; i <= s-1; i++){
            for(int j=0; j<= s-1; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
