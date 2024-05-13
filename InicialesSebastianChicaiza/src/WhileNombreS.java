import java.util.Scanner;

public class WhileNombreS {
    public void WhileMetodoNombreS(){
        System.out.println("Ingrese el Caracter con el que quiere formar la letra S: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int s = 0;
        int i = 0;
        while (i < 5){
            System.out.print("Ingrese el tamaño con que quiere imprimir la letra S (Debe ser de minimo 5):");
            s = sc.nextInt();
            i = s;
        }
        sc.close();
        char x ='-';
        char matriz[][] = new char [s][s];
        i = 0;
        while (i <= s-1){
            int j = 0;
            while (j <= s-1){
                matriz[i][j]=x;
                j++;
            }
            i++;
        }
        int smedio;
        if (s%2 == 0){
            smedio = s/2;
        }else{
            float sdecimal = s/2;
            int sentero = (int)sdecimal;
            smedio = sentero + 1; 
        }

        i = 0;
        while (i <= s - 1){
            matriz[0][i] = c;
            i++;
        }

        i = 1;
        while (i <= smedio - 1){
            matriz[i][0] = c;
            i++;
        }
        
        i = 1;
        while (i <= s-1){
            matriz[smedio -1][i] = c;
            i++;
        }

        i = smedio;
        while (i <= s-1){
            matriz[i][s-1] = c;
            i++;
        }
        
        i = 0;
        while (i <= s-1){
            matriz[s-1][i] = c;
            i++;
        }

        i=0;
        while (i <= s-1){
            int j=0;
            while (j<= s-1){
                System.out.print(matriz[i][j]+" ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}

