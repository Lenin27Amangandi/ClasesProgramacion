import java.util.Scanner;

public class DoWhileNombreApellidoSC {
    public void DoWhileMetodoNombreApellidoSC(){
        System.out.println("Ingrese el Caracter con el que quiere formar las letras SC: ");
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        int s = 0;
        
        int i;
        do {
            System.out.print("Ingrese el tamaño con que quiere imprimir las letras SC (Debe ser de minimo 5):");
            s = sc.nextInt();
            i = s;
        } while (i < 5);
        sc.close();
        int alto = s;
        int ancho = s * 2 + 1;
        char x ='-';
        char matriz[][] = new char [alto][ancho];
        
        i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j]=x;
                j++;
            } while (j < ancho);
            i++;
        } while (i < alto);

        float space1 = ancho/2;
        int space = (int)space1;

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
        } while (i < space);

        i = 1;
        do {
            matriz[i][0] = c;
            i++;
        } while (i < smedio);
        
        i = 1;
        do {
            matriz[smedio -1][i] = c;
            i++;
        } while (i < space);

        i = smedio -1;
        do {
            matriz[i][space -1] = c;
            i++;
        } while (i < alto);

        i = 0;
        do {
            matriz[alto -1][i]=c;
            i++;
        } while (i < space);

        i = space +1;
        do {
            matriz[0][i]=c;
            i++;
        } while (i < ancho);

        i = 1;
        do {
            matriz[i][space +1]=c;
            i++;
        } while (i < alto);

        i = space +1;
        do {
            matriz[alto -1][i]=c;
            i++;
        } while (i < ancho);
        
        i = 0;
        do {
            int j=0;
            do {
                System.out.print(matriz[i][j]+" ");
                j++;
            } while (j < ancho);
            System.out.println("");
            i++;
        } while (i < alto);
    }
}
