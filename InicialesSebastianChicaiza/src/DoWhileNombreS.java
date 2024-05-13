import java.util.Scanner;

public class DoWhileNombreS {
    public void DoWhileMetodoNombreS(){
        System.out.println("Ingrese el Caracter con el que quiere formar la letra S: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int s = 0;
        int i;
        do {
            System.out.print("Ingrese el tamaño con que quiere imprimir la letra S (Debe ser de minimo 5):");
            s = sc.nextInt();
            i = s;
        } while (i < 5);
        sc.close();
        char x ='-';
        char matriz[][] = new char [s][s];
        i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j]=x;
                j++;
            } while (j <= s-1);
            i++;
        } while (i <= s-1);
        int smedio;
        if (s%2 == 0){
            smedio = s/2;
        }else{
            float sdecimal = s/2;
            int sentero = (int)sdecimal;
            smedio = sentero + 1; 
        }

        i = 0;
        do {
            matriz[0][i] = c;
            i++;
        } while (i <= s - 1);

        i = 1;
        do {
            matriz[i][0] = c;
            i++;
        } while (i <= smedio - 1);
        
        i = 1;
        do {
            matriz[smedio -1][i] = c;
            i++;
        } while (i <= s-1);

        i = smedio;
        do {
            matriz[i][s-1] = c;
            i++;
        } while (i <= s-1);
        
        i = 0;
        do {
            matriz[s-1][i] = c;
            i++;
        } while (i <= s-1);

        i=0;
        do {
            int j=0;
            do {
                System.out.print(matriz[i][j]+" ");
                j++;
            } while (j<= s-1);
            System.out.println("");
            i++;
        } while (i <= s-1);
    }
}
